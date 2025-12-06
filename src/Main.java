
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

    }
}