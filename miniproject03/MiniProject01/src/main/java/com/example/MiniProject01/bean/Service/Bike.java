package com.example.MiniProject01.bean.Service;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vechical{
	
		
		@Override
	    public void drive() {
	        System.out.println("Bike is driving!   ------🚗");
	    }
	}


