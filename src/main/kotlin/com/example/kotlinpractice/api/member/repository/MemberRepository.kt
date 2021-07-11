package com.example.kotlinpractice.api.member.repository

import com.example.kotlinpractice.api.member.domain.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : JpaRepository<Member, String> {
}