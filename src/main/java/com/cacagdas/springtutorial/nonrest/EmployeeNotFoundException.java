package com.cacagdas.springtutorial.nonrest;

public class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
        super("Could not find Employee " + id);
    }
}
