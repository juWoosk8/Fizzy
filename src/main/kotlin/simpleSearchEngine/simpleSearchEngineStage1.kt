package simpleSearchEngine

fun matchWord1(line1: String, searchWord: String): String {
    val listOfStrings = line1.split(" ")
    return if (listOfStrings.contains(searchWord)) {
        (listOfStrings.indexOf(searchWord) + 1).toString()
    } else {
        "Not found"
    }

}

fun main() {
    val line1 = readLine().toString()
    val searchWord = readLine().toString()

    println(matchWord(line1, searchWord))
}