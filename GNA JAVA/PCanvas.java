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

		g.drawLine(10,10,10,650);
		g.drawLine(10,650,1000,650);

		for(contador=0;contador<800000;contador++){
			x=(float)Math.random();
			y=(float)Math.random();

			g.fillOval((int)(x*1000)+10,(int)(y*500)+150,1,1);
		}
	}
}