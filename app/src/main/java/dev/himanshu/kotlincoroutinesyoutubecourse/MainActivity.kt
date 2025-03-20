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


fun main(): Unit = runBlocking {

    launch {
        takeOrder("Customer 1")
        cookFood("Customer 1")
        deliverIt("Customer 1")
    }

    launch {
        takeOrder("Customer 2")
        cookFood("Customer 2")
        deliverIt("Customer 2")
    }



}

suspend fun takeOrder(name: String) {
    println("Order have been taken for $name")
}

suspend fun cookFood(name: String) {
    println("Food is cooked for $name")
    delay(4000)
}


suspend fun deliverIt(name: String) {
    println("Deliver it to $name")

}




