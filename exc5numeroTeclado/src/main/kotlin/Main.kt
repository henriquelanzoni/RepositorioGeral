fun main(args: Array<String>) {

    /*5 - Crie um programa que leia um número do teclado até que encontre um número igual a zero.
     No final, mostre: */


    var soma = 0
    var cont = 0
    var num = 0

    println("Digite um número para fazermos a soma de 1 até ele: ")
    num = readLine()!!.toInt()

    do {

        soma += cont
        cont++

    }
    while(cont <= num)

    println(soma)

}