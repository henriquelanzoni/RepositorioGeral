class Casa (var cor: String, var vagasGaragem: Int) {

    //propriedade
    /*
    var cor: String
    var vagasGaragem: Int

    constructor(cor: String, vagasGaragem: Int){
    this.cor = cor
    this.vagasGaragem = vagasGaragem
    }
    */

    /*
    init {
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }
    */

    //método
    fun detalhesCasa(){
        println("A casa tem a cor: $cor, E tem $vagasGaragem vagas na garagem")
    }

    /*
    fun abrirJanela (qtdJanelas: Int){
        println("abrir janelas $qtdJanelas")
    }
    fun abrirPorta (){
        println("abrir porta")
    }
    fun abrirCasa (){
        this.abrirPorta()
        this.abrirJanela(2)
    }
     */





}