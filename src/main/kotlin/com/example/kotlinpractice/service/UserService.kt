package com.example.kotlinpractice.service

import com.example.kotlinpractice.entity.User
import com.example.kotlinpractice.resporitory.UserRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.core.scheduler.Schedulers

@Service
class UserService(val userRepository: UserRepository) {
    fun register(user: User) = Mono.fromCallable {
        userRepository.save(user)
    }.subscribeOn(Schedulers.parallel())

    fun findAll() = Mono.fromCallable {
        userRepository.findAll()
    }.subscribeOn(Schedulers.parallel())
        .flatMapMany { Flux.fromIterable(it) }

    fun findById(id: Long) =
        Mono.fromCallable {
            userRepository.findById(id)
        }.subscribeOn(Schedulers.parallel())

    fun update(user: User) = Mono.fromCallable {
        userRepository.save(user)
    }.subscribeOn(Schedulers.parallel())

    fun delete(id: Long) = Mono.fromCallable {
        userRepository.deleteById(id)
    }.subscribeOn(Schedulers.parallel())
}