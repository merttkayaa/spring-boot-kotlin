package com.kotlin.springbootkotlin.repository

import com.kotlin.springbootkotlin.entity.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository : JpaRepository<Employee, Long> {
}