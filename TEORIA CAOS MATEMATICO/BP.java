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
			if(contador%100000==0){
							System.out.println(String.valueOf(contador).toString());
			}
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
	public static float GenerarNum(float n){
		float res=(float)(3*n);
		return(res-(float)Math.floor(res));

	}
}