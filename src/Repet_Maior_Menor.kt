fun main() {
    var menorNumero = Int.MAX_VALUE
    var maiorNumero = Int.MIN_VALUE
    println("digite quantidade de numeros")
    val quantNum = readln().toInt()
    for (i in 1..quantNum) {
        val numero = readln().toInt()
        if (numero < menorNumero) {
            menorNumero = numero

        }
        if (numero > maiorNumero) {
            maiorNumero = numero

        }

    }
    println("menor numero é: $menorNumero")
    println("maior numero é: $maiorNumero")
}