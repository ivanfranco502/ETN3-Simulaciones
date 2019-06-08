import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.lang.Math.*;

public class MiCanvas extends Canvas{
int indice;
double x;
double y;

	public MiCanvas(){

		setBounds(0,0,650,300);
	}
	public void paint (Graphics g){

		g.setColor(Color.BLUE);
		g.drawLine(10,10,10,650);
		g.drawLine(10,10,1000,10);
		g.setColor(Color.BLACK);
		x=0;
		do{
			y=Math.pow(Math.E,(double)-Math.pow((double)x,(double)2));
			g.drawLine((int)(x*45+10),(int)(y*100+10),(int)(x*45+10),(int)(y*100+10));
			x+=0.01;
		}while(x<10);
		g.setColor(Color.RED);
		g.drawLine(0*45+10,2*100+10,10*45+10,2*100+10);
		g.drawLine(10*45+10,0*100+10,10*45+10,2*100+10);
	}
}