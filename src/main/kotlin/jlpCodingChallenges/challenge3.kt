package jlpCodingChallenges

fun processSokobanMove(squareArray: Array<String>, move: String): Array<String> {
    when (move) {
        "L" -> moveLeft(squareArray)
    }
    return squareArray
}

fun moveLeft(squareArray: Array<String>): Array<String> {
    for (i in 0..squareArray.lastIndex) {
        if (squareArray[i].contains("p")) {
            var lineCharArray = squareArray[i].toCharArray()
            loop@ for (j in 0..lineCharArray.lastIndex) {
                if (lineCharArray[j] == 'p') {
                    when (lineCharArray[j - 1]) {
                        '#' -> break@loop
                        ' ' -> {
                            lineCharArray[j - 1] = 'p'
                        }
                        '*' -> {
                            lineCharArray[j - 1] = 'P'
                        }
                        'b' -> {
                            when (lineCharArray[j - 2]) {
                                '#', 'b' -> break@loop
                                ' ' -> {
                                    lineCharArray[j - 2] = 'b'
                                    lineCharArray[j - 1] = 'p'
                                }
                                '*' -> {
                                    lineCharArray[j - 2] = 'B'
                                    lineCharArray[j - 1] = 'p'
                                }
                            }
                        }
                    }
                   lineCharArray[j] = ' '
                    squareArray[i] = lineCharArray.joinToString("")
                }
            }
        }
    }
    return squareArray
}


fun main() {

}