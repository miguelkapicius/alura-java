import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        double balance = 2500.0;

        System.out.printf("""
            ************************************
            Dados iniciais do cliente: 

            Nome: Miguel Kapicius
            Tipo de Conta: Corrente
            Saldo inicial: R$ %.2f
            ************************************
                """, balance);


        while (option != 4) {
            System.out.println("""
                Operações:

                1- Consultar Saldo
                2- Receber Valor
                3- Transferir Valor
                4- Sair

                Digite a opção desejada:
                    """);
            
            option = scanner.nextInt();

            if(option == 1) {
                System.out.println("Seu saldo é: " + balance);
            } else if(option == 2) {
                System.out.println("Digite o valor para receber:");
                double amountReceived = 0;
                amountReceived = scanner.nextDouble();
                balance += amountReceived;
            } else if(option == 3) {
                System.out.println("Digite o valor para enviar:");
                double amountInvited = 0;
                amountInvited = scanner.nextDouble();

                if (amountInvited > balance) {
                    System.out.println("Não há saldo suficiente!");
                }
                balance -= amountInvited;
                
            }
        }
    }
}
