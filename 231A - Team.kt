fun main(){

    /*

    Este es el problema:

        One day three best friends Petya, Vasya and Tonya decided to form a team and take part in programming contests.
        Participants are usually offered several problems during programming contests.
        Long before the start the friends decided that they will implement a problem if at least two of them are sure about the solution.
        Otherwise, the friends won't write the problem's solution.

        This contest offers n problems to the participants. For each problem we know, which friend is sure about the solution.
        Help the friends find the number of problems for which they will write a solution.

        Input
        The first input line contains a single integer n (1<=n<=1000) —
         the number of problems in the contest.
         Then n lines contain three integers each, each integer is either 0 or 1.
         If the first number in the line equals 1, then Petya is sure about the problem's solution, otherwise he isn't sure.
         The second number shows Vasya's view on the solution, the third number shows Tonya's view. The numbers on the lines are separated by spaces.

        Output
        Print a single integer — the number of problems the friends will implement on the contest.
        */
    val n = readLine()!!.toInt(); //Leemos la cantidad de entradas
    var response = 0; // Esta es la respuesta que pide el problema que es un simple Integer
    for(i in 0 until n){

        val nums = readLine()!!.split(" ").map(String::toInt) //Aca metemos la entrada de 3 numeros en un mapa que esta separado por espacios.
        val a = nums[0]
        val b = nums[1]
        val c = nums[2]

        if(a == 1){

            if(b > 0 || c > 0){
                response++;
            }


        }
        else if ( a == 0) {

            if(b > 0 && c > 0){
                response++;
            }
        }



    }

    println(response);


}