package com.musila;

/**
 * The cnstructor
 * @param name . The student Name
 * @param regno . The student reg number
 */

public class Student{
    /**
     * the student name
     */
    private String name;

    /**
     * the student reg number
     */
    private String regNo;

    public Student(final String name, final String regNo){
            this.name=name;
            this.regNo=regNo;
    }

    public String getName(){
        return this.name;
    }

    public String getregno(){
        return this.regNo;
    }


}
