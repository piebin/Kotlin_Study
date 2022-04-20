package com.example.kotlin_study

//lamda
//람다식은 우리가 value 처럼 다룰 수 있는 익명함수이다.
//1. 메소드의 파라미터로 넘겨줄 수가 있다.
//2. return값으로 사용가능

//람다의 기본정의
//val lamdaName : Type = {argumentList -> codeBody}


val square:(Int)->(Int)={number->number*number}
//my first lamda

val nameAge:(String, Int)->String={name:String, age:Int->
    "my name is ${name} age is ${age}"
}

fun main(){
    println(square(3))
    println(nameAge("bini", 23))
    var a = "binibini momo"
    var b = "momo is cute"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("momo", 7))
    println(calculateGrade(85))
}

//확장함수
val pizzaIsGreat : String.()->String={
    this+"Pizza is the best!"
}//string class에 pizzaIsGreat라는 함수를 추가함.

fun extendString(name:String, age:Int):String{
    val introduceMyself:String.(Int)->String={"i am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

//람다의 리턴

val calculateGrade : (Int)->String={
    when(it){
        in 0..40->"fail"
        in 41..70->"pass"
        in 71..100->"perpect"
        else->"Error"
    }

}