package com.example.kotlinpractice.security.account.controller

import com.example.kotlinpractice.security.account.repository.AccountRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletRequest

@Controller
@RequestMapping("/view")
class AccountController(
    val accountRepository: AccountRepository
) {

//    @GetMapping("/success")
//    fun getMembers(): ResponseEntity<String> {
//        val hello = "Hello World!"
//        return ResponseEntity.ok(hello)
//    }

    @RequestMapping("/success")
    fun success(request: HttpServletRequest): String {
        return "success"
    }
}
