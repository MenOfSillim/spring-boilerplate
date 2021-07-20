package com.example.kotlinpractice.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * job 이 아직 완료상태가 아니라 비동기 처리중인 상태일 경우 join() 이후의
 * 코드들을 실행시키지 않고 대기시킨다.
 */
fun main() {
    runBlocking {
        val job = launch {
            delay(1000L)
            println("world")    // #1 첫 번째 출력 원함
        }
        job.join()              // 해당 코드를 추가함으로써 원하는데로 출력 가능
        println("hello")        // #2 두 번째 출력 원함
    }
    println("end")              // #3 세 번째 출력 원함
}

