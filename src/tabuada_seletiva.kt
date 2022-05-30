fun main() {
    println("digite o nuremo ref a tabuada")
    val tabuada = readln().toInt()
    println("digite o numero inicial")
    var numeroinicial = readln().toInt()
    println("digite numero final da tabuada")
    val numerofinal = readln().toInt()
    var resultadototal=0
    if (numeroinicial < numerofinal) {
        for (i in numeroinicial..numerofinal) {
            var resultado=i*tabuada

            println("$tabuada x $i = $resultado")
            resultadototal += resultado

        }
        println("media= ${resultadototal/(numerofinal-numeroinicial+1)}")
    }
}



