fun main(args: Array<String>) {
    var cont:Int =0
    var armaz:Int =0
    var numpar:Int =0
    var numimpar:Int =0



    while (cont < 10) {
        println("informe um numero: ")
        armaz = readLine()!!.toInt()
        cont++
        if (armaz % 2 == 0) {
            numpar++
        } else {
            numimpar++
        }
    }
    println("numeros pares: $numpar e numeros impares: $numimpar")
}