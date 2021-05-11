fun main(){
    print("Informe o raio da circunferencia: ")
    var raio = readLine()!!
    println(areaCirc(raio.toDouble()))
}
fun areaCirc(r: Double): Double{
    return 3.14*r^2
}
