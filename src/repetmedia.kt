fun main() {
    var soma=0
    for (i in 1..5){
        val nota= readln().toInt()

        soma=soma+nota

    }
    val media=soma/5
    println("$media")
}