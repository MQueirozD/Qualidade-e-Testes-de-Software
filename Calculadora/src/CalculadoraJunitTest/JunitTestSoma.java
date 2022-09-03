package CalculadoraJunitTest;

import org.junit.Test;

import Calculadora.Divisao;
import Calculadora.Soma;
import junit.framework.Assert;

public class JunitTestSoma {

	@SuppressWarnings("deprecation")
	@Test 
	public void SomarDoisNumerosPositivos(){
		//Teste 1 com dois numero inteiro e positivo		
		Soma calc = new Soma();
		int soma = calc.somar(3, 7);
		//isso eh um test
		System.out.println("Test1");
		System.out.println(soma);		
		//o resultado da sooma 3 + 7		
		
		Assert.assertEquals(20, soma);
		//faz o teste falando que a soma(3 + 7) vai aparecer erro pq o resultado esta correto  = 10
		//e colocamos q o resultado vai ser 20
	}
	
	
	@Test 
	public void SomarDoisNumerosNegativos(){
		//Teste 2 com dois numero inteiro e negativo
		Soma calc = new Soma();
		int soma = calc.somar(-3, -7);
		//isso eh um test
		System.out.println("Test2");
		System.out.println(soma);		
		//o resultado da sooma (-3) + (-7)		
		
		Assert.assertEquals(-10, soma);
		//faz o teste falando que a soma((-3) + (-7)) não vai aparecer erro pq o resultado esta correto = -10
	}
	
	@Test 
	public void SomarUmNumeroNegativos(){
		//Teste 3 com um numero inteiro positivo e outro numero inteiro e negativo
		Soma calc = new Soma();
		int soma = calc.somar(3, -7);
		//isso eh um test
		System.out.println("Test3");
		System.out.println(soma);		
		//o resultado da sooma 3 + (-7)		
		
		Assert.assertEquals(-10, soma);
		//faz o teste falando que a soma(3 + (-7)) vai aparecer erro pq o resultado esta correto = -4	
		//e colocamos q o resultado vai ser -10
	}
	
	@Test 
	public void SomarUmNumeroNegativos1(){
		//Teste 4 com um numero inteiro positivo e outro numero inteiro e negativo
		Soma calc = new Soma();
		int soma = calc.somar(-3, 7);
		//isso eh um test
		System.out.println("Test4");
		System.out.println(soma);		
		//o resultado da sooma (-3) + 7		
		
		Assert.assertEquals(4, soma);
		//faz o teste falando que a soma((-3) + 7) não vai aparecer erro pq o resultado esta correto = 4
	}
	
	@Test 
	public void SomarUmNumeroZero(){
		//Teste 5 com um numero zero e outro numero inteiro positivo
		Soma calc = new Soma();
		int soma = calc.somar(3, 0);
		//isso eh um test
		System.out.println("Test5");
		System.out.println(soma);		
		//o resultado da sooma 3 + 0		
		
		Assert.assertEquals(3, soma);
		//faz o teste falando que a soma(3 + 0) não vai aparecer erro pq o resultado esta correto = 3
	}

}
