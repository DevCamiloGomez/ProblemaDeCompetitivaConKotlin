
fun main(){

    /*
A. Nearly Lucky Number

Petya loves lucky numbers. A number is considered "lucky" if its decimal
representation contains only the digits 4 and 7.
Examples:
- Lucky: 4, 7, 47, 744
- Not lucky: 5, 17, 467

However, not all numbers are lucky.
Petya calls a number "nearly lucky" if the NUMBER of lucky digits (4 and 7)
in it is itself a lucky number.

Goal:
Given an integer n (1 ≤ n ≤ 10^18), determine whether it is a nearly lucky number.

Solution approach:
1. Traverse all digits of the number n.
2. Count how many digits are '4' or '7'.
3. Check if this count is a lucky number:
   - Its decimal representation must contain only digits 4 and/or 7.
4. If the count is lucky → print "YES".
5. Otherwise → print "NO".

Input:
- A single integer n.

Output:
- Print "YES" if n is a nearly lucky number.
- Print "NO" otherwise.

Note:
The number is processed as a String to safely handle very large values
(up to 10^18).
*/

    var n = readLine()!!

    var contador = 0

    for (i in 0 until n.length){

      if(n.length == 1){
          print("NO")
          return
      }
        if(n[i] == '4' ||  n[i] == '7'){

            contador++
        }


    }
    if(contador== 4 || contador == 7){
        println("YES")
    }
    else if(contador != 4 || contador != 7){
        print("NO")
    }
}