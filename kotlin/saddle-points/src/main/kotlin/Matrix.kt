class Matrix(val rows: List<List<Int>>) {
    private val columns = rows.transpose()

    val saddlePoints: Set<MatrixCoordinate> = calculateSaddlePoints()

    private fun calculateSaddlePoints(): Set<MatrixCoordinate> {
        val results = mutableListOf<Pair<Int, Int>>()
        rows.mapIndexed { x, row ->
            row.mapIndexed { y, value ->
                if (isSaddlePoint(value, x, y)) {
                    results.add(x to y)
                }
            }
        }
        return results.map { (x, y) -> MatrixCoordinate(x, y) }.toSet()
    }

    private fun isSaddlePoint(value: Int, x: Int, y: Int) = value == rows[x].max() && value == columns[y].min()
}

private fun <T> List<List<T>>.transpose(): List<List<T>> {
    return (0 until this.first().size).map { col ->
        (0 until this.size).map { row -> this[row][col] }
    }
}
