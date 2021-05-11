fun main(){
    var carro = Veiculo("Fiat", "Uno", 2012, "Prata", 8000)
    val cliente1 = Clientes("Fernando", "Oliveira", 31989878534)
    val concessionaria = Concessionaria()
    val venda1 = Venda(cliente1, carro, 34590.00)
    concessionaria.registrarVenda(venda1)
    concessionaria.listaDeVendas.forEach{println(it)}
}
class Veiculo(
    val marca: String,
    val modelo: String,
    val fabricacao: Int,
    val cor: String,
    var quilometragem: Int
    ){
}
class Clientes(
    val nome: String,
    val sobrenome: String,
    val contato: Long
    ){
}
class Venda(
    var cliente: Clientes,
    var veiculoVendido: Veiculo,
    var valorDaVenda: Double
){
    override fun toString(): String{
        return "Valor da Venda: $valorDaVenda"
    }
}
class Concessionaria(){
    var listaDeVendas = mutableListOf<Venda>()
    fun registrarVenda(venda: Venda){
        listaDeVendas.add(venda)
    }
}

