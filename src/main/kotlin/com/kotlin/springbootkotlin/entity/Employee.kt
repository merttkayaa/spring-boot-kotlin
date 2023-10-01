package com.kotlin.springbootkotlin.entity

import jakarta.persistence.*

@Entity
@Table(name = "employee", schema = "employee")
data class Employee(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long? = null,
    val fullName : String,
    val age : Int
)
