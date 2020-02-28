class ByteTimer(timeValue: Int) {
    var time: Int = timeValue
        set(value) {
            field = if (time < -128) -128
            else if (time > 127) 127
            else time
        }

    init {
        this.time = time
    }
}

fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}
