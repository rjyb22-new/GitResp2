package com.rjyb22;

public class Test {
    private String name;
    private int age;

    private String number;
    
    private String user;

    private String passwd;

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
    
    public String toString(){
        System.out.println("name"+name);
        return null;
    }
}
