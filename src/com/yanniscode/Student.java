package com.yanniscode;
import java.lang.*;
import java.util.Date;

public class Student {
    int varos;
    double ypsos;
    String name, surname,hmernia;


    // Constructor
    public Student( String surname,
                   String name, int varos, double ypsos, String hmernia)
    {
        this.surname = surname;
        this.name = name;
        this.varos = varos;
        this.ypsos = ypsos;
        this.hmernia = hmernia;

    }

    public String getSurname(){ return surname;}
    public int getVaros(){ return varos;}
    public double getYpsos(){return ypsos;}
    public String getHmernia(){return hmernia;}



    // Used to print student details in main()
    public String toString()
    {
        return "Onom/mo: "+ this.surname + " " + this.name +
                " Varos: " + this.varos + " Ypsos: " + this.ypsos +" Hm/nia Gennisis: " + this.hmernia;
    }
}



