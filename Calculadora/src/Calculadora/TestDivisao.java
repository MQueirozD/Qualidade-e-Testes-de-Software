package Calculadora;

public class TestDivisao {
	//UMA CLASSE SÓ PARA fazer testes de Divisão
	public void divisao1() {
		
		Divisao d = new Divisao();
		
		double divisao = d.divisao(3,7);
		//isso eh um test de divisao
		System.out.println(divisao);
		//mostrando resultado do calculo de 3 / 7
		
		divisao = d.divisao(3,0);
		//outro test de divisao
		System.out.println(divisao);
		//mostrando resultado do calculo de 3 / 0
		
		divisao = d.divisao(0,0);
		//outro test de divisao
		System.out.println(divisao);
		//mostrando resultado do calculo de 0 / 0
		
		divisao = d.divisao(3,-1);
		//outro test de divisao
		System.out.println(divisao);
		//mostrando resultado do calculo de 3 / -1
	}

}
