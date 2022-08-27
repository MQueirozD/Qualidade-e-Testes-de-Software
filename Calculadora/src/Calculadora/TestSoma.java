package Calculadora;
//AQUI VAI TER OS TESTE DAS SOMAS
public class TestSoma {
	public void soma1 () {
		Soma s = new Soma();
		//Soma calc = new Soma();
		int soma = s.somar(3, 7);
		//isso eh um test de somar
		System.out.println(soma);
		
		soma = s.somar(3, 0);
		//outro test de somar
		System.out.println(soma);
		
		soma = s.somar(0, 0);
		//outro test somar
		System.out.println(soma);
		
		soma = s.somar(3, -1);
		//outro test de somar
		System.out.println(soma);
	}
}
