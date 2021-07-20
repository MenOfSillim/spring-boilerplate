package com.example.kotlinpractice.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * launch 는 비동기의 시작을 알리는 함수이다.
 */
fun main() {
    runBlocking { // start main coroutine
        launch { // launch new coroutine in background and continue
            delay(1000L)
            println("Hello 1")  // #2
        }
        println("Hello 2")      // #1
    }
    println("Hello 3")          // #3
}