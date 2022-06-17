fun main() {
    println("digite quantas notas ")
    val quant = readln().toInt()
    var soma = 0
    var maiornota = 0
    for (i in 1..quant) {
        println("digite a nota")
        var nota = readln().toInt()
        soma = soma + nota

        if (nota > maiornota) {
            maiornota = nota
        }
    }
    val media = soma / quant
    println("media e de $media")
    println("maior nota é: $maiornota")
}
//quant 2
//soma 0
//primeira nota 0
//i 1,2
//nota 10,9
//maiornota 10
//media