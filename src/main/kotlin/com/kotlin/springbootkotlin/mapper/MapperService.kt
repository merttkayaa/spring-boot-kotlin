package com.kotlin.springbootkotlin.mapper

import com.kotlin.springbootkotlin.entity.Employee
import com.kotlin.springbootkotlin.model.EmployeeDto
import com.kotlin.springbootkotlin.model.request.CreateEmployee

interface MapperService {

//    fun createToEntity(createEmployee: CreateEmployee) : Employee

    fun entityToDto(employee: Employee) : EmployeeDto
}