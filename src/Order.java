import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Покупатель = " + customer + "; Корзина = " + Arrays.toString(basket);
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) {
            return false;
        }
        Order order = (Order) ob;
        if (basket == null || order.basket == null) {
            return false;
        }
        if (basket == null && order.basket == null) {
            return true;
        }
        if (basket.length != order.basket.length) {
            return false;
        }

        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null && order.basket[i] == null) {
                return false;
            }
        }
        return Objects.equals(customer, order.customer) && basket.equals(order.basket);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customer, Arrays.hashCode(basket));
    }
}