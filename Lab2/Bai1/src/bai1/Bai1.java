/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;
import java.util.Scanner;
/**
 *
 * @author DieuUyen
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a,b");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float x;
        if (a == 0)
        {
            if (b == 0)
            {
                System.out.println("Phương Trình vô số nghiệm:");
            }
                else
            {
                System.out.println("Phương Trình vô nghiệm");
        }
        }
        else
        {
            x = -b/a;
        System.out.println("Phương Trình có nghiệm là :" +x);
    }
    }
}
    
