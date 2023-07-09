public class TesteNull {
    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println(conta.agencia);
        System.out.print(conta.numero);
        System.out.println(conta.saldo);
        System.out.println(conta.titular);

        /*
        conta.titular.nome = "Pedro Henrique";
        System.out.println("O nome do titular da conta é: " + conta.titular.nome);
        o código acima gera o seguinte erro: Cannot assign field "nome" because "conta.titular" is null
        at TesteNull.main(TesteNull.java:9). Isso deve-se ao fato que não foi criado nenhum objeto do tipo cliente, portanto
        não tem como acessar algo que não foi criado. Para resolver tao problema, é necessário instanciar um objeto cliente.
        */

        conta.titular = new Cliente(); /*Classe Cliente instanciada, portanto pode-se acessar/inserir os atributos da classe*/
        conta.titular.nome = "Pedro Henrique";
        System.out.println(conta.titular.nome);


    }
}
