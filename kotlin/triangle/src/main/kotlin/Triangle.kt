class Triangle(x: Double, y: Double, z: Double) {
    constructor(x: Int, y: Int, z: Int) : this(x.toDouble(), y.toDouble(), z.toDouble())

    init {
        require(x > 0 && y > 0 && z > 0)
        require(x + y >= z && y + z >= x && z + x >= y)
    }

    private val sides = Triple(x, y, z)

    val isEquilateral = sides.allEqual()
    val isIsosceles = sides.anyEqual()
    val isScalene = !sides.anyEqual()
}

private fun <T> Triple<T, T, T>.allEqual() = first == second && second == third && third == first
private fun <T> Triple<T, T, T>.anyEqual() = first == second || second == third || third == first