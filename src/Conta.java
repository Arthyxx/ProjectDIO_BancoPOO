import java.util.Scanner;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected double fatura;
    protected double valorCompra;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDesino) {
        this.sacar(valor);
        contaDesino.depositar(valor);
    }

    @Override
    public void pagarFatura() {
        if (this.saldo < this.fatura){
            System.out.println("Saldo insuficiente para pagar a fatura.");
            return;
        }
        this.saldo -= this.fatura;
        this.fatura = 0.00;
        System.out.println("Fatura paga!");
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
    }

    public void imprimirFatura(){
        System.out.println("=== FATURA ===");
        System.out.println(String.format("Fatura a pagar: %.2f", this.fatura));
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
    }

    public void comprar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor da compra? ");
        this.valorCompra = sc.nextDouble();
        mandarFatura();
    }
    public void mandarFatura(){
        this.fatura += this.valorCompra;
    }

}
