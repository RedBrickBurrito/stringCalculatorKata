package mx.tec.lab;

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
			
			int sum = 0;
			for(String s: splitNumbers) {
				sum += Integer.parseInt(s);
			}
			return sum;
		}
	}
}
