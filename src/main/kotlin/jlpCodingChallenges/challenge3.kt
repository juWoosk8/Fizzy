package jlpCodingChallenges

fun processSokobanMove(squareArray: Array<String>, move: String): Array<String> {
    when (move) {
        "L" -> moveHorizontal(squareArray, -1)
        "R" -> moveHorizontal(squareArray, 1)
    }
    return squareArray
}

fun moveHorizontal(squareArray: Array<String>, dir :Int): Array<String> {
    for (i in 0..squareArray.lastIndex) {
        if (squareArray[i].contains("p")) {
            var lineCharArray = squareArray[i].toCharArray()
            loop@ for (j in 0..lineCharArray.lastIndex) {
                if (lineCharArray[j] == 'p') {
                    when (lineCharArray[j + dir]) {

                        '#' -> break@loop
                        ' ' -> {
                            lineCharArray[j + dir] = 'p'
                            lineCharArray[j] = ' '
                            break@loop
                        }
                        '*' -> {
                            lineCharArray[j + dir] = 'P'
                            lineCharArray[j] = ' '
                            break@loop
                        }
                        'b' -> {
                            when (lineCharArray[j + dir*2]) {
                                '#', 'b' -> break@loop
                                ' ' -> {
                                    lineCharArray[j + dir*2] = 'b'
                                    lineCharArray[j + dir] = 'p'
                                    lineCharArray[j] = ' '
                                    break@loop
                                }
                                '*' -> {
                                    lineCharArray[j + dir*2] = 'B'
                                    lineCharArray[j + dir] = 'p'
                                    lineCharArray[j] = ' '
                                    break@loop
                                }
                            }
                        }
                    }
                }
            }
            squareArray[i] = lineCharArray.joinToString("")
        }
    }
    return squareArray
}


fun main() {

}