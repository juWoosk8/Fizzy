import java.io.File

fun main() {
    val fileName = "src/words_sequence.txt"
    val count = File(fileName).readLines().map { it.length }.max()
    println(count)

}