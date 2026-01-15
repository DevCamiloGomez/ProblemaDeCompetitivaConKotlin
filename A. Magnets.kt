fun main() {
    val n = readLine()!!.toInt()

    var previous = readLine()!!
    var groups = 1  // El primer iman siempre crea un grupo...

    repeat(n - 1) {
        val current = readLine()!!
        if (current != previous) {
            groups++
        }
        previous = current
    }

    println(groups)
}
