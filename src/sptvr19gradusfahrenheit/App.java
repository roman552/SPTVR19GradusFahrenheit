/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19gradusfahrenheit;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    private Scanner scanner = new Scanner(System.in);
    public void run() {
        System.out.println("Конвертер градусов Цельсия в градусы по фаренгейту");
        System.out.println("Введите градусы по Цельсию: ");
        double gradC = scanner.nextDouble();
        System.out.println("По фаренгейту это: ");
        System.out.println((1.8*gradC)+32);
        
    }
}
