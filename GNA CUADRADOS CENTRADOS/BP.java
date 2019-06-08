//BUSCAR PERIOdo

public class BP {
	public static void main(String []s){
		int contador;
		int sum=0;
		float numero=0,aux=0;
		float semilla=(float)0.999999;

		for(contador=0;contador<1000000;contador++){
			semilla=(float)GenerarNum(semilla);
			numero=Math.abs(semilla);
		}
		contador=0;
		System.out.println("NUMERO MILLON:"+String.valueOf(numero).toString());
		semilla=(float)GenerarNum(semilla);
		System.out.println("SEMILLA SIGUIENTE:"+String.valueOf(Math.abs(semilla)).toString());
		do{
			contador++;
			semilla=(float)GenerarNum(semilla);
			aux=(float)Math.abs(semilla);
			if(numero==aux){
				sum++;
			System.out.println(String.valueOf(contador).toString());
			contador=0;
			}
		}while(sum<4);

		System.out.println("NUMERO MILLON:"+String.valueOf(numero).toString());
		System.out.println("CONTADOR PERIODO:"+String.valueOf(contador).toString());

	}
	public static Long Pot(Long a){
			return(a*a);
		}
		public static double GenerarNum(float n){
			String numero="";
			String aux="";
			String def="";
			Long potencia;
			char comp;

			numero=String.valueOf(n).toString();
			//System.out.println(numero);
			for(int a=0;a<numero.length();a++){
				if(a>1){
					aux=aux+numero.charAt(a);
				}
			}
			//System.out.println(aux);
			potencia=Long.parseLong(aux);

			potencia = Pot(potencia);

			//System.out.println(String.valueOf(potencia).toString());

			aux= String.valueOf(potencia).toString();


			//System.out.println(aux);

			if(aux.length()==0){
				aux=aux+"9";
			}
			if(aux.length()==1){
				aux=aux+"9";
			}
			if(aux.length()==2){
				aux=aux+"9";
			}
			if(aux.length()==3){
				aux=aux+"9";
			}
			if(aux.length()==4){
				aux=aux+"9";
			}
			if(aux.length()==5){
				aux=aux+"9";
			}
			if(aux.length()==6){
				aux=aux+"9";
			}
			if(aux.length()==7){
				aux=aux+"9";
			}
			if(aux.length()==8){
				aux=aux+"9";
			}
			if(aux.length()==9){
				aux=aux+"9";
			}
			if(aux.length()==10){
				aux=aux+"9";
			}
			if(aux.length()==11){
				aux=aux+"9";
			}
			if(aux.length()==12){
				aux=aux+"9";
			}
			//System.out.println(aux);
			for(int a=0;a<aux.length();a++){
				if((a>2) && (a<9)){
					def=def+aux.charAt(a);
				}
			}
			numero="";
			comp=0;
			if(def.charAt(0)==comp){
				for(int a=0;a<def.length();a++){
					if(a>0){
						numero = numero + def.charAt(a);
					}
				}
				def=numero;
				numero="";
				if(def.charAt(1)==comp){
					for(int a=0;a<numero.length();a++){
						if(a>1){
							numero = numero + def.charAt(a);
						}
					}
					def=numero;
					numero="";
					if(def.charAt(2)==comp){
						for(int a=0;a<numero.length();a++){
							if(a>2){
								numero = numero + def.charAt(a);
							}
						}
						def=numero;
						numero="";
						if(def.charAt(3)==comp){
							for(int a=0;a<numero.length();a++){
								if(a>3){
									numero = numero + def.charAt(a);
								}
							}
							def=numero;
							numero="";
						}
					}
				}
			}
			if(def.length()==0){
				def=def+"9";
			}
			if(def.length()==1){
				def=def+"9";
			}
			if(def.length()==2){
				def=def+"9";
			}
			if(def.length()==3){
				def=def+"9";
			}
			if(def.length()==4){
				def=def+"9";
			}
			if(def.length()==5){
				def=def+"9";
			}

			def="0."+def;

			//System.out.println(def);
			return(Double.parseDouble(def));

	}
}