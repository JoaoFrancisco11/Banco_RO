public class ContaCorrente extends Conta{
    private double Tax = 2;

    public ContaCorrente(int agencia, int numero, Cliente titular){
        super(agencia, numero, titular);
    }

    @Override
    public boolean sacar(double valor){
        double novoValor = valor + Tax;
        return super.sacar(novoValor);
    }

}
