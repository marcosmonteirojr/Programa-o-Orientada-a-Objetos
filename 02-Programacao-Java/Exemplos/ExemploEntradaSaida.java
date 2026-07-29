import java . util . Scanner ; // 1. Importacao necessaria
public class ExemploEntradaSaida {
  public static void main ( String [] args ) {
    // 2. Instanciando o Scanner
    Scanner teclado = new Scanner ( System .in);
    System .out. println (" Qual e o seu nome ?");
    String nome = teclado . nextLine (); // Le a linha digitada
    // --- SAIDA E ENTRADA DE NUMERO INTEIRO ---
    System .out. println (" Quantos anos voce tem ?");
    int idade = teclado . nextInt (); // Le o numero digitado
    // --- SAIDA E ENTRADA DE NUMERO DECIMAL ---
    System .out. println (" Qual e a sua altura ?");
    double altura = teclado . nextDouble (); // Le o decimal
    digitado
    // --- SAIDA FINAL FORMATADA ---
    System .out. println ("\n--- Resumo dos Dados ---");
    System .out. println (" Nome : " + nome );
    System .out. println (" Idade : " + idade + " anos ");
    System .out. println (" Altura : " + altura + "m");
    // 3. Boa pratica : fechar o Scanner ao final do uso
    teclado . close ();
  }
}
