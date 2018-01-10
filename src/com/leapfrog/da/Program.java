/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.da;

import com.leapfrog.da.util.AddCommand;
import com.leapfrog.da.util.Calculator;
import com.leapfrog.da.util.CalculatorFactory;

/**
 *
 * @author HP B&O
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x = 2, y = 5;
        Calculator calc = CalculatorFactory.get(1);
        System.out.println(calc.calculate(x, y));
    }
    
}
