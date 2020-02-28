import java.io.File

fun main() {

    val lines = File("src/text.txt")
        .readText()
        .split(' ')
        .size

    println(lines)

}