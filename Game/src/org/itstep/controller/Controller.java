package org.itstep.controller;

import java.util.Scanner;

import org.itstep.GlobalConstant;
import org.itstep.model.Model;
import org.itstep.view.View;

public class Controller {

	Model model;
	View view;

	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
	}

	public void getNumber() {
		Scanner scanner = new Scanner(System.in);
		model.setMinBarier(GlobalConstant.PRIMATY_MIN_BARIER);
		model.setMaxBarier(GlobalConstant.PRIMARY_MAX_BARIER);
		model.setSecretNumber();
		System.out.println(model.getSecretNumber());
		
		while(!model.checkValue(inputIntValueWithScanner(scanner)));
		
		view.printCongratulation(model);
		view.printWay(model);
	}

	private int inputIntValueWithScanner(Scanner scanner) {
		int result = 0;
		view.getMessage(view.getInputMessage(model.getMinBarier(), model.getMaxBarier()));
		while(true) {
			while(!scanner.hasNextInt()) {
				view.printWrongInputInt(model);
				scanner.next();
			}
			 if ((result = scanner.nextInt()) <= model.getMinBarier() ||
	                    result >= model.getMaxBarier()) {
	                view.printWrongRangeInput(model);
	                continue ;
	            }
			 break;
		}
		
		return result;
	}
}
