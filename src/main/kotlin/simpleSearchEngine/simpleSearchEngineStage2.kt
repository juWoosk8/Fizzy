package simpleSearchEngine

fun matchWord(line1: String, searchWord: String): String {
//    val listOfStrings = line1
//        .toUpperCase()
//        .split(" ")

    return if (line1.toUpperCase().contains(searchWord.toUpperCase())) {
        line1
    } else {
        "Not found"
    }
}



fun main() {

    //val scanner = Scanner(System.`in`)
    println("Enter the number of people:")
    //val totalInputLines = scanner.nextInt()
    val totalInputLines = readLine().toString().toInt()
    println("Enter all people:")

    val people = Array(totalInputLines) { " " }

    for (i in 0 until totalInputLines) {
        people[i] = readLine().toString()
    }
    println()
    println("Enter the number of search queries:")
    val howMany = readLine().toString().toInt()

    repeat(howMany) {
        println()
        println("Enter data to search people:")
        val searchWord = readLine().toString()

        var results = false
        for (person in people) {
            if (matchWord(person, searchWord) != "Not found") {
                if (!results) {
                    println()
                    println("Found people:")
                }
                println(matchWord(person, searchWord))
                results = true
            }
        }
        if (!results) println("No matching people found.")
    }
}