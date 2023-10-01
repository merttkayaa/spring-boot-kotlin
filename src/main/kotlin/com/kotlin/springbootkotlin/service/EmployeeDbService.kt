package com.kotlin.springbootkotlin.service

import com.kotlin.springbootkotlin.entity.Employee
import com.kotlin.springbootkotlin.model.EmployeeDto
import com.kotlin.springbootkotlin.model.request.CreateEmployee

interface EmployeeDbService {
//    fun create(createEmployee : CreateEmployee) : EmployeeDto
    fun create(employee: Employee) : Employee
}