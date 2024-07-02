package br.com.danielxavier.alugames.principal

import br.com.danielxavier.alugames.servicos.ConsumoApi

fun main() {
    val consumo = ConsumoApi()
    println(consumo.buscaGamers())
    println(consumo.buscaJogo("157"))
}
