import groovy.transform.Canonical

@Canonical
abstract class Product {
    String name
    double price


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
