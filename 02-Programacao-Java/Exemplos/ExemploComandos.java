   import java.util.Scanner;
    public class ExemploComandos {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            System.out.println("=== BEM-VINDO AO SISTEMA DE NOTAS E FALTAS ===");
            System.out.print("\nQuantas notas o aluno possui? ");
            int quantidadeNotas = entrada.nextInt();
            if (quantidadeNotas <= 0) {
                System.out.println("Erro: A quantidade de notas deve ser maior que zero!");
                return;
            }
            double[] notas = new double[quantidadeNotas];
            double somaNotas = 0.0;
            System.out.println("\n--- Cadastro de Notas ---");
            for (int i = 0; i < notas.length; i++) {
                System.out.printf("Digite a nota %d: ", (i + 1));
                notas[i] = entrada.nextDouble();
                entrada.nextLine();
                somaNotas = somaNotas + notas[i];
            }
            double media = somaNotas / quantidadeNotas;
            System.out.printf("\nA media final do aluno e: %.2f\n", media);
            System.out.println("\n--- Status de Aprovacao ---");
            boolean aprovadoPorNota;
            if (media >= 7.0) {
                System.out.println("Desempenho: Aluno APROVADO por media.");
                aprovadoPorNota = true;
            } else if (media<7.0 && media >= 2.0) {
                System.out.println("Desempenho: Aluno em EXAME FINAL.");
                aprovadoPorNota = false;
            } else {
                System.out.println("Desempenho: Aluno REPROVADO DIRETO por nota.");
                aprovadoPorNota = false;
            }
            System.out.println("\n--- Avaliacao Qualitativa da Media ---");
            // Convertendo a media para inteiro apenas para demonstrar o uso classico do switch
            int mediaInteira = (int) media;

            String avaliacao = switch (mediaInteira) {
                case 10, 9 -> "Excelente (Desempenho excepcional!)";
                case 8, 7  -> "Bom (Bom trabalho!)";
                case 6, 5  -> "Regular (Atingiu o minimo esperado.)";
                case 4, 3  -> "Ruim (Precisa estudar muito mais.)";
                case 2, 1, 0 -> "Critico (Desempenho insatisfatorio.)";
                default -> {
                    // Caso precise de logica extra em um case, usamos blocos com 'yield'
                    yield "Media fora da escala esperada (0 a 10).";
                }
            };

            System.out.println("\n--- Historico de Notas Lancadas ---");
            System.out.println("Verificando notas individuais acima da media da turma...");

            for (double notaAtual : notas) {
                // Usando operador de igualdade (==) e relacional (>)
                if (notaAtual == 10.0) {
                    System.out.println("-> Nota " + notaAtual + " (Nota Maxima - Parabens!)");
                } else if (notaAtual > media) {
                    System.out.println("-> Nota " + notaAtual + " (Acima da media geral)");
                } else {
                    System.out.println("-> Nota " + notaAtual + " (Abaixo ou na media geral)");
                }
            }

            // Boa pratica: Fechar o scanner para liberar recursos
            entrada.close();
            System.out.println("\n=== PROGRAMA ENCERRADO ===");
        }
} 
