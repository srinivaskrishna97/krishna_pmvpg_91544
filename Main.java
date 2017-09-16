package studentalign;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Student[] test = new Student[7];

        for(int i=0;i<7;i++)

        {
             Scanner kb = new Scanner(System.in);

              System.out.println("What is the Students ID number?: ");
           test[i].setid(kb.nextLine());
 
              System.out.println("What is the Students name?: ");
            test[i].setfullName(kb.nextLine());

              System.out.println("What is Date of birth: ");
           test[i].setbirthDate(kb.nextLine());

              
              System.out.println("What is Date of birth: ");
           test[i].setavgMark(kb.nextLine());
		}
		System.out.println("ID            " + "Fullname    "+

             "Date of birth        "+ "Average");
          for(int x=0; x<7;x++)

           {

            System.out.print(test[x].mySetw(test[x].getName(), 15));

            System.out.print(test[x].mySetw(test[x].getIdnum(), 15));

            System.out.print(test[x].mySetw(test[x].getMajor(), 15));

            System.out.print(test[x].getAverage());

        }

    }

}
