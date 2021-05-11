fun main(){
    semParametro()
    comParametro("Natália", "Braz")
    val nome = comRetorno(nome = "Ana", sobrenome = "Braz")
    println(nome)

}
// funções
fun semParametro(){
    println("Natália")
}
fun comParametro(nome: String, sobrenome: String){
    println("$nome $sobrenome")
}
fun comRetorno(nome: String, sobrenome: String): String{
    return "$nome $sobrenome"
}
