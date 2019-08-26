package com.sunny.design.mode.templateMethod;

/**
 * @author sunny
 * @className Client
 * @date 2018-02-26 18:10
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.preparGoToSchool();
        System.out.println("======================================");
        Teacher teacher = new Teacher();
        teacher.preparGoToSchool();
    }
}
