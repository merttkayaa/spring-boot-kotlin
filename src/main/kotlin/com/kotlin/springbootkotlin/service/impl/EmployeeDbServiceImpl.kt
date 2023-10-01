package com.kotlin.springbootkotlin.service.impl

import com.kotlin.springbootkotlin.entity.Employee
import com.kotlin.springbootkotlin.mapper.MapperService
import com.kotlin.springbootkotlin.model.EmployeeDto
import com.kotlin.springbootkotlin.model.request.CreateEmployee
import com.kotlin.springbootkotlin.repository.EmployeeRepository
import com.kotlin.springbootkotlin.service.EmployeeDbService
import org.springframework.stereotype.Service

@Service
class EmployeeDbServiceImpl(private val repository : EmployeeRepository, private val mapper : MapperService) : EmployeeDbService {
    override fun create(createEmployee: CreateEmployee): EmployeeDto {
        return mapper.entityToDto(repository.save(mapper.createToEntity(createEmployee)))
    }
}