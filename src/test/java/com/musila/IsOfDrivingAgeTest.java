package com.musila;


public class  IsOfDrivingAgeTest{
    private StudentService service;
    @Before

    public void setup(){
        this.service=new StudentService();
    }
    @After
    public void cleanup(){

    }
    @Test
    public void isOfDrivingAgeUnderAge(){
        
        //what assertion wil you make
        assertFalse("17 years cant drive",this.service.isOfDrivingAge(17));
    }

    @Test
    public void isOfDrivingAgeOverAge(){
        
        assertTrue("25 yerars should drive",this.service.isOfDrivingAge(25));
    }
}