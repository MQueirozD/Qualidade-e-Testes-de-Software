package Calculadora;

public class TestSubitracao {
	public void subitracao1 () {
		Subitracao sub = new Subitracao ();
		int subitracao = sub.subitracao(3, 7);
		//isso eh um test de subitracao
		System.out.println(subitracao);
		
		subitracao = sub.subitracao(3, 0);
		//outro test de subitracao
		System.out.println(subitracao);
		
		subitracao = sub.subitracao(0, 0);
		//outro test de subitracao
		System.out.println(subitracao);
		
		subitracao = sub.subitracao(3, -1);
		//outro test de subitracao
		System.out.println(subitracao);
	}

}
