fun main() {
    println("digite uma temperatura")
    var temperatura = readln().toInt()
    var cont = 0
    var soma = 0
    var menortemperatura = temperatura
    var maiortemperatura = temperatura
    while (temperatura != 0) {
        println("digite uma temperatura")

        if (temperatura < menortemperatura) {
            menortemperatura = temperatura

        }
        if (temperatura > maiortemperatura) {
            maiortemperatura = temperatura
        }
        temperatura = readln().toInt()
        cont = cont + 1


    }
    println("menor temp $menortemperatura")
    println("maior temperatura é: $maiortemperatura")
}



