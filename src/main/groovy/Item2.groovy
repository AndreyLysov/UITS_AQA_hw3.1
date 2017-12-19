import groovy.transform.Canonical

@Canonical
class Item2 extends Product{
    float height

    Item2(String name, double price, float height) {
        super(name, price)
        this.height = height
    }

    @Override
    public String toString() {
        return """\
Item2{
    height=$height,
    super=${super.toString()}
}"""
    }
}
