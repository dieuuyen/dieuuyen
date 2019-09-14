/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;
import java.util.Scanner;

/**
 *
 * @author DieuUyen
 */
public class bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("nhập cạnh của hình lập phương :");
        Scanner scanner = new Scanner(System.in);
        float canh, thetich;
        canh = scanner.nextFloat();
        thetich = (canh*canh*canh);
        System.out.println("Thể Tích Hình Lập Phương :" +thetich);
    }
    
}
