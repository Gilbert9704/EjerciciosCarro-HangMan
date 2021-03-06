package HangMan;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class AnimHangMan extends JFrame {

	private static final long serialVersionUID = 1L;
	private HangManPanel canvas = new HangManPanel();
	  
	  public AnimHangMan() {   
	    this.add(canvas, BorderLayout.CENTER); // Add canvas to center  
	  }
	  
	  public static void main(String[] args) {
	    JFrame frame = new AnimHangMan();
	    frame.setTitle("HangMan");
	    frame.setLocationRelativeTo(null); // Center the frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(300, 300);
	    frame.setVisible(true);
	  }
}
