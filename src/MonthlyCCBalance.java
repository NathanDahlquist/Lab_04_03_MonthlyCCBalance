public class MonthlyCCBalance {
    public static void main(String[] args) {
        double cardBalance = 5000;
        final double INTEREST_RATE = 0.17;
        double month1Due;
        double month2Due;

        month1Due = cardBalance * INTEREST_RATE;
        month2Due = (month1Due + cardBalance) * INTEREST_RATE;

        System.out.println("The amount owed after one month is " + month1Due);
        System.out.println("The amount owed after two months is " + month2Due);
    }
}
