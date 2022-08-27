package Calculadora;

public class CalculadoraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n ================SOMA======================\n");
		TestSoma ts = new TestSoma();
		ts.soma1();
		
		System.out.println("\n ================Subitrair======================\n");
		TestSubitracao tsub = new TestSubitracao();
		tsub.subitracao1();
		
		
		System.out.println("\n ================Divisao======================\n");
		TestDivisao td = new TestDivisao();
		td.divisao1();
		
		System.out.println("\n ================Mutiplicacao======================\n");
		TestMultiplicacao tm = new TestMultiplicacao();
		tm.mult1();
		

	}

}
