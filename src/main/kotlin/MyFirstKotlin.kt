fun main() {
    println("Starting to make a coffee")
    println("Grinding coffee beans")
    println("Boiling water")
    println("Mixing boiled water with crushed coffee beans")
    println("Pouring coffee into the cup")
    println("Pouring some milk into the cup")
    println( "Coffee is ready!")
    println("08:00 You have one billion dollars")
    println("08:30 You have two thousand dollars")
    println("09:10 You have no dollars!")
    var s1 = "kotlin"
    var s2 = "java"
    var s3 = "scala"
    s3 = s1
    s1 = s2
    s2 = s3
    println(s2)
    val result = println("text")
    println(result) // kotlin.Unit
    val name = readLine()!!
    println("Your name is $name")
}