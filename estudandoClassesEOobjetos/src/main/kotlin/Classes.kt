class Casa {
    //propriedade
    var cor: String = ""



    //método
    fun abrirJanela (qtdJanelas: Int){
        println("abrir janelas $qtdJanelas")
    }
    fun abrirPorta (){
        println("abrir porta")
    }
    fun abrirCasa (){
        this.abrirPorta()
        //this.abrirJanela()
    }












}