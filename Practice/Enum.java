public class Enum {
    public enum Currency {
        INR(80),
        USD(1),
        IQD(1310),
        KD(0.30);

        private double rate; // Instance variable to hold rate

        // Constructor to initialize rate for each enum constant
        Currency(double rate) {
            this.rate = rate;
        }

        // Getter method to retrieve the rate for each currency
        public double getRate() {
            return rate;
        }
    }

    public static void main(String[] args) {

        System.out.println(Currency.INR.getRate());
        System.out.println(Currency.KD.getRate());
        System.out.println(Currency.IQD.getRate());
        System.out.println(Currency.USD.getRate());
    }
}
