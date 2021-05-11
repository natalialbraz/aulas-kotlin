class Clientes(
    val numero: Int,
    val sobrenome: String,
    val rg: Int,
    val cpf: Int
) {
}
open class Contas(
    val numero: Int,
    var saldo: Double
){
    open fun sacar(valorSaque: Double){
        saldo -= valorSaque
    }
    open fun consultarSaldo(){
        println("O seu saldo é $saldo")
    }
}
class contaPoupança(val juros: Double): Contas(){
    override fun sacar(valorSaque: Double) {
        if(valorSaque<=saldo){
            saldo -= valorSaque
        }
    }
    fun depositar(valorDeposito: Double){
        saldo += valorDeposito
    }
    fun recolherJuros(){

    }
}
class contaCorrente
