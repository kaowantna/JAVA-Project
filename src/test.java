import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test {
	public static void main(String[]args){
		JPanel myPanel = new JPanel();
		JLabel lbl1 = new JLabel("label 1");
		myPanel.add(lbl1);
		lbl1.setLocation(500, 20);
		lbl1.setSize(86, 14);
		myPanel.setLayout(null);
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.add(myPanel);
		
	}
}
