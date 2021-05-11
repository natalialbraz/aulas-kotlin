fun main(){
    print("Digite um numero: ")
    val n1 = readLine()!!
    print("Digite outro numero: ")
    val n2 = readLine()!!
    val soma  = n1.toInt() + n2.toInt()
    println("A soma dos números é $soma")
}