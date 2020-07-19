package Login;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class B_LoginFrame extends C_label{

	JFrame frame;
	JPanel contentPanel, headerPanel, confirmLoginPanel;
	JButton loginButton, regButton;
	JButton submit;
	JButton clear; 
	
	public void myFrame() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300,200,600,400);
		frame.setTitle("Digital Laboratory"); 
		
		//Main Content Panel
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5,5,5,5));
		frame.setContentPane(contentPanel);
		contentPanel.setLayout(new CardLayout(0,0));
//======Other Panel===========================================		
//		homePanel = new JPanel();
//		contentPanel.add(homePanel);
//		homePanel.setLayout(null);
		
		loginPanel = new JPanel();
		contentPanel.add(loginPanel);
		loginPanel.setLayout(null);
		
		confirmLoginPanel = new JPanel();
		contentPanel.add(confirmLoginPanel);
//======Header in Home Panel========================================
		myLoginHeader();
//----------------------------------------------
		myLoginImage();
//------Class C_button Login label and button	
		loginPanel();
		
		myClearButton();
		mySubmitButton();
//------Footer
		myLoginFooter();
	}
}




