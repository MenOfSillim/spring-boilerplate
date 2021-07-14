package com.example.kotlinpractice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@EnableWebMvc
@SpringBootApplication
class KotlinPracticeApplication

fun main(args: Array<String>) {
    runApplication<KotlinPracticeApplication>(*args)
}
