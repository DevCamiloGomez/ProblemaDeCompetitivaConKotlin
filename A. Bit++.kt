fun main() {

    val input = readLine()!!.toInt();
    var response = 0;

    for (i in 0 until input) {

        val n = readLine()!!.toString();

        if(n == "++X" || n == "X++") {
            response++;
        }

        if ( n == "--X" || n == "X--" ) {
            response--;
        }
    }

    println(response);
}