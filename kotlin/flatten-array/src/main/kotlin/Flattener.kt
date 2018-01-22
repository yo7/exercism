object Flattener {
    fun flatten(list: List<Any?>): List<Any> = list.filterNotNull().fold(mutableListOf()) { acc, item ->
        when (item) {
            is List<*> -> acc.addAll(flatten(item))
            else -> acc.add(item)
        }
        acc
    }
}