package com.seroter.spring_boot_tutorial.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class errorMassage {
    private HttpStatus status;
    private String Massage;

}
