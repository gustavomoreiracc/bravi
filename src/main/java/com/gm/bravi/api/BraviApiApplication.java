package com.gm.bravi.api;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BraviApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BraviApiApplication.class, args);	
//		System.out.println(balanced("()2"));
	}
	
	private static boolean balanced(String expression) {
		
		List<String> aberto = Arrays.asList("(", "{","[");
		List<String> fechado = Arrays.asList(")", "}","]");
	    
		Stack<String> stack = new Stack<>();
		String[] splitExpression = expression.split("");
		for (int i = 0; i < splitExpression.length; i++) {
			String caracter = splitExpression[i];
			if(aberto.contains(caracter)) {
				stack.push(caracter);
				continue;
			}else if (fechado.contains(caracter)){
				if(!stack.pop().equals(simboloOposto(caracter))) {
                    break;
                }
            }	
		}
		return stack.isEmpty();
	}
	private static String simboloOposto(String caracter){
				switch (caracter) {
				case ")":
					return "(";
				case "}":
					return "}";
			}
			return "[";
	}
}
