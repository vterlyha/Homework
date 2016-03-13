package homeWorkMain;

import java.util.Scanner;


import date100316.HomeworkKrokhmalyuk;
import edu.ita.lv179jv.homeworkTerlyha.HomeworkTerlyha;
import ua.dorab.Task323;
import ua.dorab.Task559;
import ua.dorab.Task87;


public class Main {


    public static void main(String[] args) {
        System.out.println("Hello");
        while (true) {
            menu();
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            String choise = sc.nextLine();
            switch (choise) {
                case "0":
                    System.exit(0);
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

                case "7":
                    HomeworkKrokhmalyuk.function178D();
                    break;

                case "8":
                    HomeworkKrokhmalyuk.function178G();
                    break;

                case "9":
                    HomeworkKrokhmalyuk.function555();
                    break;

                case "16":
                    Task87.main(args);
                    break;

                case "17":
                    Task323.main(args);
                    break;

                case "18":
                    Task559.main(args);
                    break;

                default:
                    break;
            }

        }

    }

    private static void menu() {
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
        System.out.println("10 for Exrecise No. 323");
        System.out.println("11 for Exrecise No. 323");
        System.out.println("12 for Exrecise No. 323");
        System.out.println("13 for Exrecise No. 81a");
        System.out.println("14 for Exrecise No. 81b");
        System.out.println("15 for Exrecise No. 330");
        System.out.println("16 for Exrecise No. 87");
        System.out.println("17 for Exrecise No. 323(Bondar)");
        System.out.println("18 for Exrecise No. 559");
    }
}


