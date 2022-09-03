package Calculadora;

public class TestSubitracao {
	public void subitracao1 () {
		//UMA CLASSE SÓ PARA fazer testes de Subitração
		
		Subitracao sub = new Subitracao ();
		int subitracao = sub.subitracao(3, 7);
		//isso eh um test de subitracao
		System.out.println(subitracao);
		//mostrando resultado do calculo de 3 - 7
		
		subitracao = sub.subitracao(3, 0);
		//outro test de subitracao
		System.out.println(subitracao);
		//mostrando resultado do calculo de 3 - 0
		
		subitracao = sub.subitracao(0, 0);
		//outro test de subitracao
		System.out.println(subitracao);
		//mostrando resultado do calculo de 0 - 0 
		
		subitracao = sub.subitracao(3, -1);
		//outro test de subitracao
		System.out.println(subitracao);
		//mostrando resultado do calculo de 3 - (-1)
	}

}
