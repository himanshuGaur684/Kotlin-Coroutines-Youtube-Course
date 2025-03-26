package dev.himanshu.kotlincoroutinesyoutubecourse.start

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {

    val job = launch(start = CoroutineStart.LAZY) {
        println("first ")
        delay(5000)
        println("end ")
    }

    job.cancel()
}