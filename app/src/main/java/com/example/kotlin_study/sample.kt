package com.example.kotlin_study

fun main(){
    helloWorld()
    println(add(4, 5 ))

    //String templete
    val name = "bini"
    val firstn = "boki"
    println("my name is ${name + firstn} and 23")//대괄호 생략 가능
    println("is my name boki? ==> ${name=="boki"}")

}
//함수 선언법

fun helloWorld() : Unit {
    println("Hello World!")
}
//반환형 없는 함수.ex)void - 생략가능

fun add(a : Int, b : Int) : Int{
    return a+b
}
//자료형이 변수명 뒤에 옴. 반환형은 맨 뒤에 int의 앞자리가 대문자로 시작함.
//변수명->자료형->반환형

//val=value

fun valvar(){
    val a : Int = 10 //변하지 않는 수
    //a=100 불가
    var b : Int = 9 //변할 수 있음
    var v = 12 //자료형 생략 가능 - 선언&정의 할때만
    var st = "string"
}





