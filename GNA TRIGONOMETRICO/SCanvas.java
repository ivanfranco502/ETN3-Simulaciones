//SCanvas
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

//import java.lang.Math.*;
public class SCanvas extends Canvas{

	public SCanvas(){

		setBounds(0,0,650,300);

	}

	public void paint (Graphics g){
		int contador;
		float x,y;
		float semilla;

		g.drawLine(10,10,10,650);
		g.drawLine(10,650,1000,650);
		semilla= 1324192915;
		semilla=(float)Math.sin(Math.log(Math.abs(semilla))/Math.log(2));
		x=(float)Math.abs(semilla);
		for(contador=0;contador<4024;contador++){
			semilla=(float)Math.sin(Math.log(Math.abs(x))/Math.log(2));
			y=(float)Math.abs(semilla);
			semilla=(float)Math.sin(Math.log(Math.abs(y))/Math.log(2));
			x=(float)Math.abs(semilla);

			g.fillOval((int)(x*500)+10,(int)(y*500)+150,1,1);
		}
	}
}