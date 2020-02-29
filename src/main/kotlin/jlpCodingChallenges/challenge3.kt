package jlpCodingChallenges

fun processSokobanMove(squareArray: Array<String>, move: String): Array<String> {
    val row = squareArray.size
    val column = squareArray[0].length
    var nestedArray = Array(row) { CharArray(column) }
    for (i in 0 until row) {
        for (j in 0 until column) {
            nestedArray[i][j] = squareArray[i].toCharArray()[j]
        }
    }
    when (move) {
        "L" -> move(nestedArray, -1, 0, column)
        "R" -> move(nestedArray, 1, 0, column)
        "D" -> move(nestedArray, 0, 1, column)
        "U" -> move(nestedArray, 0, -1, column)
    }
    for (i in 0..squareArray.lastIndex) {
        squareArray[i] = nestedArray[i].joinToString("")
    }
    return squareArray
}

fun move(nestedArray: Array<CharArray>, dirHor: Int, dirVert: Int, column: Int): Array<CharArray> {
    for (i in 0..nestedArray.lastIndex) {
        loop@ for (j in 0 until column) {
            if (nestedArray[i][j].toUpperCase() == 'P') {
                when (nestedArray[i + dirVert][j + dirHor]) {
                    '#' -> break@loop
                    ' ' -> {
                        nestedArray[i + dirVert][j + dirHor] = 'p'
                        nestedArray[i][j] = ' '
                        break@loop
                    }
                    '*' -> {
                        nestedArray[i + dirVert][j + dirHor] = 'P'
                        nestedArray[i][j] = ' '
                        break@loop
                    }
                    'b' -> {
                        when (nestedArray[i + dirVert * 2][j + dirHor * 2]) {
                            '#', 'b' -> break@loop
                            ' ' -> {
                                nestedArray[i + dirVert * 2][j + dirHor * 2] = 'b'
                                nestedArray[i + dirVert][j + dirHor] = 'p'
                                nestedArray[i][j] = ' '
                                break@loop
                            }
                            '*' -> {
                                nestedArray[i + dirVert * 2][j + dirHor * 2] = 'B'
                                nestedArray[i + dirVert][j + dirHor] = 'p'
                                nestedArray[i][j] = ' '
                                break@loop
                            }
                        }
                    }
                }
            }
        }
    }
    return nestedArray
}


fun main() {

}