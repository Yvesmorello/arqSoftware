public class PaymentFactory {

    public static PaymentStrategy createStrategy(String paymentType) {
        PaymentStrategy paymentStrategy = null;

        switch (paymentType) {
            case "Card":
                paymentStrategy = new CardStrategy();
                break;
            case "BitCoin":
                paymentStrategy = new BitCoinStrategy();
                break;
            case "Boleto":
                paymentStrategy = new InvoiceStrategy();
                break;
            case "PayPal":
                paymentStrategy = new PayPalStrategy();
        }

        return paymentStrategy;

    }
}
