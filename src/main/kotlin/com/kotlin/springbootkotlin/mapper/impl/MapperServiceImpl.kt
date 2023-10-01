package com.kotlin.springbootkotlin.mapper.impl

import com.kotlin.springbootkotlin.entity.Employee
import com.kotlin.springbootkotlin.mapper.MapperService
import com.kotlin.springbootkotlin.model.EmployeeDto
import com.kotlin.springbootkotlin.model.request.CreateEmployee

class MapperServiceImpl : MapperService {
//    override fun createToEntity(createEmployee: CreateEmployee): Employee {
//        return Employee(1L,createEmployee.fullName, createEmployee.age)
////        TODO("Not yet implemented")
//    }

    override fun entityToDto(employee: Employee): EmployeeDto {
        TODO("Not yet implemented")
    }

}