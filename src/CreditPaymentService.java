public class CreditPaymentService {
    public int calculate(int sum, double percent, int month) {
        double coefficient = percent / 100 / 12;
        double monthly = coefficient + (coefficient / (Math.pow((1 + coefficient), month) - 1));
        double annuityPaymentDouble = sum * monthly;
        int annuityPaymentInt = (int) annuityPaymentDouble;
        return annuityPaymentInt;
    }
}
