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
		semillax= (float)0.999999;
		semillay= (float)0.456851;
		for(contador=0;contador<100000;contador++){
			semillax=(float)GenerarNum(semillax);
			x=semillax;
			semillay=(float)GenerarNum(semillay);
			y=semillay;

			g.fillOval((int)(x*500)+10,(int)(y*500)+150,1,1);
		}
	}
	public float GenerarNum(float n){
		float res=(float)(3*n);
		return(res-(float)Math.floor(res));

	}
}