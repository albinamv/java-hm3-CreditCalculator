public class CreditPaymentService {
    public int calculate (int creditAmount, int term, double rate) {
        double monthRate = rate / 100 / 12;
        int paymentsNum = term * 12;
        int result = (int) (creditAmount * monthRate * Math.pow(monthRate+1, paymentsNum) / (Math.pow(monthRate+1, paymentsNum) - 1));
        return result;
    }
}
