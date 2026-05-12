package com.example.MiniProject01.bean.Service;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vechical{

	@Override
   public void drive() {
	   System.out.println("car is droving");
   }
}
