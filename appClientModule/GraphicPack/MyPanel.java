package GraphicPack;
import java.util.concurrent.TimeUnit;
import osSema.*;
import java.awt.*;
import javax.swing.*;
public class MyPanel extends JPanel{
	int x=0;
	int y=30;
	int xc=30;
	int xd=10;
	String th1, th2, th3, th4;
	public MyPanel() {
		this.setPreferredSize(new Dimension(500,500));
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d= (Graphics2D) g;
		//thread 1
		if(x==0) {
			g2d.setColor(Color.GRAY);
			g2d.fillRect(xc, y, 100, 100);
			g2d.setColor(Color.GRAY);
			g2d.fillRect(xc+110, y, 100, 100);
			g2d.setColor(Color.DARK_GRAY);
			g2d.fillRect(xc+220, y, 100, 100);
			g2d.setColor(Color.DARK_GRAY);
			g2d.fillRect(xc+330, y, 100, 100);
		}else if(x==1) {
			g2d.setColor(Color.red);
			g2d.fillRect(xc+0, y, 100, 100);
			g2d.setColor(Color.GRAY);
			g2d.fillRect(xc+110, y, 100, 100);
			g2d.setColor(Color.DARK_GRAY);
			g2d.fillRect(xc+220, y, 100, 100);
			g2d.setColor(Color.DARK_GRAY);
			g2d.fillRect(xc+330, y, 100, 100);
		}else if(x==2) {
			g2d.setColor(Color.GRAY);
			g2d.fillRect(xc+0, y, 100, 100);
			g2d.setColor(Color.red);
			g2d.fillRect(xc+110, y, 100, 100);
			g2d.setColor(Color.DARK_GRAY);
			g2d.fillRect(xc+220, y, 100, 100);
			g2d.setColor(Color.DARK_GRAY);
			g2d.fillRect(xc+330, y, 100, 100);
		}
		else if(x==3) {
			g2d.setColor(Color.GRAY);
			g2d.fillRect(xc+0, y, 100, 100);
			g2d.setColor(Color.GRAY);
			g2d.fillRect(xc+110, y, 100, 100);
			g2d.setColor(Color.red);
			g2d.fillRect(xc+220, y, 100, 100);
			g2d.setColor(Color.DARK_GRAY);
			g2d.fillRect(xc+330, y, 100, 100);
		}else if(x==4) {
			g2d.setColor(Color.GRAY);
			g2d.fillRect(xc+0, y, 100, 100);
			g2d.setColor(Color.GRAY);
			g2d.fillRect(xc+110, y, 100, 100);
			g2d.setColor(Color.DARK_GRAY);
			g2d.fillRect(xc+220, y, 100, 100);
			g2d.setColor(Color.red);
			g2d.fillRect(xc+330, y, 100, 100);
		}else {
			g2d.setColor(Color.GRAY);
			g2d.fillRect(xc+0, y, 100, 100);
			g2d.setColor(Color.GRAY);
			g2d.fillRect(xc+110, y, 100, 100);
			g2d.setColor(Color.DARK_GRAY);
			g2d.fillRect(xc+220, y, 100, 100);
			g2d.setColor(Color.DARK_GRAY);
			g2d.fillRect(xc+330, y, 100, 100);
		}
		g2d.setColor(Color.white);
		g2d.drawString(th1, xd+50 , 80);
		g2d.drawString(th2, xd+50+110 , 80);
		g2d.drawString(th3, xd+50+220 , 80);
		g2d.drawString(th4, xd+50+330 , 80);
		
		g2d.setColor(Color.blue);
		g2d.fillRect(100, 150, 300, 300);
		g2d.setColor(Color.white);
		g2d.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		g2d.drawString(String.valueOf(Shared.balance), 220, 270);
		
	}
	public void repain(int x) {
		this.x=x;
		repaint();
	}
	public void setVal(float t1, float t2, float t3, float t4) {
		th1=String.valueOf(t1);
		th2=String.valueOf(t2);
		th3=String.valueOf(t3);
		th4=String.valueOf(t4);
	}
}
