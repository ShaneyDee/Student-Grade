import java.util.*;


public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Please enter student's grade: ");
        int grade = sc.nextInt();

        if(grade >= 90){
            System.out.println("Criteria: A Grade");
        }
        else if(grade >= 80 && grade <= 89){
            System.out.println("Criteria: B Grade");
        }
        else if(grade >= 70 && grade <= 79){
            System.out.println("Criteria: C Grade");
        }
        else if(grade >= 60 && grade <= 69){
            System.out.println("Criteria: D Grade");
        }
        else{
            System.out.println("Criteria: F Grade");
        }

        
	}
}
