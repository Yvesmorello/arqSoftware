import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart{

   private List<Item> itens = new ArrayList<Item>();

   public void addItem(Item item){
       this.itens.add(item);
   }

   public void removeItem(Item item){
       this.itens.remove(item);
   }

   public Double calculaTotal(){
       Double total = 0.0;

        for(Item item : this.itens){
            total += item.getPreco();
        }
       return total;
   }

   public Boolean pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(this);
        return true;
   }

}
