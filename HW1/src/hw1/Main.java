package hw1;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("Please enter your weight(kg) and height(cm): "); 
		String text = buf.readLine(); 
		String[] data = text.split(" ");
		double res = getBMI(data);
		String dia = getDiagnosis(res);
		System.out.println(dia + " BMI: " + res); 
               
	}
	
	public static double getBMI(String[] data) {
		
		double weight = Double.parseDouble(data[0]);
		double height = Double.parseDouble(data[1]);
		double height_in_meters = 0.01 * height;
		double bmi = weight / (height_in_meters * height_in_meters);
		BigDecimal bd = new BigDecimal(bmi).setScale(2, RoundingMode.HALF_UP);
	    double res = bd.doubleValue();
	    
		return res;
	}
	
	public static String getDiagnosis(double bmi) {
		
		String obese = "You are not in shape. Actually, you're not even close.";
		String overweight = "To be honest, you are not in shape.";
		String normal = "You are in shape.";
		String thinness = "You are under shape.";
		String dia = "";
		
		if(bmi>=30) {
			dia = obese;
		}
		else if(26<=bmi&& bmi<30) {
			dia = overweight;
		}
		else if(20<=bmi && bmi<26) {
			dia = normal;
		}
		else {
			dia = thinness;
		}
		
		return dia;
	}
}


