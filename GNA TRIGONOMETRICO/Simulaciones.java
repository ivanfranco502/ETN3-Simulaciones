//Simulaciones
import javax.swing.*;

public class Simulaciones extends JFrame{
	MiCanvas mc;
	float [] vector=new float[1000000];
	float promedio=0;
	float dispersion=0,dispersiongraf=0;
	int []cont=new int[10];
	int contador;
	int indice;
	float semilla;
	public Simulaciones(){
		semilla=2147483647;
		for(contador=0;contador<1000000;contador++){
			semilla=(float)Math.sin(Math.log(Math.abs(semilla))/Math.log(2));
			vector[contador]=(float)Math.abs(semilla);
			promedio+=vector[contador];
			//System.out.println(String.valueOf(vector[contador]).toString());
		}
		System.out.println("CONTADOR:"+ String.valueOf(contador).toString());
		System.out.println("SUMA:"+ String.valueOf(promedio).toString());
		promedio=promedio/1000000;
		System.out.println("PROMEDIO:"+ String.valueOf(promedio).toString());

		for(contador=0;contador<1000000;contador++){
			dispersion+=Math.pow(vector[contador]-promedio,(float)2);
		}
		System.out.println("SUMATORIA:"+ String.valueOf(dispersion).toString());
		System.out.println("DISPERSION:"+ String.valueOf(dispersion/1000000).toString());

		for(indice=0;indice<9;indice++){
			cont[indice]=0;
		}
		for(indice=0;indice<1000000;indice++){
			if ((vector[indice]>=0) && (vector[indice]<0.1)){
				cont[0]+=1;
			}else{
				if((vector[indice]>=0.1) && (vector[indice]<0.2)){
					cont[1]+=1;
				}else{
					if((vector[indice]>=0.2) && (vector[indice]<0.3)){
						cont[2]+=1;
					}else{
						if((vector[indice]>=0.3) && (vector[indice]<0.4)){
							cont[3]+=1;
						}else{
							if((vector[indice]>=0.4) && (vector[indice]<0.5)){
								cont[4]+=1;
							}else{
								if((vector[indice]>=0.5) && (vector[indice]<0.6)){
									cont[5]+=1;
								}else{
									if((vector[indice]>=0.6) && (vector[indice]<0.7)){
										cont[6]+=1;
									}else{
										if((vector[indice]>=0.7) && (vector[indice]<0.8)){
											cont[7]+=1;
										}else{
											if((vector[indice]>=0.8) && (vector[indice]<0.9)){
												cont[8]+=1;
											}else{
												if((vector[indice]>=0.9) && (vector[indice]<1.0)){
													cont[9]+=1;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("CANT [0;0.1):"+ String.valueOf(cont[0]).toString());
		System.out.println("CANT [0.1;0.2):"+ String.valueOf(cont[1]).toString());
		System.out.println("CANT [0.2;0.3):"+ String.valueOf(cont[2]).toString());
		System.out.println("CANT [0.3;0.4):"+ String.valueOf(cont[3]).toString());
		System.out.println("CANT [0.4;0.5):"+ String.valueOf(cont[4]).toString());
		System.out.println("CANT [0.5;0.6):"+ String.valueOf(cont[5]).toString());
		System.out.println("CANT [0.6;0.7):"+ String.valueOf(cont[6]).toString());
		System.out.println("CANT [0.7;0.8):"+ String.valueOf(cont[7]).toString());
		System.out.println("CANT [0.8;0.9):"+ String.valueOf(cont[8]).toString());
		System.out.println("CANT [0.9;1):"+ String.valueOf(cont[9]).toString());

		for(contador=0;contador<10;contador++){
			dispersiongraf+=Math.pow(cont[contador]-100000,(float)2);
		}
		System.out.println("SUMATORIA:"+ String.valueOf(dispersiongraf).toString());
		System.out.println("DISPERSION:"+ String.valueOf(dispersiongraf/10).toString());

		mc=new MiCanvas(cont);

		setLayout(new java.awt.BorderLayout());

		add(mc,java.awt.BorderLayout.CENTER);


		setSize(1024,728);
		setVisible(true);
	}

	public static void main (String []s){
		Simulaciones sm= new Simulaciones();
		sm.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}