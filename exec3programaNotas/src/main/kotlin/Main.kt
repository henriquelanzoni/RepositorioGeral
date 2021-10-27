fun main(args: Array<String>) {
    /*3 - Crie um programa para ler 4 notas e mostrar a média delas.*/

    println("digite as 4 notas: ")

    var nota1= readLine()!!.toDouble()
    var nota2= readLine()!!.toDouble()
    var nota3= readLine()!!.toDouble()
    var nota4= readLine()!!.toDouble()

    var media = (nota1 + nota2 + nota3 + nota4) / 4

    println("Média: $media ")


}