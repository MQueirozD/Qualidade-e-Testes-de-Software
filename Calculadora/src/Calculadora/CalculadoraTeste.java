package Calculadora;

public class CalculadoraTeste {

	public static void main(String[] args) {
		// Chamo todos os test que fiz nas classes
		
		System.out.println("\n ================SOMA======================\n");
		//Chama TestSoma
		TestSoma ts = new TestSoma();
		ts.soma1();
		
		System.out.println("\n ================Subitrair======================\n");
		//Chama TestSubitracao
		TestSubitracao tsub = new TestSubitracao();
		tsub.subitracao1();
		
		
		System.out.println("\n ================Divisao======================\n");
		//Chama TestDivisao
		TestDivisao td = new TestDivisao();
		td.divisao1();
		
		System.out.println("\n ================Mutiplicacao======================\n");
		//Chama TestMultiplicacao
		TestMultiplicacao tm = new TestMultiplicacao();
		tm.mult1();
		

	}

}
