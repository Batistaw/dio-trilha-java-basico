import java.util.Scanner;
  
public class ContaTerminal {
  public static void main (String [] args ) {
    double saldo = 500.50; 
    Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, digite seu nome:"); 
        String nomeCliente = scanner.next(); 
        System.out.println("Por favor, digite o numero da agencia:"); 
        String numeroAgencia = scanner.next();
        System.out.println("Por favor, digite o numero da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência "+ numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque\".");
    
  }

}