package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionsAboutACrime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<String> questions = new ArrayList<>();
		questions.add("Did you call the victim?");
		questions.add("Were you in the crime place?");
		questions.add("Do you live near the victim's house?");
		questions.add("Did you owe to the victim?");
		questions.add("Have you ever work with the victim?");
		
		int yes = 0;
		
		System.out.println("Answer the questions with Y for yes or N for no.");
		
		for (String question : questions) {
			System.out.println(question);
			String answer = scan.next();
			if (answer.equalsIgnoreCase("Y")) yes++;
		}
		
		System.out.println("You are:");
		
		switch (yes) {
		case 2:
			System.out.println("Suspect");
			break;
		case 3:
			System.out.println("Partner");
			break;
		case 4:
			System.out.println("Partner");
			break;
		case 5:
			System.out.println("Murderer");
			break;
		default:
			System.out.println("Innocent");
		}
		scan.close();
	}

}
