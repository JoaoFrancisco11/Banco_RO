// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TesteMetodoReferencia {
    public static void main(String[] args) {

        Conta joao = new Conta();
        joao.depositar(1000);

        Conta fernando = new Conta();

        System.out.println("Saldo João: " + joao.saldo);

        joao.transferir(250, fernando);

        System.out.println("Saldo de João: " + joao.saldo);
        System.out.print("Saldo de Fernando: " + fernando.saldo);

    }
}