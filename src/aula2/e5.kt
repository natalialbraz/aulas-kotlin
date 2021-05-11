fun main(){
    var numA: Int = 23
    var numB: Int = 2
    var numC: Int = 3
    var numD: Int = 8
    println(analise(numA, numB, numC, numD))

}
fun analise(a: Int, b: Int, c: Int, d: Int): Boolean{
    return ((a>c && a>d) || (b>c && b>d))
}