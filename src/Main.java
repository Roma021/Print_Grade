import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;
        String anotherScore;

        do{
            System.out.println("Enter an Exam Score: ");
            grade = scanner.nextInt();

            if(grade >= 97){
                System.out.println("Your grade is A+");
            } else if(grade >= 94 && grade <= 96){
                System.out.println("Your grade is A");
            }else if(grade >= 90 && grade <= 93){
                System.out.println("Your grade is A-");
            }else if(grade >= 87 && grade <= 89){
                System.out.println("Your grade is B+");
            }else if(grade >= 84 && grade <= 86){
                System.out.println("Your grade is B");
            }else if(grade >= 80 && grade <= 83){
                System.out.println("Your grade is B-");
            }else if(grade >= 77 && grade <= 79){
                System.out.println("Your grade is C+");
            }else if(grade >= 74 && grade <= 76){
                System.out.println("Your grade is C");
            }else if(grade >= 70 && grade <= 73){
                System.out.println("Your grade is C-");
            }else if(grade >= 60 && grade <= 69){
                System.out.println("Your grade is D");
            }else if (grade < 60){
                System.out.println("Go back to school!");
            }

            System.out.println("Do you want to enter another score (Y/N)");
            anotherScore = scanner.next();
        }while(anotherScore.equalsIgnoreCase("Y"));
    }

}
