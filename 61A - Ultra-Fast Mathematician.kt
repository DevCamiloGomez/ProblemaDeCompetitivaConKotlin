fun main() {

    /*
A. Ultra-Fast Mathematician
Time limit per test: 2 seconds
Memory limit per test: 256 megabytes

Shapur was an extremely gifted student. He was great at everything including
Combinatorics, Algebra, Number Theory, Geometry, Calculus, etc.
He was not only smart but extraordinarily fast! He could manage to sum
10^18 numbers in a single second.

One day in 230 AD Shapur was trying to find if anyone can possibly do
calculations faster than him. As a result he made a very great contest and
asked everyone to come and take part.

In his contest he gave the contestants many different pairs of numbers.
Each number is made from digits 0 or 1. The contestants should write a new
number corresponding to the given pair of numbers.

The rule is simple:
The i-th digit of the answer is 1 if and only if the i-th digits of the two
given numbers differ. In the other case the i-th digit of the answer is 0.

Shapur made many numbers and first tried his own speed. He saw that he can
perform these operations on numbers of infinite length in a glance!
He always gives correct answers so he expects the contestants to give correct
answers too.

Now you are going to take part in Shapur's contest.
See if you are faster and more accurate.

Input:
There are two lines in each input. Each of them contains a single number.
It is guaranteed that the numbers are made from digits 0 and 1 only and that
their length is the same. The numbers may start with 0.
The length of each number doesn't exceed 100.

Output:
Write one line — the corresponding answer.
Do not omit the leading zeros.
*/

    val a = readLine()!!
    val b = readLine()!!

    val result = StringBuilder()

    for (i in a.indices) {
        if (a[i] != b[i]) {
            result.append('1')
        } else {
            result.append('0')
        }
    }

    println(result.toString())
}
