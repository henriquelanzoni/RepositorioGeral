fun main(args: Array<String>) {
    /*3 - Crie um programa para ler 4 notas e mostrar a média delas.*/

    println("digite as 4 notas: ")

    var nota1: Double = 0.0
    var soma: Double = 0.0
    var quant: Double = 0.0

    while (nota1 < 10.1){
        println("digite uma nota de 0 a 10 ou digite: 11 para finalizar o calculo da media")
        nota1= readLine()!!.toDouble()

        if (nota1 < 10.1){
            soma = soma + nota1
            quant++
        }
    }


    println("Média: ${soma/quant} ")


}