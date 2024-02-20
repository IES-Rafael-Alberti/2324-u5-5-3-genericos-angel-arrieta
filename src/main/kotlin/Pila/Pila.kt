package Pila

class Pila(lista: List<Any>) : Iterable<Any>  {
    private var contenedor: MutableList<Any> = mutableListOf()
    init{
        this.contenedor = lista.toMutableList()
    }
    override fun iterator(): Iterator<Any> {
        return object: Iterator<Any> {
            private var indiceActual = 0

            override fun hasNext(): Boolean {
                return indiceActual < contenedor.size
            }

            override fun next(): Any {
                return contenedor[indiceActual++]
            }
        }
    }
    fun tope(): Any {
        return contenedor[contenedor.size-1]
    }
    fun push(objeto: Any) {
        contenedor.add(objeto)
    }
    fun pop(): Any {
        val sacar = contenedor[contenedor.size-1]
        this.contenedor.removeAt(contenedor.size-1)
        return sacar
    }
    fun vacia(): Boolean {
        return contenedor.size != 0
    }
    fun size(): Int {
        return contenedor.size
    }
}