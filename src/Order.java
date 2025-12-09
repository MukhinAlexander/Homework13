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
        if (this == ob) return true; //проверка на то, что ссылки ссылаются на один и тот же объект
        if (ob == null || getClass() != ob.getClass()) { // проверка на то, что объекта нет, или объекты разных классов
            return false;
        }
        Order order = (Order) ob; // приведение объектов к одному типу
        if (!Objects.equals(customer, order.customer)) { // если покупатель один и тот же, то вернуть НЕ true, то есть false,
            return false;                                // чтобы продолжить сравнивать объекты
        }

        if (basket.length != order.basket.length) {      // проверка на равенство длины массивов(второго параметра)
            return false;

        }if (basket == null || order.basket == null) {    // если только один из вторых из параметров объекта Order null, выводим false
            return false;
        }
        if (basket == null && order.basket == null) {    // если у обоих объектов второй параметр null, то они равны
            return true;
        }

        for (int i = 0; i < basket.length; i++) {                   //пробегаемся по всем элементам массива
            if (basket[i] == null && order.basket[i] != null) {     //если элемент первого массива null, а элемент второго НЕ null,
                return false;                                       //то вываливаем false, чтобы пройтись по всем элементам массивов обоих объектов
            }                                                       //чтобы затем их сравнить equal'ом
            if (!basket[i].equals(order.basket[i])) {
                return false;                                       //если убрать НЕ в условии и выводить true, если элементы,
            }                                                       //то метод не проверит полностью массив
        }
        return true;
    }
    @Override
    public int hashCode() {
        return Objects.hash(customer, Arrays.hashCode(basket));
    }
}