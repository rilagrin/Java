public class Teste {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.setNumero(1);
        minhaConta.setSaldo(5000.00);
        System.out.println("Teste numero: " + minhaConta.getNumero());
        System.out.println("Teste saldo: " + minhaConta.getSaldo());
        minhaConta.credito(1000.00);
        minhaConta.status();
        minhaConta.debito(500.00);
        minhaConta.status();
        Conta minhaConta2 = new Conta(2,6000.00);
        Conta.contador();
    }
}
