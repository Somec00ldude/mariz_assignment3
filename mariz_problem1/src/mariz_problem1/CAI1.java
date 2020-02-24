package mariz_problem1;
import java.util.Scanner;
import java.security.SecureRandom;

public class CAI1 {
	Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		CAI1 app = new CAI1();
		System.out.println("This is 1");
		app.quiz();

	}
	public void quiz()
	{
		int i = 0;
		SecureRandom rand = new SecureRandom();
		int rand1 = rand.nextInt(10);
		int rand2 = rand.nextInt(10);
		askQuestion(rand1, rand2);
		while(i != 2)
		{
			int userans = readResponse();
			i = isAnswerCorrect(rand1, rand2, userans);
		}
	}
	public void askQuestion(int a, int b)
	{
		System.out.println("How much is " + a + " times " + b + "?");
	}
	public int readResponse()
	{
		int rep = userinput.nextInt();
		return rep;
	}
	public int isAnswerCorrect(int x, int y, int z)
	{
		int ye;
		if(x * y == z)
		{
			displayCorrectResponse();
			ye = 2;
			return ye;
		}
		else
		{
			displayIncorrectResponse();
			return 0;
		}
	}
	public void displayCorrectResponse()
	{
		System.out.println("Very good!");
	}
	public void displayIncorrectResponse()
	{
		System.out.println("Please try again.");
	}

}
