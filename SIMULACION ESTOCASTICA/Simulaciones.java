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
		semilla=(float)0.999999;
		for(contador=0;contador<1000000;contador++){
			for(indice=0;indice<10;indice++){
				semilla=(float)Math.random();
				vector[contador]=vector[contador]+semilla;
			}
			promedio+=vector[contador];
			/*if(vector[contador]==0.0){
				System.out.println(String.valueOf("CERO").toString());
			}
			if(contador%100000==0){
				System.out.println(String.valueOf(contador).toString());
			}*/
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

		for(indice=0;indice<10;indice++){
			cont[indice]=0;
		}
		for(indice=0;indice<1000000;indice++){
			if (indice>=0 && indice<1){
				cont[0]++;
			}else{
			if(vector[indice]>=1 && vector[indice]<2){
				cont[1]++;
			}else{
			if(vector[indice]>=2 && vector[indice]<3){
				cont[2]++;
			}else{
			if(vector[indice]>=3 && vector[indice]<4){
				cont[3]++;
			}else{
			if(vector[indice]>=4 && vector[indice]<5){
				cont[4]++;
			}else{
			if(vector[indice]>=5 && vector[indice]<6){
				cont[5]++;
			}else{
			if(vector[indice]>=6 && vector[indice]<7){
				cont[6]++;
			}else{
			if(vector[indice]>=7 && vector[indice]<8){
				cont[7]++;
			}else{
			if(vector[indice]>=8 && vector[indice]<9){
				cont[8]++;
			}else{
			if(vector[indice]>=9 && vector[indice]<10){
				cont[9]++;
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
		for(int x=0;x<10;x++){
			System.out.println("CANT ["+String.valueOf(x).toString()+"):"+ String.valueOf(cont[x]).toString());
		}

		/*for(contador=0;contador<10;contador++){
			dispersiongraf+=Math.pow(cont[contador]-100000,(float)2);
		}
		System.out.println("SUMATORIA:"+ String.valueOf(dispersiongraf).toString());
		System.out.println("DISPERSION:"+ String.valueOf(dispersiongraf/10).toString());*/

		mc=new MiCanvas(cont);

		setLayout(new java.awt.BorderLayout());

		add(mc,java.awt.BorderLayout.CENTER);


		setSize(1024,728);
		setVisible(true);
	}
	/*public float GenerarNum(float n){
		float res=(float)(3*n);
		return(res-(float)Math.floor(res));

	}*/
	public static void main (String []s){
		Simulaciones sm= new Simulaciones();
		sm.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}