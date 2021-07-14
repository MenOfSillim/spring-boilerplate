package com.example.kotlinpractice.security.account.repository

import com.example.kotlinpractice.security.account.domain.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository<Account, Long> {
    fun findByEmail(email: String): Account?
}