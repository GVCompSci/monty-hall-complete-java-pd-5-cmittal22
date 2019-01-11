
//@author chet mittal 22
import java.util.Random;
import java.util.Scanner;

public class MontyHallSimulationComplete 
{

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		Scanner userChoice = new Scanner(System.in);

		Random rand = new Random();
		// System.out.print(rand.nextInt(3) + 1);
		int lose = 0;
		int win = 0;
		System.out.print("How many times would you like to run the simulation?:  ");
		int timesrun = user.nextInt();
		int pick1 = 0;

		while (timesrun < 10 || timesrun > 10000) {
			System.out.print("Must enter a number between 10 and 10000:  ");
			timesrun = user.nextInt();
		}

		System.out.print("Would you like to switch doors everytime or stay with the same door everytime?:  ");
		String swost = userChoice.nextLine();

		int count = 0;
		while (count < timesrun) {
			count++;
			int car = rand.nextInt(3) + 1;
			pick1 = rand.nextInt(3) + 1;
			if (swost.equals("stay") && car != pick1) {
				lose++;
				continue;
			} else if (swost.equals("stay") && pick1 == car) {
				win++;
				continue;
			}
			else if(swost.equals("switch") && pick1 == car)
			{
				lose++;
			}
			else if(swost.equals("switch") && pick1 != car)
			{
				win++;
			}
			

		}
		System.out.print("The player won " + win + "/" + timesrun + " ( " + (win*100)/timesrun + "% )");
	}
	
}