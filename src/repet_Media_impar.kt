fun main() {
    var soma=0
    var cont=0
    for (i in 1..5){
        val nota= readln().toInt()
        if (nota%2!=0){
            soma=soma+nota
            cont=cont+1
        }

    }

    println (soma/cont)

}


