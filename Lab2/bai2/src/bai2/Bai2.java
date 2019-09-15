/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import java.util.Scanner;
/**
 *
 * @author DieuUyen
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a, b, c:");
        float a = sc.nextFloat();
        float b =sc.nextFloat();
        float c = sc.nextFloat();
        float x, x1, x2;
        float delta;
        delta = (float) (Math.pow( b, 2) - 4*a*c);
        if (a==0)
        {
        if ( b == 0)
        {
            System.out.println("Phương trình vô nghiệm");
        }
        else
        {
        x = -b/c;
                System.out.println("Phương trình có 1 nghiệm:" +x);
        }
        }
        else
        {
        if (delta > 0)
        {
        x1 = (float) ((-b- Math.sqrt(delta))/2*a);
        x2 = (float) ((-b+ Math.sqrt(delta))/2*a);
        }
        else 
        {
        if (delta == 0)
        {
        x1 = x2 = (-b/2*a);
            System.out.println("Nghiệm của phương trình là:" + x1);
        }
        else
        {
            System.out.println("phương trình vô nghiệm");
        }
        }
        }
    }
    
}
