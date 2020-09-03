package br.digital.com.aulaKotlin

fun main(){
    var n1 = 2;
    var  n2 = 4;
    var n3 = 9;

    if(n1 > n2 && n1 > n3){
        print("$n1 ")

    }else if(n2 > n1 && n2 > n3){
        print("$n2 ");
    }else if(n3 > n1 && n3 > n2)
        print("$n3 ")

}