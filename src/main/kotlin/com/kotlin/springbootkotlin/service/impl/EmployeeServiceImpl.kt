package com.kotlin.springbootkotlin.service.impl

import com.kotlin.springbootkotlin.entity.Employee
import com.kotlin.springbootkotlin.model.EmployeeDto
import com.kotlin.springbootkotlin.model.request.CreateEmployee
import com.kotlin.springbootkotlin.service.EmployeeDbService
import com.kotlin.springbootkotlin.service.EmployeeService
import org.springframework.stereotype.Service

@Service
class EmployeeServiceImpl(private val employeeDbService : EmployeeDbService):EmployeeService {
    override fun create(createEmployee: CreateEmployee): EmployeeDto {
        return employeeDbService.create(createEmployee);
    }
}