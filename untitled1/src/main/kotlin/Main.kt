fun main(args: Array<String>) {
    /*
    while - Enquanto
    do...while - Faça Enquanto
    for - Para
    repeat - Repita
     */

    /*
    While - Estrutura

    while(condicao){
        Estrutura
    }
     */

    //Exemplo simples while

    var num = 0

    while (num > 0){

        num = readLine()!!.toInt()
    }
     

    //Exemplo prático utiliando o while
    /*
    var num = 1
    var soma = 0

    println("Digite um número para ser somado." +
            "\nLembre-se que o número precisa ser" +
            " diferente de 0.")

    while (num != 0){
        num = readLine()!!.toInt()
        soma += num
    }

    println("A soma de todos os números que foram digitados é: $soma")
     */

    /*
    do...while

    do{

    Estrutura

    }while(condicao)
     */
    //Exemplo de do...while simples
    /*
    var num = 0

    do{
        num = readLine()!!.toInt()
    }while (num != 0)
     */

    //Exemplo do...while prático
    /*
    var num = 0
    var cont = 0
    var soma = 0

    print("Digite um número para fazermos a soma de 1 até ele: ")
    num = readLine()!!.toInt()

    do{
        soma += cont
        cont++
    }while (cont <= num)

    println("A soma de todos os números de 1 até $num é $soma")
     */

    /*
    for

    Como era no Portugol:
    para(inteiro i = 0; i <= 10; i++){
        Estrutura
    }

    Como é no Kotlin
    for(i in 1..10 step 2){
        Estrutura
    }

    for(i in array)

     */
    //Exemplo simples do for
    /*
    for(aux in 0..10 step 2){
        println("$aux - Henrique")
    }
     */

    /*
    for(aux in 10 downTo 1){
        println("$aux - Henrique")
    }
     */

    /*
    //Exemplo do uso dos Arrays            index
    //                                 0  1  2  3  4
    var arrayNum: Array<Int> = arrayOf(6, 3, 10, 8, 5)

    //println(arrayNum.size)

    for(item in arrayNum){
       println(item)
    }
     */

    //Exemplo de for com while
    /*
    var opcao = "Sim"

    while(opcao == "Sim"){

        print("Digite um valor para calcularmos sua tabuada: ")
        var num = readLine()!!.toInt()

        for(i in 1..10){

            println("$num X $i = ${num * i}")

        }

        print("Você quer continuar?")
        opcao = readLine()!!

    }
     */


}