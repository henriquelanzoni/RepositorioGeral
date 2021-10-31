fun main(args: Array<String>) {

    /*5 - Crie um programa que leia um número do teclado até que encontre um número igual a zero.
     No final, mostre:
- A soma dos números digitados.
- A média deles
- O menor número digitado
- O maior número digitado
     */


    var total = 0
    var menor = 0
    var maior= 0
    var num = 1
    var cont = 0

    println("Digite os números para serem calculados: ")

    do {
        num=readLine()!!.toInt()
        total += num                    //total = total + num
        cont ++                         //cont = cont + 1
        if (num != 0){
            if (num > maior){
                maior = num             // = recebe| == igual
            }else if (num < menor){
                menor = num
            }
            if (menor==0){
                menor=num
            }
            if (maior==0){
                maior=num
            }
        }
    }while (num != 0)
    println("O total é: $total" +
            "\nA média é: ${total/(cont-1).toDouble()}" +
            "\nO maior numero é: $maior" +
            "\nO menor número é: $menor")





}