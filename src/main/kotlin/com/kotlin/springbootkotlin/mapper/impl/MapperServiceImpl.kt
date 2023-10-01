package com.kotlin.springbootkotlin.mapper.impl

import com.kotlin.springbootkotlin.entity.Employee
import com.kotlin.springbootkotlin.mapper.MapperService
import com.kotlin.springbootkotlin.model.EmployeeDto
import com.kotlin.springbootkotlin.model.request.CreateEmployee
import org.springframework.stereotype.Service

@Service
class MapperServiceImpl : MapperService {
    override fun createToEntity(createEmployee: CreateEmployee): Employee {
        return Employee(fullName = createEmployee.fullName, age = createEmployee.age)
    }

    override fun entityToDto(employee: Employee): EmployeeDto {
        return EmployeeDto(fullName = employee.fullName,age = employee.age)
    }

}