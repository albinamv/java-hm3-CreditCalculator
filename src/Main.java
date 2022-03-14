public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платёж:");

        int oneYearPayment = service.calculate(1_000_000, 1, 9.99);
        System.out.println("на 1 год — " + oneYearPayment + " руб.");

        int twoYearPayment = service.calculate(1_000_000, 2, 9.99);
        System.out.println("на 2 года — " + twoYearPayment + " руб.");

        int threeYearPayment = service.calculate(1_000_000, 3, 9.99);
        System.out.println("на 3 года — " + threeYearPayment + " руб.");
    }
}
