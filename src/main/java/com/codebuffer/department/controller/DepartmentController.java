package com.codebuffer.department.controller;

import com.codebuffer.department.entity.Department;
import com.codebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
     private DepartmentService departmentService;

    @PostMapping("/")

    public Department saveDepartment(@RequestBody Department department)
    {
       log.info("inside save method of controller");
       return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
     public Department findDepartmentById( @PathVariable("id") Long departmentId)
     { log.info("inside the findDepartment method of controller");
         return departmentService.findDepartmentById(departmentId);
     }
}

