fun main(args: Array<String>) {
    /*1 - Faça um programa que leia um valor e imprima sua tabuada (aceite apenas números entre 1 e 10).
   Imprima, logo em seguida, a tabuada ao contrário
*/

    var num: Int

    println("Digite um valor para calcular a tabuada")
    num = readLine()!!.toInt()

    for(i in 1..10) {
        println("$num X $i = ${ num * i }")
    }
    println()

    for(aux in 10 downTo 1){
        println("$num X $aux = ${ num * aux }")
    }

}