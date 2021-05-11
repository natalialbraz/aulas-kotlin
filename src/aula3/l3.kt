fun main(){
    var atleta1 = Atleta("Daiane", 8, 7)
    var atleta2 = Atleta("Diego", 6, 9)
    var prova1 = Prova(5, 6)
    var prova2 = Prova(10, 10)
    var prova3 = Prova(8, 7)
    println(Prova(prova1.dificuldade, prova1.energiaNecessaria).podeRealizar(atleta1))
    println(Prova(prova2.dificuldade, prova2.energiaNecessaria).podeRealizar(atleta1))
    println(Prova(prova3.dificuldade, prova3.energiaNecessaria).podeRealizar(atleta1))
    println(Prova(prova1.dificuldade, prova1.energiaNecessaria).podeRealizar(atleta2))
    println(Prova(prova2.dificuldade, prova2.energiaNecessaria).podeRealizar(atleta2))
    println(Prova(prova3.dificuldade, prova3.energiaNecessaria).podeRealizar(atleta2))
}
class Atleta(
    val nome: String,
    var nivel: Int,
    var energia: Int
){

}
class Prova(
    var dificuldade: Int,
    var energiaNecessaria: Int
){
    fun podeRealizar(atleta: Atleta): Boolean{
        return (atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria)

    }
}


