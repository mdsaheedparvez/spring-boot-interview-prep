package work;

import java.util.concurrent.Callable;

public class LamdaExpression {

	public static void main(String[] args) {
		
		//also learn functional interface
		//Runnable 
//		 Callable
		
//		Myinter muMyinter = new MyinterImpl();
//		muMyinter.sayhell();
		
		//anonymous implementation
//		Myinter k = new Myinter() {
//			
//			@Override
//			public void sayhell() {
//				System.out.println("annonymous");
//			}
//		};
//		k.sayhell();
		
		//lambda
		
//		Myinter k = () ->{
//			System.out.println("hello lambda");
//		};
//		k.sayhell();
		
		//functional Interface
		
		SumInterface h = (a,b) -> System.out.println(a+b);
	
		h.sum(4, 5);
		
		
		LengthInte j = str -> str.length();
		System.out.println(j.lengt("parvezz"));
		
	}

}
