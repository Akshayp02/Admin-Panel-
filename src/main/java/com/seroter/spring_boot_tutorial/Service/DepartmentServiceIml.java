package com.seroter.spring_boot_tutorial.Service;


import com.seroter.spring_boot_tutorial.Entity.Department;
import com.seroter.spring_boot_tutorial.Repository.DepartmentRepository;
import com.seroter.spring_boot_tutorial.error.DepartmentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceIml implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department savDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long id) throws DepartmentNotFoundException {
        Optional<Department> department =  departmentRepository.findById(id);
        if(!department.isPresent()){
            throw new DepartmentNotFoundException("Department Not Found!!");
        }
        return department.get();
    }

    @Override
    public void DeleteDepartmentByID(Long DeletedepartmentI) {
        departmentRepository.deleteById(DeletedepartmentI);

    }

    @Override
    public Department updateDepartment(Long depID, Department department) {
        Department DepID = departmentRepository.findById(depID).get();

        if (Objects.nonNull(department.getDepartmentName()) &&
                !"".equalsIgnoreCase(department.getDepartmentName())) {
            DepID.setDepartmentName(department.getDepartmentName());
        }

        if (Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            DepID.setDepartmentAddress(department.getDepartmentAddress());
        }

        if (Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getDepartmentCode())) {
            DepID.setDepartmentCode(department.getDepartmentCode());
        }

        return departmentRepository.save(DepID);
    }



    @Override
    public Department findByName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }


}
