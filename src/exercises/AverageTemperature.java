package exercises;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AverageTemperature {
		
	protected String month;
	protected Double temperature;
	
	public AverageTemperature(String month, Double temperature) {
		this.month = month;
		this.temperature = temperature;
	}
	
	public String getMonth() {
		return month;
	}
	
	public Double getTemperature() {
		return temperature;
	}
		
	@Override
	public String toString() {
		return "\n" + month + "      \t" + "T(°C): " + temperature;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<AverageTemperature> aveTemp = new ArrayList<>();
		List<Double> onlyTemp = new ArrayList<>();

		String[] months = {"january", "february", "march", "april", "may", "june"};
		
		for(String month : months) {
			System.out.println("Average temperature of " + month + ":");
			double temp = scan.nextDouble();
			aveTemp.add(new AverageTemperature(month, temp));
			onlyTemp.add(temp);
		}
		System.out.println("Month   \t Temperature");
		System.out.println(aveTemp);
		
		Iterator<Double> iterator = onlyTemp.iterator();
		Double sum = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			sum += next;
		}
		
		System.out.println("Sum of all months temperature: " + sum);
		System.out.print(String.format("Semester Temperature Average: %.2f", (sum/onlyTemp.size())));
		
		scan.close();
	}

}
