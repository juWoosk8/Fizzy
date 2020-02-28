class Application(val name: String) {

    fun run(arrStr: Array<String>) {
        println(name)
        arrStr.forEach { println(it) }
    }
}

fun main(){
    var application = Application("Julie")
    var arrStr = arrayOf("Me", "Myself", "I", "9", "16")
   application.run(arrStr)

}