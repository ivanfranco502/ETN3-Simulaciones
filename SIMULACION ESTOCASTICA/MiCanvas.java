import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

//import java.lang.Math.*;
public class MiCanvas extends Canvas{
	int indice;
	int []cont=new int [10];

	public MiCanvas(int []vec){

		for(indice=0;indice<10;indice++){
			cont[indice]=vec[indice];
		}

		setBounds(0,0,650,300);

	}

	public void paint (Graphics g){

		g.drawLine(10,10,10,650);
		g.drawLine(10,10,1000,10);

		for(indice=0;indice<10;indice++){
			g.drawRect(indice*100+10,10,100,cont[indice]/525);
		}
	}
}