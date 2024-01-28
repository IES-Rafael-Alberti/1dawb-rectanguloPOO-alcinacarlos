class Rectangulo(private val base: Double, private val altura: Double) {

    init {
        require(base > 0) { "La base debe ser mayor que 0" }
        require(altura > 0) { "La altura debe ser mayor que 0" }
    }

    fun calcularArea(): Double {
        return base * altura
    }

    fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }

    override fun toString(): String {
        return "Base: $base, Altura: $altura"
    }
}

fun main() {
    val rectangulo1 = Rectangulo(5.2, 3.33)
    val rectangulo2 = Rectangulo(7.77, 4.567)
    val rectangulo3 = Rectangulo(36.9, 6.66)

    println(rectangulo1.toString())
    println("Área del rectángulo1: ${rectangulo1.calcularArea()}")
    println("Perímetro del rectángulo1: ${rectangulo1.calcularPerimetro()}\n")

    println(rectangulo2.toString())
    println("Área del rectángulo2: ${rectangulo2.calcularArea()}")
    println("Perímetro del rectángulo2: ${rectangulo2.calcularPerimetro()}\n")

    println(rectangulo3.toString())
    println("Área del rectángulo3: ${rectangulo3.calcularArea()}")
    println("Perímetro del rectángulo3: ${rectangulo3.calcularPerimetro()}")
}
