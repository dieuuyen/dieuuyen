/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.util.Scanner;
/**
 *
 * @author DieuUyen
 */
public class lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện");
        float sodien = sc.nextFloat();
        float tien ;
        if (sodien < 50)
        {
        tien = (sodien*1000);
                }
        else
        {
        tien = 50*1000 + (sodien - 50)*1200 ;
        }
        System.out.println("Số tiền điện là:" + tien);
    }
    
}
