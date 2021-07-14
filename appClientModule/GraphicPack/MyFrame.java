package GraphicPack;
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	MyPanel panel;
	public MyFrame(){
		panel= new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public void repain(int x) {
		panel.repain(x);
	}
	public void setVal(float t1, float t2, float t3, float t4) {
		panel.setVal(t1, t2, t3, t4);
	}
}
