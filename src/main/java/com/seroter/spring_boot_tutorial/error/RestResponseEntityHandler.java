package com.seroter.spring_boot_tutorial.error;


import com.seroter.spring_boot_tutorial.Entity.errorMassage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityHandler
        extends ReflectiveOperationException {

    @ExceptionHandler(DepartmentNotFoundException.class)
    public ResponseEntity<errorMassage> DepartmentNotFoundException(DepartmentNotFoundException exception,
                                                                    WebRequest request) {

        errorMassage massage = new errorMassage(HttpStatus.NOT_FOUND,
                exception.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(massage);
    }

}
