//BUSCAR PERIOdo

public class BP {
	public static void main(String []s){
		int contador;
		int sum=0;
		float numero=0,aux=0;
		float semilla=2147483647;

		for(contador=0;contador<1000000;contador++){
			semilla=(float)Math.sin(Math.log(Math.abs(semilla))/Math.log(2));
			numero=Math.abs(semilla);
		}
		contador=0;
		System.out.println("NUMERO MILLON:"+String.valueOf(numero).toString());
		semilla=(float)Math.sin(Math.log(Math.abs(numero))/Math.log(2));
		System.out.println("SEMILLA SIGUIENTE:"+String.valueOf(Math.abs(semilla)).toString());
		do{
			contador++;
			semilla=(float)Math.sin(Math.log(Math.abs(semilla))/Math.log(2));
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
}