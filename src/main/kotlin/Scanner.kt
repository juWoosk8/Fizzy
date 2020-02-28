import java.util.Scanner
import kotlin.reflect.typeOf

class Point3D {
    var x: Int = 0
    var y: Int = 0
    var z: Int = 0
}
fun main() {
    val scanner = Scanner(System.`in`)
    println("Write how many ml of water the coffee machine has: ")
    val waterAvail = scanner.nextInt()
    println("Write how many ml of milk the coffee machine has: ")
    val milkAvail = scanner.nextInt()
    println("Write how many grams of coffee beans the coffee machine has: ")
    val coffeeAvail = scanner.nextInt()
    println("Write how many cups of coffee you will need: ")
    val howMany = scanner.nextInt()

    val waterCanDo = waterAvail / 200
    val milkCanDo = milkAvail / 50
    val coffeeCanDo = coffeeAvail / 15
    val iCanDo = minOf(waterCanDo, milkCanDo, coffeeCanDo)

    if (howMany == iCanDo){
        println("Yes, I can make that amount of coffee")
    } else if (howMany < iCanDo){
        println("Yes, I can make that amount of coffee (and even ${iCanDo - howMany} more than that")
    } else {
        println("No, I can make only $iCanDo cups of coffee")
    }
    fun createPoint(x: Int, y: Int, z: Int): Point3D {
        val points = Point3D()
        points.x = x
        points.y = y
        points.z = z
        return points
    }
}
