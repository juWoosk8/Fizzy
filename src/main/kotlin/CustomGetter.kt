fun main() {
    val smartOne = Smartphone("Ericsong")
    println("here1 " + smartOne.price)
    smartOne.price = -24
    println("here2 " + smartOne.price)
    val smartTwo = Smartphone("iNokhe")
    print(smartTwo.price - smartOne.price)
}

class Smartphone(val name: String) {
    var price: Int = -5
        get() = name.length - field
}