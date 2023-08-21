public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int myCredit = service.calculate(1_000_000, 9.99, 12);
        System.out.println(myCredit);
        myCredit = service.calculate(1_000_000, 9.99, 24);
        System.out.println(myCredit);
        myCredit = service.calculate(1_000_000, 9.99, 36);
        System.out.println(myCredit);
    }
}