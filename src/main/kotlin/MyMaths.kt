import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val n1 = scanner.nextInt()
    val tot1 = n1/2 + 1 * (n1 % 2)
    val n2 = scanner.nextInt()
    val tot2 = n2/2 + 1 * (n2 % 2)
    val n3 = scanner.nextInt()
    val tot3 = n3/2 + 1 * (n3 % 2)
    val totValue = tot1 + tot2 + tot3
    println (totValue)
}
