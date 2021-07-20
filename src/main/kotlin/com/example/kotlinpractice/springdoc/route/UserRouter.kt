package com.example.kotlinpractice.springdoc.route

import com.example.kotlinpractice.springdoc.handler.UserHandler
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.router

@Component
class UserRouter(private val userHandler: UserHandler) {

    @Bean
    fun userRoutes() = router {
        "/user".nest {
            POST("/register", userHandler::register)
            GET("/{id}", userHandler::find)
            DELETE("/{id}", userHandler::delete)
            PUT("{id}", userHandler::update)
        }
        "/users".nest {
            GET("", userHandler::findAll)
        }
    }

}