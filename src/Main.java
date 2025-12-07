
public class Main {
    public static void main(String[] args) {

    Product product1 = new Product(1, "Java. 12-е издание", 100, "Книги");
    Product product2 = new Product(2, "Бабушкины рецепты", 150, "Книги");
    Product product3 = new Product(3, "Ручка-перо", 200, "Письмменные принадлежности");
    Product product4 = new Product(1, "Java. 12-е издание", 100, "Книги");

    System.out.println(product1);
    System.out.println(product2);
    System.out.println(product3);
    System.out.println(product4);

    System.out.println(product1.equals(product2));
    System.out.println(product3.equals(product4));
    System.out.println(product1.equals(product4));

    Product[] products1 = {product2, product3};
    Product[] products2 = {product1, product3};
    Product[] products3 = {product3, product4};

    Order order1 = new Order("Покупатель1", products1);
    System.out.println(order1);
    Order order2 = new Order("Покупатель2", products2);
    Order order3 = new Order("Покупатель3", products3);
    Order order4 = new Order("Покупатель1", products1);

    System.out.println(order1);
    System.out.println(order2);
    System.out.println(order1.equals(order2));

    System.out.println(order2);
    System.out.println(order2.equals(order2));

    System.out.println(order3);
    System.out.println(order1);
    System.out.println(order3.equals(order1));

    System.out.println(order1);
    System.out.println(order4);
    System.out.println(order1.equals(order4));



    }
}