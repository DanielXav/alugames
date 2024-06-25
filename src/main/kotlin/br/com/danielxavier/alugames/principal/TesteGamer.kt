import br.com.danielxavier.alugames.modelo.Gamer

fun main() {
    val gamer1 = Gamer("Daniel", "daniel@gmail.com")
    println(gamer1)

    val gamer2 = Gamer("Fut",
        "fut@gmail.com",
        "12/11/1999",
        "futs")

    println(gamer2)

    gamer1.let {
        it.dataNascimento = "23/01/2000"
        it.usuario = "nick"
    }.also {
        println(gamer1.idInterno)
    }

    println(gamer1)
    gamer1.usuario = "teste"
    println(gamer1)
}