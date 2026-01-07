fun main() {

    /*
    A. Domino piling
time limit per test2 seconds
memory limit per test256 megabytes
You are given a rectangular board of MxN squares. Also you are given an unlimited number of standard domino pieces of 2 squares.
You are allowed to rotate the pieces. You are asked to place as many dominoes as possible on the board so as to meet the following conditions:

1. Each domino completely covers two squares.

2. No two dominoes overlap.

3. Each domino lies entirely inside the board. It is allowed to touch the edges of the board.

Find the maximum number of dominoes, which can be placed under these restrictions.

Input
In a single line you are given two integers M and N — board sizes in squares.

Output
Output one number — the maximal number of dominoes, which can be placed.
    */
    val input = readLine()!!.split(" ").map(String::toInt);

    val n = input[0];
    val m = input[1];

    val num = n * m;

    var response = 0;
    if(num % 2 == 0){

        response = num / 2;
            }
    else{
        response = (num - 1)/2
    }

    println(response);
}