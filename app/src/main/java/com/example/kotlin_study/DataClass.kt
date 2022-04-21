package com.example.kotlin_study

data class Ticket(val companyName :String, val name:String, var data:String, var seatNumber:Int)
//class의 property처럼 사용 가능, toString(), hashCode(), copy() 자동생성
//일반 class는 메모리 주소값 출력. data class는 내용 출력

fun main()
{
    val ticketA=Ticket("koreanAir", "bini", "2022-04-21", 5)
}