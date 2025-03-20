package dev.himanshu.kotlincoroutinesyoutubecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import dev.himanshu.kotlincoroutinesyoutubecourse.ui.theme.KotlinCoroutinesYoutubeCourseTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
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

// main routine
fun main() : Unit = runBlocking{

    launch { first()  } // coroutine
    launch { second() } // coroutine
//
//    first() // subroutine
//    second() // subroutine
}

// stack

// first
// main


suspend fun first() {
    var first = 10
    while (true){
        println("first ${first++}")
        delay(1000)
    }
}

suspend fun second() {
    var second = 0
    while (true){
        println("second ${second++}")
        delay(2000)
    }
}


