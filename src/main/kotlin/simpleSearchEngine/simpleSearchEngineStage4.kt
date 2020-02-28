package simpleSearchEngine


import java.io.File

fun main(args: Array<String>) {
    fun search(peopleArray: List<String>) {
        println("\nEnter a name or email to search all suitable people")
        val search = readLine().toString()

        val results: List<String> = peopleArray.filter { it.toUpperCase().contains(search.toUpperCase()) }
        if (results.isEmpty()) {
            println("No matching people found.")
        }
        results.forEach { println(it) }
    }

    fun printAll(peopleArray: List<String>) {
        println("\n=== List of people ===")
        peopleArray.forEach { println(it) }
    }

    val fileName = "C:\\Users\\tso113\\IdeaProjects\\Simple Search Engine\\Simple Search Engine\\task\\src\\" + args[1]
    val peopleList = File(fileName).readLines()

    loop@ while (true) {
        println("\n=== Menu ===")
        println("1. Find a person\n2. Print all people\n0. Exit")
        when (readLine().toString()) {
            "1" -> search(peopleList)
            "2" -> printAll(peopleList)
            "0" -> break@loop
            else -> {
                print("Incorrect option! Try again.")
            }

        }
    }
    println("Bye!")

}