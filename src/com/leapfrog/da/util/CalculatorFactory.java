/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.da.util;

/**
 *
 * @author HP B&O
 */
public class CalculatorFactory {

    public static Calculator get(int ch) {
        if (ch == 1) {
            return new AddCommand();
        } else if (ch == 2) {
            return new SubCommand();
        } else if (ch == 3) {
            return new MulCommand();
        }
        return null;
    }

}
