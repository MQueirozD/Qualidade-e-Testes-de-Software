package Calculadora;

public class TestDivisao {
	public void divisao1() {
		Divisao d = new Divisao();
		
		double divisao = d.divisao(3,7);
		//isso eh um test de divisao
		System.out.println(divisao);
		divisao = d.divisao(3,0);
		//outro test de divisao
		System.out.println(divisao);
		divisao = d.divisao(0,0);
		//outro test de divisao
		System.out.println(divisao);
		divisao = d.divisao(3,-1);
		//outro test de divisao
		System.out.println(divisao);
	}

}
