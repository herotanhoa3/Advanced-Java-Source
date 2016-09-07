/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2_5;

import java.util.Map;

/**
 *
 * @author hv
 */
public class Employee implements Comparable<String>{

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public Employee(){
    }
    public String id;
    public String name;
    public int age;
    public double salary;
    Map<String, Double> base;
    @Override
    public int compareTo(String o) {
        return (base.get(id)>= base.get(o))?-1:1;
    }
}
