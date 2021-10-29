fun main(args: Array<String>) {
    /*2. Crie um loop (pode ser usado o while) e coloque um when dentro da estrutura, para simular um menu de escolhas:]
- O Loop precisa ficar ativo enquanto uma variável simNao estiver como "Sim", a partir do momento que o usuário digitar "Não" ou qualquer outra coisa, o programa precisa ser finalizado.
- Se o usuário escolher 1, abre as instruções para adicionar um novo convidado
- Se o usuário escolher 2, abre as instruções para remover um convidado
- Se o usuário escolher 3, lista os convidados
3. Use a List para cadastrar cada convidado
4. Teste para ver se tudo funciona*/



    var simNao = "sim"

    var lista = mutableListOf("tchesperito-san", "aonda", "bateu", "forte")




    while (simNao == "sim" ) {

        println("lista de convidado, selecione oque quer fazer:")
        println(" opção 1: adcione um novo convidado \n opção 2: remova um convidado \n opção 3: ver os convidados")

        var umdoist = readLine()!!.toInt()




        when(umdoist){
            1-> {
                println("adcione um convidado:")
               var um = readLine()!!
                lista.add(um)

            }

            2-> {
                println("remova um convidado:")
                var dois = readLine()!!
                lista.remove(dois)
            }
            3-> {
                println("mostra os convidados:")
                println(lista)
            }
            else -> println("erro")

        }

            println("desaja realizar mais alguma mudança? sim ou nao ?")
        simNao = readLine()!!




    }

}