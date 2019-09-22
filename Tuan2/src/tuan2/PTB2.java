/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
/**
 *
 * @author DieuUyen
 */
public class PTB2 extends JFrame{
    public PTB2()
	{
		super("Giai phuong trih bac 2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		JPanel pn = new JPanel();
		pn.setLayout(new BorderLayout());

		JPanel pnNorth = new JPanel();
		pnNorth.setBackground(Color.red);
		pn.add(pnNorth,BorderLayout.NORTH);
		
		JLabel text = new JLabel("Giải Phương trình bậc 2: ");
		Font font = new Font("Arial",Font.BOLD,30);
		pnNorth.add(text);
		pnNorth.setFont(font);
		JPanel pnCenter = new JPanel();
		pn.add(pnCenter,BorderLayout.CENTER);
		Border bor=BorderFactory.createLineBorder(Color.RED);
		TitledBorder titlebor=new TitledBorder(bor, "Nhập a,b,c:");
		pnCenter.setBorder(titlebor);
		
		JPanel textfield = new JPanel();
		textfield.setLayout(new BoxLayout(textfield,BoxLayout.Y_AXIS));
		
		JPanel flow = new JPanel();
		flow.setLayout(new FlowLayout());
		JLabel lblSoa = new JLabel("A: ");
		JTextField txtSoa = new JTextField(10);
		flow.add(lblSoa);flow.add(txtSoa);
		textfield.add(flow);
		
		
		JPanel flow1 = new JPanel();
		flow.setLayout(new FlowLayout());
		JLabel lblSob = new JLabel("B: ");
		JTextField txtSob = new JTextField(10);
		flow1.add(lblSob);flow1.add(txtSob);
		textfield.add(flow1);
		
		
		JPanel flow2 = new JPanel();
		flow2.setLayout(new FlowLayout());
		JLabel lblSoc = new JLabel("C: ");
		JTextField txtSoc = new JTextField(10);
		flow2.add(lblSoc);flow2.add(txtSoc);
		textfield.add(flow2);
		
		JLabel lblketqua = new JLabel(" Kết quả : ");
		JTextField txtketqua= new JTextField(10);
		txtketqua.setEditable(false);
		textfield.add(lblketqua);
		textfield.add(txtketqua);
		pnCenter.add(textfield);
                
		JPanel pnSouth = new JPanel();
		pn.add(pnSouth,BorderLayout.SOUTH);
		Border bor2 =BorderFactory.createLineBorder(Color.blue);
		TitledBorder titledbor2= new TitledBorder(bor2,"Chon thao tac: ");
		pnSouth.setBorder(titledbor2);
		
		JPanel bnSouth = new JPanel();
		bnSouth.setLayout(new FlowLayout());
		JButton btnGiai = new JButton("Giải ");
		JButton btnXoa = new JButton("Xóa ");
		JButton btnThoat = new JButton("Thoát ");
		bnSouth.add(btnGiai);
		bnSouth.add(btnXoa);
		bnSouth.add(btnThoat);
		pnSouth.add(bnSouth);
	
		Container com = getContentPane();
		com.add(pn);
	}
	public static void main(String [] args )
	{
		PTB2 PT = new PTB2();
		PT.setSize(500, 300); 	
		PT.setVisible(true);
		PT.setLocationRelativeTo(null);
		
	}

    
    
}
