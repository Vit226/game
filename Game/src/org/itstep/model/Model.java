package org.itstep.model;

import java.util.ArrayList;

public class Model {

	private int minBarier;
	private int maxBarier;
	private int secretNumber;
	private ArrayList<Integer> yourWay = new ArrayList<Integer>();
	
	public void setSecretNumber() {
		secretNumber = (int)Math.ceil(Math.random()*(maxBarier - minBarier -1) + minBarier);
	}
	
	public int getSecretNumber() {
		return secretNumber;
	}

	public int getMinBarier() {
		return minBarier;
	}

	public void setMinBarier(int minBarier) {
		this.minBarier = minBarier;
	}

	public int getMaxBarier() {
		return maxBarier;
	}

	public void setMaxBarier(int maxBarier) {
		this.maxBarier = maxBarier;
	}

	public ArrayList<Integer> getYourWay() {
		return yourWay;
	}

	public void setYourWay(ArrayList<Integer> yourWay) {
		this.yourWay = yourWay;
	}

	public boolean checkValue(int value) {
		 yourWay.add(value);
	        if (value == secretNumber){
	            return true;
	        } else if (value > secretNumber){
	            maxBarier = value;
	            return false;
	        } else {
	            minBarier = value;
	            return false;
	        }
	     
	}
	
}
