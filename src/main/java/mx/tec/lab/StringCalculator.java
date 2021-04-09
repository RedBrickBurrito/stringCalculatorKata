package mx.tec.lab;

public class StringCalculator {
	
	public int add(String numbers) {
		if(numbers.isBlank()) {
			return 0;
		} else {
			String[] splitNumbers = numbers.split(",");
			int sum = 0;
			for(String s: splitNumbers) {
				sum += Integer.parseInt(s);
			}
			return sum;
		}
	}
}
