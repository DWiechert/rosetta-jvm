package lists

class KotlinLists {
    fun sum(list: List<Int>) = list.reduce { x, y -> x + y }

    fun max(list: List<Int>) = list.max()

    fun <E> exists(list: List<E>, element: E): Boolean {
        return list.any { e -> e!!.equals(element) }
    }

    fun <E> indexOf(list: List<E>, element: E): Int {
        var index = 0
        list.forEach {
            e ->
            if (e!!.equals(element)) {
                return index
            }
            index++
        }
        return -1
    }

    fun <E> count(list: List<E>, element: E): Int {
        return list.count { e -> e!!.equals(element) }
    }
}