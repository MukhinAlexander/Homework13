import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket){
        this.customer = customer;
        this.basket = basket;
    }
    @Override
    public String toString(){
        return "Покупатель = " + customer + "; Корзина = " + Arrays.toString(basket);
    }

    @Override
    public boolean equals(Object ob){
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()){
            return false;
        }
        Order order = (Order) ob;
        return Objects.equals(customer, order.customer) && Arrays.equals(basket, order.basket);

    }
}
