fun main(){
    val bichano = Bichano()
    bichano.sexo = "M"
}
open class Animal(
    val sexo: String
){
    var cor = ""
    constructor(sexo: String, cor: String): this(){
        this.cor = " "
    }
    open fun come(){
        println("Comendo do modo geral")
    }

}
open class Gato: Animal(
    sexo = "F"
){

}
class Leao: Animal(

)
class Bichano: Gato(

){
    override fun come() {
        super.come() // chama a função da classe pai, só pode ser usado na sub-classe(filha)
        println("Comendo do seu jeito") // poliformismo, sobreescrevendo, usando o mesmo metodo mas de jeito diferent
    }
}
