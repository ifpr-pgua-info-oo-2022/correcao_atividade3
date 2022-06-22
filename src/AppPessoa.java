import java.util.Scanner;

public class AppPessoa {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Pessoa pessoa = null;

        int opcao;
        String nome,cpf;
        int idade;
        double salario;

        do{
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Mostrar");
            System.out.println("0 - Sair");
            opcao = scan.nextInt();
            scan.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Cadastrar Pessoa!");
                    System.out.println("Digite o nome:");
                    nome = scan.nextLine();
                    System.out.println("Digite o cpf:");
                    cpf = scan.nextLine();
                    System.out.println("Digite a idade:");
                    idade = scan.nextInt();
                    System.out.println("Digite o salario:");
                    salario = scan.nextDouble();

                    pessoa = new Pessoa();
                    

                    pessoa.nome = nome;
                    pessoa.cpf = cpf;
                    pessoa.idade = idade;
                    pessoa.salario = salario;

                    System.out.println("Pessoa cadastrada!");
                break;
                case 2:
                    System.out.println("Mostrar Dados");
                    if(pessoa != null){
                        System.out.println("Nome:"+pessoa.nome);
                        System.out.println("Cpf:"+pessoa.cpf);
                        System.out.println("Idade:"+pessoa.idade);
                        System.out.println("Salario:"+pessoa.salario);    
                    }else{
                        System.out.println("Pessoa não cadastrada!");
                    }
                break;
            }

            /*if(opcao == 1){

            }else if(opcao == 2){

            } */


        }while(opcao != 0);
        System.out.println("Terminou!");
    }

}
