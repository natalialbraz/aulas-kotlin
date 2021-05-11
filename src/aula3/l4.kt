fun main(){
    var tripe1 = Tripe(true, 50, 110, 87)
    var tripe2 = Tripe(false, 30, 90, 90)
    tripe1.definirAltura(75)
    println(tripe1.prontoParaGuardar())
    tripe2.usar()
    println(tripe2.prontoParaUsar())
}
class Tripe(
    var dobrado: Boolean,
    val alturaMinima: Int,
    val alturaMaxima: Int,
    var alturaAtual: Int
){
    fun definirAltura(novaAltura: Int){
        alturaAtual = novaAltura
        println("A nova altura do Tripe é $alturaAtual")
    }
    fun dobrar(){
        dobrado = true
    }
    fun desdobrar() {
        dobrado = false
    }
    fun guardar(){
        alturaAtual = alturaMinima
        dobrar()
    }
    fun prontoParaGuardar(): Boolean{
        return (alturaAtual == alturaMinima && dobrado)
    }
    fun usar(){
        desdobrar()
        alturaAtual = alturaMaxima/2
    }
    fun prontoParaUsar(): Boolean{
        return (!dobrado && alturaAtual == alturaMaxima/2)
    }

}