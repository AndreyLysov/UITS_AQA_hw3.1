Container container = new Container()

while (true) {
    println "Please enter parameters of item1 - <name> <price> <weight>"
    def item1 = System.in.newReader().readLine().split(" ")

    container.add([item1[0],
            item1[1].toDouble(),
            item1[2].toFloat()] as Item1)

    println "Do you want to add one more item1? (y/n)"
    if (System.in.newReader().readLine() == 'y')
        break
}

while (true) {
    println "Please enter parameters of item2 - <name> <price> <height>"
    def item2 = System.in.newReader().readLine().split(" ")

    container.add([item2[0],
                   item2[1].toDouble(),
                   item2[2].toFloat()] as Item2)
    println "Do you want to add one more item1? (y/n)"
    if (System.in.newReader().readLine() == 'y')
        break
}

container.printContainer()
container.sortByPrice()
println "======================================================================================="
container.printContainer()