package com.kotlin.springbootkotlin.controller

import com.kotlin.springbootkotlin.entity.Employee
import com.kotlin.springbootkotlin.model.EmployeeDto
import com.kotlin.springbootkotlin.model.request.CreateEmployee
import com.kotlin.springbootkotlin.service.EmployeeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/crud")
class EmployeeController(private var employeeService : EmployeeService) {
    @PostMapping
    fun create(@RequestBody createEmployee : CreateEmployee) : EmployeeDto {
        return employeeService.create(createEmployee)
     //
    }
}