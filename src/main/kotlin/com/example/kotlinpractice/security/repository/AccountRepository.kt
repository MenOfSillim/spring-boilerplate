package com.example.kotlinpractice.security.repository

import com.example.kotlinpractice.security.domain.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository<Account, Long> {
    fun findByEmail(email: String): Account
}