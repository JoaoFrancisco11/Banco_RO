/*
public class TesteEncapsulamento {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("João Francisco");
        cliente.setCpf("12345678987");
        cliente.setProfissao("Desenvolvedor");
        cliente.setSalario(1000);

        Conta conta = new Conta(100,258,new Cliente());
        conta.setTitular(cliente);

        System.out.println(conta.getTitular().getNome());

        conta.depositar(1000);
        conta.sacar(950);


    }

}
*/