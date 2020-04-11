/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication158;

/**
 *
 * @author hp15 ac
 */
public class student implements Comparable {
    int id ; 
    String name ; 
    String major ; 
    double grade ; 

    public student() {
    }

    public student(int id, String name, String major, double grade) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGeade() {
        return grade;
    }

    public void setGeade(double geade) {
        this.grade = geade;
    }

    @Override
    public String toString() {
        return "    "+getId()+"            "+getName()+"            "+getMajor()+"            "+getGeade();
    }

    @Override
    public int compareTo(Object o) {
      double Geades =((student)o).getGeade();
        return (int)(this.grade-Geades);
    }

    public static void printHeader(){

		System.out.println(String.format("%-12s %-30s %-10s %-10s","id","name","major","grade"));
	}
	
    
    
}

