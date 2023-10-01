package com.kotlin.springbootkotlin.service

import com.kotlin.springbootkotlin.entity.Employee
import com.kotlin.springbootkotlin.model.EmployeeDto
import com.kotlin.springbootkotlin.model.request.CreateEmployee

interface EmployeeService {
    fun create(createEmployee : CreateEmployee) : EmployeeDto
}