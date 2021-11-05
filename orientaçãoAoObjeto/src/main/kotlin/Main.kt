fun main(args: Array<String>) {

    val rosnei: Student = Student("Rosnei", "da Silva",
        123, 50.0, 2)

    val xispirito: Student = Student("Xispirito", "Oliveira",
        1234, 80.0, 1)

    val henrique: Student = Student("Henrique", "Lanzoni",
        12345, 95.0, 3)

    val ralf: Student = Student("Ralf", "Cachorro",
        123456, 90.0, 1)

    val genivaldo: Student = Student("genivaldo", "Genivaldão",
        123456, 90.0, 1)

    rosnei.nomeCompleto()
    rosnei.mudarAnoSeAprovado()

    val cursoIngles = Courses("Inglês", "Genivaldo",
        1)

    cursoIngles.cadastrar(rosnei)
    cursoIngles.cadastrar(xispirito)

    cursoIngles.numEstudantesCadastrados()

    cursoIngles.removerEstudante(ralf)

    val estudantes: Array<Student?> = arrayOf(henrique, ralf)

    cursoIngles.cadastrar(estudantes)

    cursoIngles.numEstudantesCadastrados()

    cursoIngles.melhorNota()

    cursoIngles.mostrarEstudantes()


    try{
    cursoIngles.verificarAluno(genivaldo)
    }catch (e: Exception){
        println(e.message)
    }








}