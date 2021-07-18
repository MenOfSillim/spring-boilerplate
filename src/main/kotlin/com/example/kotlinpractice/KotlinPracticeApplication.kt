package com.example.kotlinpractice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//@EnableWebMvc
@SpringBootApplication
class KotlinPracticeApplication

fun main(args: Array<String>) {
    runApplication<KotlinPracticeApplication>(*args)
}
