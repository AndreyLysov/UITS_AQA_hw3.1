import groovy.transform.Canonical

@Canonical
class Container {
    List<Product> productList

    Container() {
        this.productList = []
    }

    void add(Product item) {
        productList.add(item)
    }

    double average() {
        return productList.sum(Product.price) / productList.size()
    }

    int count() {
        return productList.size()
    }

    Product getProduct(int index) {
        productList.get(index)
    }

    void sortByPrice() {
        productList.sort{it.price}
    }

    void printContainer() {
        productList.each {println it}
    }
}
