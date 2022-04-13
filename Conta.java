
public class Conta {
    private int numero;
    private double saldo;
    
    public Conta()
    {
        System.out.println("Conta");
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public int getNumero()
    {
        return numero;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void credito(double valor)
    {
        this.saldo += valor;
    }

    public void debito(double valor)
    {
        this.saldo -= valor;
    }

    public void status()
    {
        System.out.println("Numero da conta: " + this.numero);
        System.out.println("Saldo da conta: " + this.saldo);
    }

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
        
    }
}
