/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author User
 */
public class DateParser {
    /**
     * Parse date in common Czech format
     * @param str Date to be parsed
     * @return Parsed date. Never null.
     * @throws DateFormatException if the format of str is wrong.
     */
    public Date parse (String str)throws DateFormatException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd. MM. yyyy");
        Date date = null;
        System.out.println(date);
        try {
            date = formatter.parse(str);
            System.out.println(date);
            
        } catch (ParseException ex) {
            throw new DateFormatException(ex);
        }
        return date;
    }
}
