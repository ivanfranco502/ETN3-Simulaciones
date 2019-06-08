import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Aeropuerto extends JFrame implements ActionListener{
	JTextArea aviones;
	JTextArea horas;
	JButton arrancar;
	int [] avion=new int[4];
	int [] hora=new int[20];
	int contador;
	float auxiliar;

	public Aeropuerto(){
		aviones=new JTextArea();
		horas=new JTextArea();
		arrancar=new JButton("ejecutar");

		setLayout(null);

		arrancar.setBounds(10,10,100,30);
		aviones.setBounds(10,50,200,450);
		horas.setBounds(250,50,200,450);

		add(arrancar);
		add(aviones);
		add(horas);


		arrancar.addActionListener(this);

		setSize(500,500);
		setVisible(true);
	}
	public void ordenar(){
		int auxiliar;
		for(int y=0;y<20;y++){
			for(int x=0;x<20;x++){
				if(hora[y]<hora[x]){
					auxiliar=hora[x];
					hora[x]=hora[y];
					hora[y]=auxiliar;
				}
			}
		}
	}
	public void cargaHora(int intervalo,int indice){
		if(intervalo==0){
			hora[indice]=(int)Math.floor(Math.random()*60);
		}else{
			if(intervalo==1){
				hora[indice]=(int)Math.floor((Math.random()*(120-60))+60);
			}else{
				if(intervalo==2){
					hora[indice]=(int)Math.floor((Math.random()*(180-120))+120);
				}else{
					hora[indice]=(int)Math.floor((Math.random()*(240-180))+180);
				}
			}
		}
	}
	public void cargarAviones(){
		for(contador=0;contador<20;contador++){
			auxiliar=(float)Math.random();
			if(auxiliar>=0 && auxiliar<0.1){
				avion[0]++;
				cargaHora(0,contador);
			}else{
				if(auxiliar>=0.1 && auxiliar<0.3){
					avion[1]++;
					cargaHora(1,contador);
				}else{
					if(auxiliar>=0.3 && auxiliar<0.7){
						avion[2]++;
						cargaHora(2,contador);
					}else{
						if(auxiliar>=0.7 && auxiliar<1){
							avion[3]++;
							cargaHora(3,contador);
						}
					}
				}
			}
		}
	}
	public void printear(){
		for(int indice=0;indice<20;indice++){
			if(indice<4){
				aviones.setText(aviones.getText()+"\n"+String.valueOf(avion[indice]).toString());
			}
			horas.setText(horas.getText()+"\n"+String.valueOf(hora[indice]).toString());
		}
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==arrancar){
			for(int e=0;e<4;e++){
				avion[e]=0;
			}
			aviones.setText("");
			horas.setText("");
			cargarAviones();
			ordenar();
			printear();

		}
	}
	public static void main(String[] s){
		Aeropuerto ae=new Aeropuerto();
		ae.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}