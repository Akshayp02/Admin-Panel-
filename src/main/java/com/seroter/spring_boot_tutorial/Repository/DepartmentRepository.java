package com.seroter.spring_boot_tutorial.Repository;

import com.seroter.spring_boot_tutorial.Entity.Department;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

    // DepartmentName must be same as in Entity
    Department findByDepartmentName(String departmentName);
}
