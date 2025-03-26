package dev.himanshu.kotlincoroutinesyoutubecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import dev.himanshu.kotlincoroutinesyoutubecourse.ui.theme.KotlinCoroutinesYoutubeCourseTheme
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinCoroutinesYoutubeCourseTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }
}

fun main(): Unit = runBlocking {
    println("start")

    val first = async { getUserInfo("first",4000) }
    delay(3000)
    println(first.getCompleted())

    println("end")
}

suspend fun getUserInfo(userid: String, delay: Long): String {
    delay(delay)
    return userid
}