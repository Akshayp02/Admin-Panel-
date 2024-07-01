package com.seroter.spring_boot_tutorial.controler;

import com.seroter.spring_boot_tutorial.Entity.Department;
import com.seroter.spring_boot_tutorial.Service.DepartmentService;
import com.seroter.spring_boot_tutorial.error.DepartmentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeparmentController {

    @Autowired  // by using that we dont need to create obj spring will auto connect it
    private DepartmentService departmentService;


    // save department fun
    @PostMapping("/departments")
    public Department savDepartment(@RequestBody Department department){
        // here is the annotation of @RequestBody to cont that JSON data

        return departmentService.savDepartment(department);

    }

    @GetMapping("/departments")
    public List<Department> fetchDepartments(){
        return departmentService.fetchDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long DepartmentId) throws DepartmentNotFoundException {
        return departmentService.fetchDepartmentById(DepartmentId);

    }

    @DeleteMapping("/departments/{id}")
    public String DeleteDepartmentByID(@PathVariable("id") Long Did){
        departmentService. DeleteDepartmentByID(Did);
        return "Department Successfully Deleted..!";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id")Long DepID,
                                       @RequestBody Department department){
        return departmentService.updateDepartment(DepID,department);
    }


    @GetMapping("/names/{name}")
    public Department findByName(@PathVariable("name") String departmentName) {
        return departmentService.findByName(departmentName);
    }

}
