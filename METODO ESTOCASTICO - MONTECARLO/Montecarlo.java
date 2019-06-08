//metodos estocasticos /montecarlo
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Montecarlo extends JFrame implements ActionListener{
	double xazar,yazar;
	double y;
	int intentos;
	int ok;
	float total;
	MiCanvas mc;
	JButton funcion;

	public Montecarlo(){
		mc=new MiCanvas();
		funcion=new JButton("Funcion");

		setLayout(null);

		mc.setBounds(0,0,500,500);
		add(mc);
		funcion.setBounds(0,600,10,20);
		add(funcion);

		funcion.addActionListener(this);

		setSize(700,700);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==funcion){
			funcion();
			System.out.println("ok/N:"+String.valueOf(ok/1000000).toString());
			total=total*4;
			System.out.println("4*(ok/N):"+String.valueOf(20*(ok/1000000)).toString());
			System.out.println("final:"+String.valueOf((20*(ok/1000000))*2).toString());

		}
	}
	public void funcion(){
		ok=0;
		for(intentos=0;intentos<1000000;intentos++){
			xazar=Math.random()*10;
			yazar=Math.random()*2;
			y=Math.pow(Math.E,(double)-Math.pow((double)xazar,(double)2));
			if(yazar<=y){
				ok++;
			}
		}
		System.out.println("OK:"+String.valueOf(ok).toString());


	}
	public static void main(String[]s){
		Montecarlo mcl=new Montecarlo();
		mcl.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}