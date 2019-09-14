/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
import java.util.Scanner ;
/**
 *
 * @author DieuUyen
 */
public class bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhập hai cạnh của bạn");
        float Canh1, canh2, chuvi, dientich,canhmin;
        Scanner scanner= new Scanner(System.in);
        Canh1 = scanner.nextFloat();
        canh2 = scanner.nextFloat();
        chuvi = (Canh1 + canh2) *2;
        System.out.println("Chu Vi :" +chuvi);
        dientich = (Canh1 * canh2);
        System.out.println( "Diện Tích :" +dientich);
        canhmin = Math.min(Canh1, canh2);
        System.out.println("Cạnh min:" +canhmin);
    }
    
}
