package Calculadora;

public class TestSoma {
	public void soma1 () {
		//UMA CLASSE SÓ PARA fazer testes de Soma
		Soma s = new Soma();
		
		int soma = s.somar(3, 7);
		//isso eh um test de somar
		System.out.println(soma);
		//mostrando resultado do calculo de 3 + 7
		
		soma = s.somar(3, 0);
		//outro test de somar
		System.out.println(soma);
		//mostrando resultado do calculo de 3 + 0
		
		soma = s.somar(0, 0);
		//outro test somar
		System.out.println(soma);
		//mostrando resultado do calculo de 0 + 0
		
		soma = s.somar(3, -1);
		//outro test de somar
		System.out.println(soma);
		//mostrando resultado do calculo de 3 + (-1)
	}
}
