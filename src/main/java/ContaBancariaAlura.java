import javax.swing.*;
import java.util.Scanner;

public class ContaBancariaAlura {
    public static void main(String[] args) {

        //dados da conta
        String nome = "Julia Batista Canalle";
        String tipoDeConta = "corrente";
        int saldoInicial = 5000;

        //mensagem de entrada no banco
        String mensagem = """
                Olá, %s!
                Seja bem-vindo ao banco Itaú!
                
                Obrigado por abrir uma conta %s conosco!
                
                Seu saldo inicial é de $%d.
                
                Tenha um bom dia!
                
                """.formatted(nome, tipoDeConta, saldoInicial);

        System.out.println(mensagem);

        //opções do menu
        int consultaSaldo = 1;
        int recebeValor = 2;
        int transfereValor = 3;
        int sair = 4;

        String menu = """
                Por gentileza, informe qual operação deseja realizar:
            
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;

        //variaveis para conseguir executar o menu
        int saldoAtualizado = 0;
        int saldoAtual = saldoInicial + saldoAtualizado;


        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
//
        while (opcao <= 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é: " + saldoAtual + " reais.");
                System.exit(0);
            } else if (opcao == 2) {
                System.out.println("Qual valor você deseja receber?");
                int valorRecebido = scanner.nextInt();
                System.out.println("Certo, sua transferência para recebimento foi solicitada e seu saldo atual é de: " + (valorRecebido + saldoAtual) + ".");
                System.exit(0);
            } else if (opcao == 3) {
                System.out.println("Qual valor você deseja transferir?");
                int valorTransferencia = scanner.nextInt();
                if (valorTransferencia > saldoAtual) {
                    System.out.println("Seu saldo é insuficiente para realizar a transferência.");
                    System.exit(0);
                } else {
                    System.out.println("Certo, sua transferência foi solicitada e seu saldo atual é de: " + (saldoAtual - valorTransferencia) + ".");
                    System.exit(0);
                }
            } else if (opcao == 4) {
                System.out.println("Ok, menu encerrado!");
                System.exit(0);
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
       }






    }
}
