fun main(){
    val n: Int = 5
    println(numeroPar(n))
    val outro: Int = 26
    println(numeroPar(outro))
}

fun numeroPar(numero: Int): Boolean{
    return numero % 2 == 0
}
