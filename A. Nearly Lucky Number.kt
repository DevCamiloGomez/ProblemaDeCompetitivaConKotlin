
fun main(){

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