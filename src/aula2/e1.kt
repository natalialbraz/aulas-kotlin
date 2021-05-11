/*fun main(){
    val n1: Int = 2
    val n2: Int = 9
    val n3: Int = 1
    var maior: Int
    if (n1>n2 && n1>n3){
        maior = n1
    } else if(n2>n3 && n2>n1){
        maior = n2
    } else{
        maior = n3
    }
    println("O maior numero é $maior")
}
 */
fun main(){
    println( maiorNumero(21, 4,78))
}
fun maiorNumero(n1: Int, n2: Int, n3: Int): Int{
    var maior : Int
  if (n1>n2 && n1>n3){
        maior = n1
    } else if(n2>n3 && n2>n1){
        maior = n2
    } else{
        maior = n3
    }
    return maior
}
