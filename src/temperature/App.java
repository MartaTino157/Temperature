/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import java.util.Scanner;

/**
 *
 * @author Alice
 */
public class App {
    public void run() {
        System.out.println("!!!---- Перевод градусов Цельсия в Фарингейта ----!!!");
        System.out.println("Введите температуру в градусах Цельсия ");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        System.out.println(celsius + "С = " + (celsius*9/5+32)+ "F");
    }
    
}
