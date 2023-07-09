public class TesteHeranca {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "1234568996");
        ContaPoupanca cp = new ContaPoupanca(1298, 8375, cliente);
        cp.depositar(5000);
        cp.sacar(250);
        System.out.println("O saldo da conta poupança de " + cp.getTitular().getNome() + " é: "+cp.getSaldo());

        ContaCorrente cc = new ContaCorrente(1298, 8734, cliente);
        cc.depositar(1000);
        cc.sacar(233.76);
        System.out.println("O saldo da conta corrente de " + cc.getTitular().getNome() +" é: " + cc.getSaldo());
    }
}
