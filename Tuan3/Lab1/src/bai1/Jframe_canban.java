/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author HaiApple.Com
 */
public class Jframe_canban extends JFrame{
    public Jframe_canban() {
        setVisible(true);
        setBackground(Color.yellow);
        setSize(500, 700);
    }
    
    public static void main(String[] args) {
        new Jframe_canban();
    }

}
