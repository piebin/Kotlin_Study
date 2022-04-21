package com.example.kotlin_study

//companion object = static of java

class Book private constructor(val id:Int, val name:String){

    companion object BookFactory:IdProvider{

        override fun getId(): Int {
            return 444
        }

        val myBook="dokidoki"
        fun create()=Book(getId(), myBook)
    }//private함수인데 사용할 수 있게함

}

interface IdProvider{
    fun getId():Int
}

fun main(){
    val book=Book.create()

    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}