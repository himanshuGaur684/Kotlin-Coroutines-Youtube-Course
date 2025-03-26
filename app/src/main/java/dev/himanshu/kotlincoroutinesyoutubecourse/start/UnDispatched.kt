package dev.himanshu.kotlincoroutinesyoutubecourse.start

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {

    val job = launch(start = CoroutineStart.UNDISPATCHED, context = Dispatchers.IO) {
        println("first ${Thread.currentThread().name}" )
        delay(5000)
        println("end ${Thread.currentThread().name}")
    }



}