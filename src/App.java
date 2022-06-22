import java.util.Scanner;

public class App {

    public static String menuConta(){
        String str="";
        
        str = str + "1 - Criar conta\n";
        str = str + "2 - Depositar\n";
        str = str + "3 - Sacar\n";
        str = str + "4 - Ver dados\n";
        str = str + "0 - Sair\n";

        return str;
    }



    public static void main(String[] args) throws Exception {
        ContaCorrente conta=null;

        Scanner scan = new Scanner(System.in);
        int opcao;

        int numeroDaConta; 
        String numeroCartao;
        String agencia;
        String documento; 
        String senha; 
        double saldo,valor;

        do{
            String menu  = menuConta();
            System.out.println(menu);
            opcao = scan.nextInt();
            scan.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Digite o número da conta:");
                    numeroDaConta = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite a agência:");
                    agencia = scan.nextLine();
                    System.out.println("Digite o documento:");
                    documento = scan.nextLine();
                    System.out.println("Digite o número do cartão:");
                    numeroCartao = scan.nextLine();
                    
                    System.out.println("Digite a senha:");
                    senha = scan.nextLine();
                    System.out.println("Digite o saldo:");
                    saldo = scan.nextDouble();
                    
                    conta = new ContaCorrente();

                    conta.numeroConta = numeroDaConta;
                    conta.agencia = agencia;
                    conta.documento = documento;
                    conta.numeroCartao = numeroCartao;
                    conta.senha = senha;
                    conta.saldo = saldo;


                    System.out.println("Conta criada!!");
                break;
                case 2:
                    System.out.println("Depositar!");
                    if(conta != null){
                        System.out.println("Digite um valor:");
                        valor = scan.nextDouble();
                        if(conta.depositar(valor)){
                            System.out.println("Realizado!");
                        }else{
                            System.out.println("Não Realizado! Valor insuficiente!");
                        }
                        
                    }else{
                        System.out.println("Não permitido! Crie uma conta!");
                    }
                break;

                case 3:
                    System.out.println("Sacar!");
                    if(conta != null){
                        System.out.println("Digite um valor:");
                        valor = scan.nextDouble();
                        if(conta.sacar(valor)){
                            System.out.println("Realizado!");
                        }else{
                            System.out.println("Não realizado! Valor inválido ou insuficiente!");
                        }
                        
                    }else{
                        System.out.println("Não permitido! Crie uma conta!");
                    }
                break;
                case 4:
                    System.out.println("Extrato!");
                    if(conta != null){
                        System.out.println("Número da Conta:"+conta.numeroConta);
                        System.out.println("Saldo:"+conta.saldo);
                    }else{
                        System.out.println("Não existe conta criada!");
                    }
                    
                break;
            }


        }while(opcao != 0);



    }
}

