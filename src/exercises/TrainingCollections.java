package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TrainingCollections {

	public static void main(String[] args) {
		List<Double> grades = new ArrayList<>();	//Creates the list
		grades.add(7.8);							//Add a value
		grades.add(0, 6d);							//Add a value on a specific place
		grades.add(9.7);
		grades.add(9.0);
		grades.add(2.4);
		grades.add(0d);
		grades.add(6.9);
		System.out.println(grades);
		System.out.println("Place of grade 7.8: Place " + grades.indexOf(7.8));
		System.out.println("This list contains a grade = zero: " + grades.contains(0d));
		System.out.println("Best grade: " + Collections.max(grades));
		
		//Sum of all values
		Iterator<Double> iterator = grades.iterator();
		Double sum = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			sum += next;
		}
		System.out.println("Sum of all grades: " + sum);
		
		//Average
		System.out.print(String.format("Grades average: %.2f", (sum/grades.size())));
		
		//Remove grades < 7
		Iterator<Double> iterator1 = grades.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7) iterator1.remove();
		}
		System.out.println("\nGood grades (>= 7): " + grades);
		
		//Create a new ArrayList. It must have all values of grades list
		List<Double> grades2 = new ArrayList<>();
		grades2 = grades;
		System.out.println("Grades2: " + grades2);
		
		//Show the first grade
		System.out.println("First grade: " + grades2.get(0));
		
		//Show the first grade and remove it
		System.out.println("First grade: " + grades2.get(0));
		grades2.remove(0);
		System.out.println("grades2 after removal: " + grades2);
	}

}
