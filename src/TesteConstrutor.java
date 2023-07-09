public class TesteConstrutor {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("12345678987", "João Francisco");
        Conta conta = new Conta(2370, 10025, cliente);


        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
        System.out.println(conta.getTitular().getNome());
    }

}
