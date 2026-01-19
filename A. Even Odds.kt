fun main() {

    val n = readLine()!!.split(" ").map { it.toInt() }
    val x = StringBuilder()

    for (i in 0 until n.size) {
        if (n[i] % 2 != 0 && i < n.size / 2) {
            x.append(n[i])
        } else if (n[i] % 2 == 0) {
            x.append(n[i])
        }
    }

    for (i in 0 until x.length) {

    }
}
