package Calculadora;

public class TestMultiplicacao {
	public void mult1 () {
		//UMA CLASSE SÓ PARA Mutiplicacao
		Mutiplicacao m = new Mutiplicacao();{
			
			double mutiplicacao = m.mutiplicacao(3, 7);
			//isso eh um test de mutiplicacao
			System.out.println(mutiplicacao);
			mutiplicacao = m.mutiplicacao(3,0);
			
			//outro test de mutiplicacao
			System.out.println(mutiplicacao);
			mutiplicacao = m.mutiplicacao(0,0);
			
			//outro test de mutiplicacao
			System.out.println(mutiplicacao);
			mutiplicacao = m.mutiplicacao(3,-1);
			
			//outro test de mutiplicacao
			System.out.println(mutiplicacao);
		}
		
	}


}
