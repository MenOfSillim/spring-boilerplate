package com.example.kotlinpractice.springdoc.resporitory

import com.example.kotlinpractice.springdoc.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
}