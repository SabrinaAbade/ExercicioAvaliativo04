public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(1001, "Ana Silva", 500.0);
        System.out.printf("Saldo inicial (c1): R$%.2f%n", c1.getSaldo());

        c1.depositar(150.0);
        System.out.printf("Após depósito de R$150: R$%.2f%n", c1.getSaldo());

        boolean sucesso1 = c1.sacar(700.0);
        System.out.printf("Tentativa de saque de R$700: %s%n", sucesso1 ? "sucesso" : "falha");
        System.out.printf("Saldo final (c1): R$%.2f%n%n", c1.getSaldo());

        ContaBancaria c2 = new ContaBancaria(1002, "Carlos Mendes", 300.0);
        System.out.printf("Saldo inicial (c2): R$%.2f%n", c2.getSaldo());

        c2.depositar(200.0);
        System.out.printf("Após depósito de R$200: R$%.2f%n", c2.getSaldo());

        boolean sucesso2 = c2.sacar(100.0);
        System.out.printf("Tentativa de saque de R$100: %s%n", sucesso2 ? "sucesso" : "falha");
        System.out.printf("Saldo final (c2): R$%.2f%n", c2.getSaldo());
    }
}
