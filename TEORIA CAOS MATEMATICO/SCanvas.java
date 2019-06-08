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
		float x=(float)0.987654,y=(float)0.123456;

		g.drawLine(10,10,10,650);
		g.drawLine(10,650,1000,650);

		for(contador=0;contador<100000;contador++){
			x=(float)GenerarNum(y);
			y=(float)GenerarNum(x);
			g.fillOval((int)(x*500)+10,(int)(y*500)+150,1,1);
		}
	}
	public float GenerarNum(float n){
		float res=(float)(3*n);
		return(res-(float)Math.floor(res));

	}
}