/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar;

/**
 *
 * @author Lenovo
 */
public class bahasa {
    void displayInfo(){
        System.out.println("Bahasa Inggris adalah bahasa umum");
    }
}
    class HTML extends bahasa{
        @Override
        void displayInfo(){
            System.out.println("HTML adalah Salah satu bahasa pemrograman");
        }
    }
    class Java extends bahasa{
        @Override
        void displayInfo(){
            System.out.println("Java adalah bahasa yang sedang dipelajari");
        }
    }
    

