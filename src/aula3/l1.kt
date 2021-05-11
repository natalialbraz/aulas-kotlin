fun main(){
    val natalia = Cliente("Natalia", "Braz")
    val nataliaBanco = Conta(1233, 89.90, natalia)
    val ana = Cliente("Ana", "Braz")
    val anaBanco = Conta(332, 0.0, ana)
    nataliaBanco.deposito(30.3)
    nataliaBanco.saque(10.7)
    anaBanco.deposito(500.76)
    anaBanco.saque(234.34)
}

class Cliente(
    val nome: String,
    val sobrenome: String
) {
}
class Conta(
    val numeroConta: Int,
    var saldo: Double,
    val titular: Cliente
){
    fun deposito(dinheiro: Double){
        saldo += dinheiro
        println("Depósito efetuado com sucesso, o novo saldo é $saldo")
    }
    fun saque(qtdDinheiro : Double){
        if(qtdDinheiro>saldo){
            println("Saldo insuficiente")
        }else {
            saldo -= qtdDinheiro
            println("Saque realizado com suceso, o novo saldo é $saldo")
        }
    }

}



