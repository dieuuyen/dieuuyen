/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan2;

import javax.swing.JFrame;

/**
 *
 * @author DieuUyen
 */
public class DemoWindow extends JFrame {
    public DemoWindow(){
        super("Demo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        DemoWindow ui = new DemoWindow();
        ui.setSize(400, 300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
    }
