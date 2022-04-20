package com.example.kotlin_study

fun main(){
    helloWorld()
    println(add(4, 5 ))

    //String templete
    val name = "bini"
    val firstn = "boki"
    println("my name is ${name + firstn} and 23")//대괄호 생략 가능
    println("is my name boki? ==> ${name=="boki"}")

    CheckNum(1)
    forAndWhile()
    nullCheck()

    ignoreNulls("banana")



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

//조건식
fun maxBy(a : Int, b:Int):Int{
    if(a>b)
        return a
    else
        return b
  }

fun maxby2(a:Int, b:Int) = if(a>b) a else b

fun CheckNum(score:Int){
    when(score) {
        0->println("this is 0")
        1->println("this is 1")
        2, 3->println("this is 2 or 3")
        else->println("?")
    }//switch와 유사

    var b = when(score){
        1->1
        2->2
        else-> 3
    }

    println("b : ${b}")

    when(score)
    {
        in 90..100->println("good")
        in 10..80->println("bad")
        else->println("ok")
    }

}

//expression-값을 만듬 vs statement-값 안만듬

//Array and list

fun array(){
    var array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    var listv = list.get(0)
    //list[0]=2 리스트는 값 변경 불가. 가져오는것만 가능

    val arraylist = arrayListOf<Int>() //int형 담을 수 있는 arraylist생성
    arraylist.add(10)
    arraylist.add(30)
    arraylist[0] = 20
}

//반복문
var sum=0
fun forAndWhile(){
    val students = arrayListOf("a", "bb", "cc", "dda")
    var index=0
    for (name :String in students){
        println("${name}")
    }

    for(i:Int in 10 downTo 5){ //in 1 until 100, in 1..100, in 1..10 step 2, ...
        sum+=i
    }
    println(sum)

    for((index, name)in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }


    while(index<10){
        println("current index : ${index++}")
    }


}


//Nullable/NonNull

fun nullCheck() {
    var name = "bini"
    var nullName: String? = null
    //nullable타입이됨.

    var nameInupperCase: String = name.uppercase()
    var nullNameInUpperCase: String? = nullName?.uppercase()
    //얘가 추론해서 nullName이 null이면 null반환 아니면 대문자 변환뒤 반환

    // ?:
    var lastname: String? = "null"
    val fullname = name + " " + (lastname ?: "No lastname")
    //lastname이 null일 경우 No lastname이 됨

    println(fullname)

}
    //!! 이건 절대 null이 아니야~
fun ignoreNulls(str:String?){
    val mNotNull:String = str!!
    val upper = mNotNull.uppercase()

    val email:String? = "abcd@gmale.com"
    email?.let{
        println("my email is ${email}")
    }//null이 아닌경우 실행

}

//class















