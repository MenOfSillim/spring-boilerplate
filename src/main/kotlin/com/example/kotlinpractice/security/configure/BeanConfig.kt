package com.example.kotlinpractice.security.configure

import com.example.kotlinpractice.security.account.domain.Account
import com.example.kotlinpractice.security.account.service.AccountService
import com.example.kotlinpractice.util.enumutil.AccountRole
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.crypto.factory.PasswordEncoderFactories
import org.springframework.security.crypto.password.PasswordEncoder

@Configuration
class BeanConfig {
    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder()
    }

    @Bean
    fun applicationRunner(): ApplicationRunner {
        return object : ApplicationRunner {

            @Autowired
            lateinit var accountService: AccountService

            @Throws(Exception::class)
            override fun run(args: ApplicationArguments) {
                val admin = Account(
                    null,
                    "admin@test.com",
                    "password",
                    mutableSetOf(AccountRole.ADMIN, AccountRole.USER)
                )
                accountService.saveAccount(admin)
            }
        }
    }
}