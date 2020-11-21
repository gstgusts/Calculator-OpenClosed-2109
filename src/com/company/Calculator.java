package com.company;

import java.security.InvalidParameterException;

public class Calculator {
    public void calculate(CalculatorOperation operation) {
        if(operation == null) {
            throw new InvalidParameterException("Calculation operation is null");
        }

        operation.perform();
    }
}
