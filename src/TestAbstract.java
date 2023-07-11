public class TestAbstract {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Francisco", "12345678996");
        ContaCorrente cc = new ContaCorrente(1932, 3521, cliente);
        ContaPoupanca cp = new ContaPoupanca(1932, 3522, cliente);

        cc.gerarExtrato();
        cp.gerarExtrato();

    }
}
