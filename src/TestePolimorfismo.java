public class TestePolimorfismo {
    public static void main(String[] args) {
        Cliente cliente  = new Cliente("João", "12345678996");
        ContaCorrente cc = new ContaCorrente(5643, 10032, cliente);
        ContaPoupanca cp = new ContaPoupanca(5634, 8721, cliente);

        cc.depositar(1000);
        cp.depositar(1000);

        cc.sacar(100);
        cc.sacar(1000);

        System.out.println("Saldo da conta corrente: " + cc.getSaldo());
        System.out.println("Saldo da conta poupança: " + cp.getSaldo());

    }
}
