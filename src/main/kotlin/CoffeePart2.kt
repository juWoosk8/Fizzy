import java.util.Scanner

fun main() {
    println("Write how many cups of coffee you will need: ")
    val result = readLine()
    println("For $result cups of coffee you will need:")
    if (result != null) {
        println((result.toInt() * 200).toString() + " ml of water")
    }
    val scanner = Scanner(System.`in`)
    val string = scanner.next()
    val n = scanner.nextInt()
    println("Symbol # ${n.toString()} of the string \"$string\" is '${string[n]}'")
}