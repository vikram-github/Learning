package com.vikram.overloading_overriding;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

public class Animal {

	
	public void eat(){
		
	}
	
	public void eat(String params){
		
	}
	
	public void run() throws IOException {
		
	}
	
//	public void eat(String pa) throws Exception{
//		
//	}
}


class Dog extends Animal {
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
	
	@Override
	public void eat(String params) {
		// TODO Auto-generated method stub
		super.eat(params);
	}
	
	@Override
	public void run() throws FileNotFoundException {
		// TODO Auto-generated method stub
		//super.run();
	}
}