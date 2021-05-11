fun main(){
    var player1 = JogadorDeFutebol("Neymar", 8, 7, 120, 8)
    var player2 = JogadorDeFutebol("Ronaldo", 3, 5, 103, 9)
    SessaoDeTreinamento(player1.experiencia).treinarA(player1)
    SessaoDeTreinamento(player2.experiencia).treinarA(player2)

}
class JogadorDeFutebol(
    val nome: String,
    var energia: Int,
    var alegria: Int,
    var gols: Int,
    var experiencia: Int
) {
    fun fazerGol(){
        energia =- 5
        alegria =+ 10
        gols =+ 1
        println("GOOOOL!")
    }
    fun correr(){
        energia =- 10
        println("Cansei")
    }
}
class SessaoDeTreinamento(
    var experiencia: Int
){
    fun treinarA(jogador: JogadorDeFutebol) {
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println("Experiência inicial: $experiencia")
        experiencia = experiencia + 1
        println("Experiência final: $experiencia")
    }

}
