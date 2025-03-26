package dev.himanshu.kotlincoroutinesyoutubecourse

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking { getUserInfoTwo("4") }
}

suspend fun getUserInfoTwo(userId:String):User{
    delay(3000)
    delay(5000)
    delay(7000)
    return User(userId,"Himanshu")
}