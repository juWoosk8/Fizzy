package simpleSearchEngine


fun main() {
    fun search(peopleArray: Array<String>) {
        println("\nEnter a name or email to search all suitable people")
        val search = readLine().toString()

        var results: List<String> = peopleArray.filter { it.toUpperCase().contains(search.toUpperCase()) }
        if (results.isEmpty()) {
            println("No matching people found.")
        }
        results.forEach { println(it) }
    }

    fun printAll(peopleArray: Array<String>) {
        println("=== List of people ===")
        peopleArray.forEach { println(it) }
    }

    println("Enter the number of people:")
    val totalInputLines = readLine().toString().toInt()

    println("Enter all people:")
    val peopleArray = Array(totalInputLines) { readLine().toString() }

    loop@ while (true) {
        println("\n=== Menu ===")
        println("1. Find a person\n2. Print all people\n0. Exit")
        when (readLine().toString()) {
            "1" -> search(peopleArray)
            "2" -> printAll(peopleArray)
            "0" -> break@loop
            else -> {
                print("Incorrect option! Try again.")
            }

        }
    }
    println("Bye!")


}