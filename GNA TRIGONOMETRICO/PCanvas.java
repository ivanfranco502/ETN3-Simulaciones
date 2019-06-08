//PCanvas
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

//import java.lang.Math.*;
public class PCanvas extends Canvas{

	public PCanvas(){

		setBounds(0,0,650,300);

	}

	public void paint (Graphics g){
		int contador;
		float x,y;
		float semillax;
		float semillay;

		g.drawLine(10,10,10,650);
		g.drawLine(10,650,1000,650);
		semillax= 1324192915;
		semillay= 10000;
		for(contador=0;contador<4024;contador++){
			semillax=(float)Math.sin(Math.log(Math.abs(semillax))/Math.log(2));
			x=(float)Math.abs(semillax);
			semillay=(float)Math.sin(Math.log(Math.abs(semillay))/Math.log(2));
			y=(float)Math.abs(semillay);

			g.fillOval((int)(x*500)+10,(int)(y*500)+150,1,1);
		}
	}
}