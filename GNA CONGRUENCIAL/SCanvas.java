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
		float semillax;
		float semillay;

		g.drawLine(10,10,10,650);
		g.drawLine(10,650,1000,650);
		semillax= (float)0.999999;
		semillay= (float)0.456582;
		for(contador=0;contador<100000;contador++){
			semillax=(float)GenerarNum(semillay);
			x=semillax;
			semillay=(float)GenerarNum(semillax);
			y=semillay;

			g.fillOval((int)(x*500)+10,(int)(y*500)+150,1,1);
		}
	}
		public float GenerarNum(float n){
			int a=3;
			int b=2;
			int div=1000001;
			float semilla;
			float res;

			semilla=n*1000000;

			res=(a*semilla+b)%(div);

			res=res/1000000;

			return(res);

	}
}