package com.example.kotlinpractice.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name="users")
data class User(

    @Id @GeneratedValue
    var id: Long,
    var name: String,
    var age: Long
) {
}