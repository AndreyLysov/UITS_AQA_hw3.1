import groovy.transform.Canonical

@Canonical
class Item1 extends Product {
    float weight

    Item1(String name, double price, float weight) {
        super(name, price)
        this.weight = weight
    }

    @Override
    public String toString() {
        return """\
Item1{
    weight=$weight,
    super=${super.toString()}
}"""
    }
}
