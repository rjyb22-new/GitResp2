package com.rjyb.test;

/**
 * @Auther: kf
 * @Date: 2020/12/24 - 12 - 24 - 8:54
 * @Description: com.rjyb.test
 * @version: 1.0
 */
public class Hello {
    private String name;
    private String age;
    private String sex;
    
    public static void main(String[] args) {
		System.out.println("this is 1223测试");
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
