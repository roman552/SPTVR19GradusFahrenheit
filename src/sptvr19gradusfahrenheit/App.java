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
        System.out.println("Конвертер градусов Цельсия в градусы по фаренгейту и наоборот");
        System.out.println("Введите что перевести (цельсий-c,фаренгейт-f): ");
        String gradCF = scanner.nextLine();
        System.out.println("Введите градусы: ");
        double grad = scanner.nextDouble();
        if(gradCF.equals("c")) {
        System.out.println("По фаренгейту это: ");
        System.out.printf("%.2f",(1.8*grad)+32);
        } else if (gradCF.equals("f")) {
            System.out.println("По цельсию это:");
            System.out.printf("%.2f",(grad-32)/1.8);
        }
        
    }
}
