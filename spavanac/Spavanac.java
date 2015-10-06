import java.util.Scanner;

public class Spavanac {

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		int hours = in.nextInt();

		int minutes = in.nextInt();

		if(minutes < 45){
			if(hours == 0){
				System.out.println(23+" "+(minutes+15));

			}
			else {
				System.out.println((hours-1)+" "+(minutes+15));

			}


		}
		else {

			System.out.println(hours+" "+(minutes-45));

		}

	}



}