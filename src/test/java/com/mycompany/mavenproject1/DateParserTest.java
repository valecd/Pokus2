/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Calendar;
import java.util.Date;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class DateParserTest {
        /**
     * Test of parse method, of class DeleteParser.
     */
    @org.junit.Test
    public void testParser() {
        DateParser dp = new DateParser();
        Date parsedDate = dp.parse("26. 6. 2018");
        
        assertNotNull(parsedDate);        
        
        Calendar c = Calendar.getInstance();
        c.setTime(parsedDate);
        
        assertEquals(26, c.get(Calendar.DAY_OF_MONTH));
        assertEquals(6-1, c.get(Calendar.MONTH));
        assertEquals(2018, c.get(Calendar.YEAR));
        
        try{
            dp.parse("xxx");
            fail("Exception expected");
        }catch(DateFormatException dfe){
            
        }
    }
    
}
