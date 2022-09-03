package CalculadoraJunitTest;

import org.junit.Test;

import Calculadora.Soma;
import Calculadora.Subitracao;
import junit.framework.Assert;

public class JunitTestSubitracao {
	
	@SuppressWarnings("deprecation")
	@Test 
	public void SubitrairDoisNumerosPositivos(){
		//Teste 1 com dois numero inteiro e positivo
		Subitracao calc = new Subitracao();
		int sub = calc.subitracao(3, 7);
		//isso eh um test
		System.out.println("Test1");
		System.out.println(sub);		
		//o resultado da sooma 3 -(+7)		
		
		Assert.assertEquals(-40, sub);
		//faz o teste falando que a soma(3 - (+7)) vai aparecer erro pq o resultado esta correto  = -4
		//e colocamos q o resultado vai ser -40
	}
	
	
	@Test 
	public void SubitrairDoisNumerosNegativos(){
		//Teste 2 com dois numero inteiro e negativo
		Subitracao calc = new Subitracao();
		int sub = calc.subitracao(-3, -7);
		//isso eh um test
		System.out.println("Test2");
		System.out.println(sub);		
		//o resultado da sooma (-3) - (-7)		
		
		Assert.assertEquals(4, sub);
		//faz o teste falando que a soma((-3) - (-7)) não vai aparecer erro pq o resultado esta correto = 4
	}
	
	@Test 
	public void SubitrairUmNumeroNegativos(){
		//Teste 3 com um numero inteiro positivo e outro numero inteiro e negativo
		Subitracao calc = new Subitracao();
		int sub = calc.subitracao(3, -7);
		//isso eh um test
		System.out.println("Test3");
		System.out.println(sub);		
		//o resultado da sooma 3 - (-7)		
		
		Assert.assertEquals(5, sub);
		//faz o teste falando que a soma(3 - (-7)) vai aparecer erro pq o resultado esta correto = 10
		//e colocamos q o resultado vai ser 5
	}
	
	@Test 
	public void SubitrairUmNumeroNegativos1(){
		//Teste 4 com um numero inteiro positivo e outro numero inteiro e negativo
		Subitracao calc = new Subitracao();
		int sub = calc.subitracao(-3, 7);
		//isso eh um test
		System.out.println("Test4");
		System.out.println(sub);		
		//o resultado da sooma (-3) - 7		
		
		Assert.assertEquals(-10, sub);
		//faz o teste falando que a soma((-3) - 7) não vai aparecer erro pq o resultado esta correto = -10
	}
	
	@Test 
	public void SubitrairUmNumeroZero(){
		//Teste 5 com um numero zero e outro numero inteiro positivo
		Subitracao calc = new Subitracao();
		int sub = calc.subitracao(3, 0);
		//isso eh um test
		System.out.println("Test5");
		System.out.println(sub);		
		//o resultado da sooma 3 - 0		
		
		Assert.assertEquals(1, sub);
		//faz o teste falando que a soma(3 - 0) vai aparecer erro pq o resultado esta correto = 3
		//e colocamos q o resultado vai ser 1
	}


}
