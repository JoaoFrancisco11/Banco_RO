public class TesteEncapsulamento {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(1000);
        conta.sacar(950);

        System.out.println(conta.saldo);

    }

}
