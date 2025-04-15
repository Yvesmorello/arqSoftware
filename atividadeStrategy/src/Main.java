import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ShoppingCart shoppingCart = new ShoppingCart();
        Item item = new Item("Xbox", 200.00);
        shoppingCart.addItem(item);
        Item item2 = new Item("PS5", 500.00);
        shoppingCart.addItem(item2);
        Item item3 = new Item("Pc", 400.00);
        shoppingCart.addItem(item3);

        System.out.println("Enter payment type: ");
        String payment = scanner.nextLine();

       Boolean success = shoppingCart.pay(PaymentFactory.createStrategy(payment));

       if(success){
           System.out.printf("Pagamento efetuado!");
       }
    }
}