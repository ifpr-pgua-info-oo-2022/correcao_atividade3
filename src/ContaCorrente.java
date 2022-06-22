public class ContaCorrente {
    
    //atributos
    double saldo;
    String agencia;
    String documento;
    String numeroCartao;
    String senha;
    int numeroConta;

    //parte 1
    boolean sacar(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

    boolean depositar(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            return true;
        }
        return false;
        
    }



}
