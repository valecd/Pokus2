/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author User
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        DateParser dp = new DateParser();
        dp.parse("26. 6. 2018");
    }
    
}
