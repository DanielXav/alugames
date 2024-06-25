package br.com.danielxavier.alugames.modelo

data class Jogo(val titulo: String,
                val capa: String) {

    var descricao: String? = null

    override fun toString(): String {
        return "Meu br.com.danielxavier.alugames.modelo.Jogo: \n" +
                "Título=$titulo, \n" +
                "Capa=$capa, \n" +
                "Descricao=$descricao"
    }

}