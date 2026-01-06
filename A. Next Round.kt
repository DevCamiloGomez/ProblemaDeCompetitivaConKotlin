fun main(){

    /*
A. Next Round
time limit per test3 seconds
memory limit per test256 megabytes
"Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round,
 long as the contestant earns a positive score..." — an excerpt from contest rules.

A total of n participants took part in the contest , and you already know their scores.
Calculate how many participants will advance to the next round.

Input
The first line of the input contains two integers n and k separated by a single space.

The second line contains n space-separated integers a1....an where ai is the score earned by the participant who got the i-th place.
The given sequence is non-increasing (that is, for all i from 1 to n the following condition is fulfilled: ai).

Output
Output the number of participants who advance to the next round.
     */
val input = readLine()!!.split(" ").map(String::toInt)

    val a = input[0];
    val b = input[1];
    var result = 0;
val nums = readLine()!!.split(" ").map(String::toInt)
    for (i in 0 until a){


        if(nums[i] >= nums[b-1] && nums[b-1] != 0 ){
            result++
        }

        if(nums[b-1] == 0){
            if(nums[i] > nums[b-1]) result++
        }

    }
    println(result);

}