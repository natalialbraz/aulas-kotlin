fun main(){
    var n: Int = 0
    var contPar: Int = 0
    println("Pares")
    while (contPar<100){
       if(n % 2 == 0){
           println(n)
           contPar++
       }
        n++
    }
    println("Ímpares")
    var nu: Int =0
    var contImpar: Int = 0
    while (contImpar<100){
        if(nu % 2 != 0){
            println(nu)
            contImpar++
        }
        nu++
    }

}
