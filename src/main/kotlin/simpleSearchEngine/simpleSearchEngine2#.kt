package simpleSearchEngine

fun main() {

    println("Enter the number of people:")
    val totalInputLines = readLine().toString().toInt()

    println("Enter all people:")
    val peopleArray = Array(totalInputLines) { readLine().toString() }

    println("\nEnter the number of search queries:")

    repeat(readLine().toString().toInt()) {
        println("\nEnter data to search people:")
        val search = readLine().toString()

        var results: List<String> = peopleArray.filter { it.toUpperCase().contains(search.toUpperCase()) }
        if (results.isEmpty()) {
            println("No matching people found.")
        } else {
            println("Found people:")
        }
        results.forEach { println(it) }
    }

}