public class Conta {
    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo;

    /*
    * Constructor
    * */
    public Conta(int agencia, int numero, Cliente titular){
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }


    public void depositar(double valor){
        this.saldo += valor;
    }
    /*
    * Gets methods-
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

    public void transferir(double valor, Conta destino){
        boolean flagSacar = this.sacar(valor);
        if(flagSacar){
            destino.depositar(valor);
        }
    }
}
