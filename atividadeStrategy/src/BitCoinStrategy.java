public class BitCoinStrategy implements PaymentStrategy{
    @Override
    public Boolean pay(ShoppingCart cart) {
        String hash;
        String carteira;

        System.out.printf("Pagando " + cart.calculaTotal().toString() + " com bitcoin!");

        return true;
    }
}
