package br.digital.com.aulaKotlin

fun main(){
    print(analisaNumero(10,6,3,1))
}
fun analisaNumero(numA:Int, numB:Int, numC:Int,numD:Int):Boolean{
    return  (numA>numC && numA > numD) || (numB >numC && numB >numD)

}