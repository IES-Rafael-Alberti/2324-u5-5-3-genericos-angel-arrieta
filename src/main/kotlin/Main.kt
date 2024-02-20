package Pila

fun reverse(monton: List<Any>): List<Any>{
    val montonInvertido: MutableList<Any> = mutableListOf()
    val apilado = Pila(monton)
    do {
        montonInvertido.add(apilado.tope())
        apilado.pop()
    }
    while (!apilado.vacia())
    return montonInvertido
}
fun main() {
    val numeros = listOf("one", "two", "three", "four")
    val numerosRev = reverse(numeros)
    if (!listOf("four", "three", "two", "one").equals(numerosRev))
        println("Error")
    else
        println("Correcto")
    println(numerosRev)

}