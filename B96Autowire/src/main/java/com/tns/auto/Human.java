package com.tns.auto;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	private Heart heart; // creating reference of heart class in human class
	
	@Autowired
	public Human() {
		super();
	}
	
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

   
	public Heart getHeart() {
		return heart;
	}
	
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void startPumping() {
		if(heart!=null) {
			heart.pump();
		}
		else {
			System.out.println("Not Alive");
		}
	}
	
	
	
	

}


