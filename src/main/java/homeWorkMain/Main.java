package homeWorkMain;

import java.util.Scanner;

import edu.ita.lv179jv.homeworkTerlyha.HomeworkTerlyha;

public class Main {

	
	
	public static void main(String[] args) {
		System.out.println("Hello");
		while(true){
			menu();
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String choise = sc.nextLine();
			switch (choise) {
			case "1":
				
				break;
				
            case "10":
                HomeworkTerlyha.solveExcercise108();
                break;
            
            case "11":
                HomeworkTerlyha.solveExcercise325();
                break;
            
            case "12":
                HomeworkTerlyha.solveExcercise561();
                break;

			default:
				break;
			}
			
		}
		
	}
	
	private static void menu(){
		System.out.println("Choose the Exercise You want to solve");
		System.out.println("0 for exit");
		System.out.println("1 for Exercise No. 182");
		System.out.println("2 for Exrecise No. 323");
		System.out.println("3 for Exrecise No. 560");
		System.out.println("4 for Exrecise No. 323");
		System.out.println("5 for Exrecise No. 323");
		System.out.println("6 for Exrecise No. 323");
		System.out.println("7 for Exrecise No. 178.1");
		System.out.println("8 for Exrecise No. 178.2");
		System.out.println("9 for Exrecise No. 555");
		System.out.println("10 for Exrecise No. 108");
		System.out.println("11 for Exrecise No. 325");
		System.out.println("12 for Exrecise No. 561");
		System.out.println("13 for Exrecise No. 323");
		System.out.println("14 for Exrecise No. 323");
		System.out.println("15 for Exrecise No. 323");
	}
}


