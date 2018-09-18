package org.itstep.view;

import java.util.Locale;
import java.util.ResourceBundle;

import org.itstep.model.Model;

public class View {

	//public static final String ENTER_NUMBER = "Input INT value ";
	public static final String EQUAL_SING = "=";
    public static final String SPACE_SING = " ";
    public static final String OPENS_SQUARE_BRACKET = "[";
    public static final String CLOSING_SQUARE_BRACKET = "]";
	//public static final String WRONG_INPUT = "Wrong input! Repeat please! ";
	//public static final String WRONG_RANG = "Wrong range! Repeat please! ";
	//public static final String CONGRATULATION = "CONGRATULATION!!! Secret value = ";
	//public static final String YOUR_WAY = "YOUR WAY = ";
	
    public static final String ENTER_NUMBER = "input.int.data";
    public static final String WRONG_INPUT = "input.wrong.data";
    public static final String WRONG_RANG = "input.wrong.range";
    public static final String CONGRATULATION = "input.congratulation";
    public static final String YOUR_WAY = "input.way";
	
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua"));  // Ukrainian
                    //new Locale("en"));        // English
	
	public void getMessage(String message) {
		System.out.println(message);
	}
	
	private String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

	//public String getInputMessage(int minBarier, int maxBarier) {
	//	String text = concatenationString(ENTER_NUMBER, SPACE_SING, OPENS_SQUARE_BRACKET, String.valueOf(minBarier), SPACE_SING,
	//			String.valueOf(maxBarier), CLOSING_SQUARE_BRACKET, SPACE_SING, EQUAL_SING);
	//	return text;
	//}
	
	public String getInputMessage(int minBarier, int maxBarier) {
		String text = concatenationString(bundle.getString(ENTER_NUMBER), SPACE_SING, OPENS_SQUARE_BRACKET, String.valueOf(minBarier), SPACE_SING,
				String.valueOf(maxBarier), CLOSING_SQUARE_BRACKET, SPACE_SING, EQUAL_SING);
		return text;
	}

	//public void printWrongInputInt(Model model) {
	//	getMessage(WRONG_INPUT + getInputMessage(model.getMinBarier(), model.getMaxBarier()));
	//	
	//}
	
	public void printWrongInputInt(Model model) {
		getMessage(bundle.getString(WRONG_INPUT) + getInputMessage(model.getMinBarier(), model.getMaxBarier()));
		
	}

	//public void printWrongRangeInput(Model model) {
	//	getMessage(WRONG_RANG + getInputMessage(model.getMinBarier(), model.getMaxBarier()));
	//	
	//}
	
	public void printWrongRangeInput(Model model) {
		getMessage(bundle.getString(WRONG_RANG) + getInputMessage(model.getMinBarier(), model.getMaxBarier()));
		
	}

	//public void printCongratulation(Model model) {
	//	getMessage(CONGRATULATION + model.getSecretNumber());
	//}
	
	public void printCongratulation(Model model) {
		getMessage(bundle.getString(CONGRATULATION) + model.getSecretNumber());
	}

	//public void printWay(Model model) {
	//	getMessage(YOUR_WAY + model.getYourWay());
	//	
	//}
	
	public void printWay(Model model) {
		getMessage(bundle.getString(YOUR_WAY) + model.getYourWay());
		
	}
	
	
	
}
