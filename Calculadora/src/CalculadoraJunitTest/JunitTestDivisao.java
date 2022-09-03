package CalculadoraJunitTest;

import org.junit.Test;

import Calculadora.Divisao;
import Calculadora.Soma;
import junit.framework.Assert;

public class JunitTestDivisao {
	
	@SuppressWarnings("deprecation")
	@Test 
	public void DividirDoisNumerosPositivos(){
		//Teste 1 com dois numero inteiro e positivo
		Divisao calc = new Divisao();
		double div = calc.divisao(3, 7);
		//isso eh um test
		System.out.println("Test1");
		System.out.println(div);		
		//o resultado da sooma 3 + 7		
		
		Assert.assertEquals(0.4285714285714286, div);
		//faz o teste falando que a soma(3 / 7) não vai aparecer erro pq o resultado esta correto  = 0.4285714285714286
		
	}
	
	
	@Test 
	public void DividirDoisNumerosNegativos(){
		//Teste 2 com dois numero inteiro e negativo
		Divisao calc = new Divisao();
		//colocamos double pq divisão o resultado vai ter numeros dps da virgula
		double div = calc.divisao(-3, -7);
		//isso eh um test
		System.out.println("Test2");
		System.out.println(div);		
		//o resultado da sooma (-3) + (-7)		
		
		Assert.assertEquals(0.42857142857, div);
		//faz o teste falando que a soma((-3) / (-7)) não vai aparecer erro pq o resultado esta correto = 0.42857142857
	}
	
	@Test 
	public void DividirUmNumeroNegativos(){
		//Teste 3 com um numero inteiro positivo e outro numero inteiro e negativo
		Divisao calc = new Divisao();
		double div = calc.divisao(3, -7);
		//isso eh um test
		System.out.println("Test3");
		System.out.println(div);		
		//o resultado da sooma 3 / (-7)		
		
		Assert.assertEquals(-0.42857142857, div);
		//faz o teste falando que a soma(3 / (-7)) não vai aparecer erro pq o resultado esta correto = -0.42857142857			
	}
	
	@Test 
	public void DividirUmNumeroNegativos1(){
		//Teste 4 com um numero inteiro positivo e outro numero inteiro e negativo
		Divisao calc = new Divisao();
		double div = calc.divisao(-3, 7);
		//isso eh um test
		System.out.println("Test4");
		System.out.println(div);		
		//o resultado da sooma (-3) / 7		
		
		Assert.assertEquals(-0.42857142857, div);
		//faz o teste falando que a soma((-3) / 7) não vai aparecer erro pq o resultado esta correto = -0.42857142857
	}
	
	@Test 
	public void DividirUmNumeroZero(){
		//Teste 5 com um numero zero e outro numero inteiro positivo
		Divisao calc = new Divisao();
		double div = calc.divisao(3, 0);
		//isso eh um test
		System.out.println("Test5");
		System.out.println(div);		
		//o resultado da sooma 3 / 7		
		
		Assert.assertEquals(1, div);
		//faz o teste falando que a soma(3 / 0) vai aparecer erro pq o resultado esta correto = infinito
		//e colocamos q o resultado vai ser 1
	}



}
