public class Conta {
    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo;

    public void depositar(double valor){
        this.saldo += valor;
    }
    /*
    * Gets methods
    * */
    public int getAgencia(){
        return this.agencia;
    }
    public int getNumero(){
        return this.numero;
    }
    public Cliente getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }

    /*
    * Sets methods
    * */
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    /*
    * Methods
    * */
    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        else {
            return false;
        }
    }

    public void transferir(double valor, Conta pessoa){
        boolean flagSacar = this.sacar(valor);
        if(flagSacar){
            pessoa.depositar(valor);
        }
    }
}
