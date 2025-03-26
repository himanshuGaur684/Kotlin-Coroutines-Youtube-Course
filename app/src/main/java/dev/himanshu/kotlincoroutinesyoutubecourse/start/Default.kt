package dev.himanshu.kotlincoroutinesyoutubecourse.start

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    launch(start = CoroutineStart.DEFAULT) {
        println("first ")
        delay(5000)
        println("end")
    }
}