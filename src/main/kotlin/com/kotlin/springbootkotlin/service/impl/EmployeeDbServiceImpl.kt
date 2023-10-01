package com.kotlin.springbootkotlin.service.impl

import com.kotlin.springbootkotlin.entity.Employee
import com.kotlin.springbootkotlin.repository.EmployeeRepository
import com.kotlin.springbootkotlin.service.EmployeeDbService
import org.springframework.stereotype.Service

@Service
class EmployeeDbServiceImpl(private val repository : EmployeeRepository) : EmployeeDbService {
    //    override fun create(createEmployee: CreateEmployee): EmployeeDto {
////        val mapper = Mappers.getMapper(EmployeeMapper::class.java)
////        val employee = mapper.createToEntity(createEmployee)
////        return mapper.entityToDto(repository.save(employee))
//    }
    override fun create(employee: Employee): Employee {
        return repository.save(employee)
    }
}