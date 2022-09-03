package Calculadora;

public class TestMultiplicacao {
	public void mult1 () {
		//UMA CLASSE SÓ PARA fazer testes de Mutiplicacao
		Mutiplicacao m = new Mutiplicacao();{
			
			double mutiplicacao = m.mutiplicacao(3, 7);
			//isso eh um test de mutiplicacao
			System.out.println(mutiplicacao);
			//mostrando resultado do calculo de 3 * 7
			
			mutiplicacao = m.mutiplicacao(3,0);			
			//outro test de mutiplicacao
			System.out.println(mutiplicacao);
			//mostrando resultado do calculo de 3 * 0
			
			mutiplicacao = m.mutiplicacao(0,0);			
			//outro test de mutiplicacao
			System.out.println(mutiplicacao);
			//mostrando resultado do calculo de 0 * 0
			
			mutiplicacao = m.mutiplicacao(3,-1);			
			//outro test de mutiplicacao
			System.out.println(mutiplicacao);
			//mostrando resultado do calculo de 3 * (-1)
		}
		
	}


}
