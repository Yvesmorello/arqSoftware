public class PayPalStrategy implements PaymentStrategy {
    @Override
    public Boolean pay(ShoppingCart cart) {
        String login;
        String password;

        System.out.printf("Pagando " + cart.calculaTotal().toString() + " com PayPal!");

        return true;
    }
}
