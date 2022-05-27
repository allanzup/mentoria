fun main() {
    var soma=0
    var numero=0
 
    for (i in 1..5){
        val nota= readln().toInt()

        if (nota%2==0){
           soma=nota+soma

            numero=numero+1
        }


    }
    println("${soma/numero}")
}