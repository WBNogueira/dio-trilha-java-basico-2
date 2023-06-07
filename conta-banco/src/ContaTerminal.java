import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner
        
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário e obter pela classe scanner os valores digitados no terminal
        System.out.print("Por favor, digite o número da conta! ");
        int numero = sc.nextInt();
        System.out.print("Por favor, digite o número da Agência! ");
        String agencia = sc.next();
        System.out.print("Por favor, digite o nome do cliente! ");
        String nomeCliente = sc.next();
        System.out.print("Por favor, digite o saldo da conta! ");
        Double saldo = sc.nextDouble();

        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
