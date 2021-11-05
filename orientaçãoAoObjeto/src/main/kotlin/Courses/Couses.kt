class Courses (private val nomeCurso: String?, private var nomeProfessor: String?, private var ano: Int) {

    private val listaEstudantes = mutableListOf<Student?>()

    fun mostrarEstudantes(){
        for(i in listaEstudantes){
            println(i?.nomes())
        }
    }

    fun cadastrar(student: Student?) {
        listaEstudantes.add(student)
        println("Estudante cadastrado com sucesso!")
    }

    fun cadastrar(students: Array<Student?>?) {
        if (students != null) {
            for(i in students){
                listaEstudantes.add(i)
            }
        }
        println("Estudantes cadastrados com sucesso!")
    }

    fun removerEstudante(student: Student?) {
        if(listaEstudantes.contains(student)){
            listaEstudantes.remove(student)
            println("O Estudante foi removido!")
        }else{
            println("Esse estudante não existe na lista!")
        }
    }

    fun numEstudantesCadastrados(){
        println("O número de estudantes cadastrados no curso é: ${listaEstudantes.size}")
    }

    fun melhorNota(){
        var melhorNota = listaEstudantes[0]?.notas()
        for(i in listaEstudantes){
            if(i?.notas()!! > melhorNota!!){
                melhorNota = i.notas()
            }
        }
        println("A maior nota desse curso é: $melhorNota")
    }

    fun verificarAluno(student: Student){
        if (listaEstudantes.contains(student)){
            println(" aluno existe")
        }
        else{ throw Exception("aluno nao existe")}
    }
}
