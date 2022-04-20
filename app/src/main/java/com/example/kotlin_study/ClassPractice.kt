package com.example.kotlin_study


open/*접근가능*/ class Human (val name : String="hirung")/*주생성자*/{

    constructor(name:String, age:Int):this(name)/*주 생성자로부터 위임*/{
        println("mu name is ${name} and age is ${age}")
    }//부생성자

    init{
        println("new class generated")
    }//주생성자의 일부이므로 부생성자보다 먼저 실행
    open fun eatingCake(){
        println("this is yammyy")
    }
}

//상속
class korean:Human("minsu"){
    override fun eatingCake(){
        super.eatingCake()
        println("korean like cake")
        println("my name is ${name}")
    }
}






fun main(){
    var human = Human("minji")
    var test = Human()
    var koreantest = korean()
    human.eatingCake()
    koreantest.eatingCake()

    val mom = Human("miyoung", 44)
    println("this human name is ${human.name}")
    println("this human name is ${test.name}")//디폴트값 출력
}