package br.com.danielxavier.alugames.utilitario

import br.com.danielxavier.alugames.modelo.Gamer
import br.com.danielxavier.alugames.modelo.InfoGamerJson

fun InfoGamerJson.criaGamer(): Gamer {
    return Gamer(this.nome, this.email, this.dataNascimento, this.usuario)
}
