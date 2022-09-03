package CalculadoraJunitTest;

import org.junit.Test;

import Calculadora.Divisao;
import Calculadora.Multiplicacao;
import Calculadora.Soma;
import junit.framework.Assert;

public class JunitTestMultiplicacao {
	
	@SuppressWarnings("deprecation")
	@Test 
	public void MultiplicaDoisNumerosPositivos(){
		//Teste 1 com dois numero inteiro e positivo
		Multiplicacao calc = new Multiplicacao();
		int mult = calc.mutiplicacao(3, 7);
		//isso eh um test
		System.out.println("Test1");
		System.out.println(mult);		
		//o resultado da sooma 3 * 7		
		
		Assert.assertEquals(21, mult);
		//faz o teste falando que a soma(3 * 7) não vai aparecer erro pq o resultado esta correto = 21
	}
	
	
	@Test 
	public void MultiplicaDoisNumerosNegativos(){
		//Teste 2 com dois numero inteiro e negativo
		Multiplicacao calc = new Multiplicacao();
		int mult = calc.mutiplicacao(-3, -7);
		//isso eh um test
		System.out.println("Test2");
		System.out.println(mult);		
		//o resultado da sooma (-3) * (-7)		
		
		Assert.assertEquals(21, mult);
		//faz o teste falando que a soma((-3) * (-7)) não vai aparecer erro pq o resultado esta correto = 21
	}
	
	@Test 
	public void MultiplicaUmNumeroNegativos(){
		//Teste 3 com um numero inteiro positivo e outro numero inteiro e negativo
		Multiplicacao calc = new Multiplicacao();
		int mult = calc.mutiplicacao(3, -7);
		//isso eh um test
		System.out.println("Test3");
		System.out.println(mult);		
		//o resultado da sooma 3 * (-7)		
		
		Assert.assertEquals(-2, mult);
		//faz o teste falando que a soma(3 * (-7)) vai aparecer erro pq o resultado esta correto = -21
		//e colocamos q o resultado vai ser -2
	}
	
	@Test 
	public void MultiplicaUmNumeroNegativos1(){
		//Teste 4 com um numero inteiro positivo e outro numero inteiro e negativo
		Multiplicacao calc = new Multiplicacao();
		int mult = calc.mutiplicacao(-3, 7);
		//isso eh um test
		System.out.println("Test4");
		System.out.println(mult);		
		//o resultado da sooma (-3) * 7		
		
		Assert.assertEquals(-21, mult);
		//faz o teste falando que a soma((-3) * 7) não vai aparecer erro pq o resultado esta correto = -21
	}
	
	@Test 
	public void MultiplicaUmNumeroZero(){
		//Teste 5 com um numero zero e outro numero inteiro positivo
		Multiplicacao calc = new Multiplicacao();
		int mult = calc.mutiplicacao(3, 0);
		//isso eh um test
		System.out.println("Test5");
		System.out.println(mult);		
		//o resultado da sooma 3 * 7		
		
		Assert.assertEquals(0, mult);
		//faz o teste falando que a soma(3 * 0) não vai aparecer erro pq o resultado esta correto = 0
	}


}
