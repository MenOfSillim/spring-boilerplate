package com.example.kotlinpractice.springdoc.entity

import javax.persistence.*

@Entity
data class Team(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private var id: Long,
    private var name: String
) {
}