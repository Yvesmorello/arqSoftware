public class CardStrategy implements PaymentStrategy{


    @Override
    public Boolean pay(ShoppingCart cart) {
        String numeroCartao;
        String cvc;

        System.out.printf("Pagando " + cart.calculaTotal().toString() + " com cartão!");

        return true;
    }
}
