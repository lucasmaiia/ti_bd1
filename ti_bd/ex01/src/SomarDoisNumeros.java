import java.util.*;

class SomarDoisNumeros {
	public static Scanner auxsc= new Scanner (System.in);
	
	public static void main (String args[]) {
		// variables
		int number1, number2, result;
		
		// reading part
		System.out.println("Digite um número:");
		number1=auxsc.nextInt();
		System.out.println("Digite outro número:");
		number2=auxsc.nextInt();
		
		// sum
		result=number1+number2;
		
		// all prints
		System.out.println("Resultado: "+ result);
	}
}