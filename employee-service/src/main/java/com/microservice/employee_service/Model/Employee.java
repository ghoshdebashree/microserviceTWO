package com.microservice.employee_service.Model;

public record Employee(Long id, Long departmentId, String name, int age, String position) {
}