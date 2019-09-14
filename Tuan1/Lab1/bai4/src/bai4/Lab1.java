/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;
import java.util.Scanner;
/**
 *
 * @author DieuUyen
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a,b,c,x,x1,x2;
        float delta;
        System.out.println(" Nhập a, b, c:");
        Scanner scanner = new  Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        delta = Math.pow(b,2) – 4 * a * c ;
       //delta = (Math.pow(b,2) - 4*a*c);
        System.out.println("Delta là:" +delta);
    }
    
}
