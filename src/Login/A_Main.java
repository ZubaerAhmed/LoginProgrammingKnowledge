 package Login;

import java.awt.EventQueue;

import javax.swing.JPanel;

public class A_Main{
	
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					B_HomeFrame frame = new B_HomeFrame();
					frame.myFrame();
					
//					B_LoginFrame bl = new B_LoginFrame();
//					bl.myFrame();
				}catch(Exception e) {
					e.printStackTrace(); 
				}
			}			
		});
	}

}
