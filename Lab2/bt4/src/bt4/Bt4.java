/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;
import java.util.Scanner;
/**
 *
 * @author DieuUyen
 */
public class Bt4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println("1. phuong trinh bac nhat");
		System.out.println("2. phuong trinh bac hai");
		System.out.println("3. Tinh tien dien");
		System.out.println("4. Thoat");
		System.out.println("-----------------------------");
		System.out.print("Lua chon: ");
		int luaChon = scanner.nextInt();
		switch(luaChon) {
		case 1: GiaiPTB1(); break;
		case 2: GiaiPTB2(); break;
		case 3: TinhTienDien(); break;
		case 4: System.exit(0);
		default: System.out.print("Nhap sai!");
		scanner.close();
    }
                
    
}
        public static void GiaiPTB1(){
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
        public static void GiaiPTB2(){
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
        public static void TinhTienDien(){
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
    
    

