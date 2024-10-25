import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner opcaoCliente = new Scanner(System.in);
        Scanner valores = new Scanner(System.in);

        String nomeCliente = "David Botelho";
        String tipoConta = "Corrente";
        double saldoConta = 2500;
        int opcao = 5;
        double valorReceber = 0;
        double valorEnviar = 0;

        System.out.printf("""
                ****************************************
                Dados iniciais do cliente:
                
                Nome:          %s
                Tipo de conta: %s
                Saldo inicial: R$%.2f
                
                ****************************************
                
                """, nomeCliente, tipoConta, saldoConta);

        while (opcao != 4) {
            System.out.println("""
                    \nOperações:
                    
                    1- Consultar saldo
                    2- Receber valor
                    3- Tranferir valor
                    4- Sair
                    
                    Digite a opção desejada:""");
            opcao = opcaoCliente.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("\nO seu saldo é de R$%.2f. \n", saldoConta);
                    break;
                case 2:
                    System.out.println("\nQuanto você desejar depositar? ");
                    valorReceber = valores.nextInt();
                    saldoConta += valorReceber;
                    System.out.printf("""
                            Mais R$%.2f na conta pae! XD
                            Saldo atualizado: R$%.2f. \n""", valorReceber, saldoConta);
                    break;
                case 3:
                    System.out.println("\nQuanto você deseja transferir? ");
                    valorEnviar = valores.nextInt();
                    if (valorEnviar <= saldoConta) {
                        saldoConta -= valorEnviar;

                        System.out.printf("""
                                Menos R$%.2f na conta pae! :(
                                Saldo atualizado: R$%.2f
                                """, valorEnviar, saldoConta);
                    } else {
                        System.out.println("""
                                Não foi possivel realizar a transferencia.
                                Motivo: Saldo insuficiente.""");
                    }
                    break;
                case 4:
                    System.out.println("\nTchau, Tchau!");
                    break;
            }
        }
    }
}