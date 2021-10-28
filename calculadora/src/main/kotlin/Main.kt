fun main(args: Array<String>) {

   /* 1 - Criem um novo projeto que se chama Calculadora
            2 - Implemente uma função para cada operação aritmética

    - Adição
    - Subtração
    - Multiplicação
    - Divisão

    3 - Na função Main, chame todas as funções com valores diferentes (pelo menos uma vez)
    4 - Se desafiem, adicionando, ainda, uma função para calcular a potência de um número, com qualquer expoente.*/

    var adc: Double
    var sub: Double
    var mult: Double
    var divi: Double

    println(soma(10.0, 20.0))
    sub = subtracao(50.0, 6.0)
    println("o resultado da subtração é: $sub")
    println(multiplicacao(10.0, 20.0))
    println(divisao(10.0, 20.0))






}
    fun soma(num1: Double, num2:Double ):Double{
        return num1 + num2
   }
fun subtracao (num1: Double, num2:Double ):Double{
    return num1 - num2
}
fun multiplicacao (num1: Double, num2:Double ):Double{
    return num1 * num2
}
fun divisao (num1: Double, num2:Double ):Double{
    return num1 + num2
}