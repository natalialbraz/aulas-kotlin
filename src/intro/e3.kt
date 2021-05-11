fun main(){
    var media: Float
    print("Digite a primeira nota: ")
    val n1 = readLine()!!
    print("Digite a segunda nota: ")
    val n2 = readLine()!!
    print("Digite a terceira nota:")
    val n3 = readLine()!!
    print("Digite a quarta nota: ")
    val n4 = readLine()!!
    media = (n1.toFloat() + n2.toFloat() + n3.toFloat() + n4.toFloat())/4
    println("A média das notas é $media")
}
