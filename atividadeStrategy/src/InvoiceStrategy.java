import java.util.Date;

public class InvoiceStrategy implements PaymentStrategy{
    @Override
    public Boolean pay(ShoppingCart cart) {
        String barCode;
        Date vencimento;

        System.out.printf("Pagando " + cart.calculaTotal().toString() + " com boleto!");

        return true;
    }
}
