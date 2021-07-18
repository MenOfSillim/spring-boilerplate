package com.example.kotlinpractice.entity

import javax.persistence.*

@Entity
data class Team(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long,
    private var name: String
) {
}