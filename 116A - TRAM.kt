import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().trim().toInt()

    var current = 0
    var maxCapacity = 0

    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt() // pasajeros que salen
        val b = st.nextToken().toInt() // pasajeros que entran

        current -= a
        current += b

        maxCapacity = max(maxCapacity, current)
    }

    print(maxCapacity)
}
