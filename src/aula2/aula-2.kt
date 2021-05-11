/*
class Pessoa{
    var nome: "Natália"
    var idade: 21
    var sexo: "Feminino"
}
 */
fun main(){
    val cachorro = Animal("Fred", "Cachorro")
    cachorro.comer()
    val bichano = Animal(nome= "Bichano", tipo= "gato", reino = "mamifero")
}

class Animal( //construtores primarios
    val nome: String,
    val tipo: String
){
    //construtores secundarios
    constructor(nome: String, tipo: String, reino: String): this(nome, tipo)

    fun comer(){
    }



}
