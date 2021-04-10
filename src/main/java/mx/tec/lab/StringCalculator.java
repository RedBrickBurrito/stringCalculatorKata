package mx.tec.lab;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
	
	public int add(String numbers) {
		String delimeter = ",";
		if(numbers.isBlank()) {
			return 0;
		} else {
			String sanitizedNumbers = numbers;
			if(numbers.startsWith("//")) {
				//extract delimeter
				delimeter = numbers.substring(2,3);
				//cut first three characters
				sanitizedNumbers = numbers.substring(4);
			}
			String[] splitNumbers = sanitizedNumbers.split("\\n|" + delimeter);
			List<Integer> negativeNumbers = new ArrayList<>();
			int sum = 0;
			for(String s: splitNumbers) {
				int number = Integer.parseInt(s);
				if(number < 0) {
					negativeNumbers.add(number);
				}
				sum += number;
			}
			
			if(!negativeNumbers.isEmpty()) {
				throw new UnsupportedOperationException("negatives not allowed " + negativeNumbers);
			}
			return sum;
		}
	}
}
