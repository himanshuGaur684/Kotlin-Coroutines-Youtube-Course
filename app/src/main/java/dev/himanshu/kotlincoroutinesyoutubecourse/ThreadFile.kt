package dev.himanshu.kotlincoroutinesyoutubecourse

import kotlin.concurrent.thread

fun main(){
    getUserInfoCallback("1"){user,e->
        user?.let {
            println(user)

        }
        e?.let {
            println(it.localizedMessage)
        }
    }
//    println(getUserInfo("1"))
}

fun getUserInfo(userId:String):User{
    Thread.sleep(3000)
    return User(userId,"Himanshu")
}

fun getUserInfoCallback(userId:String, onComplete:(User?,Throwable?)->Unit){
    thread {
        Thread.sleep(3000)
        try {
            onComplete(User(userId,"Himanshu"),null)
        }catch (e:Exception){
            onComplete(null,e)
        }
    }
}
