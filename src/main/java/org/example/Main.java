package org.example;

public class Main {
    public static void main(String[] args) {
    Data obx = Data.getInstance();
    Data obx2 = Data.getInstance();
    obx.login("Hola");
    obx.password("pass");
    obx2.login("Adios");
    obx2.password("sapp");
        System.out.println(obx.toString()+"\n"+obx2.toString());
    }
}