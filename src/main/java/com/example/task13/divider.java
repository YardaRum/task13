package com.example.task13;

import org.springframework.stereotype.Component;

@Component
public class divider implements Operation{
    @Override
    public double getResult(double a, double b) {
        return a / b;
    }

}
