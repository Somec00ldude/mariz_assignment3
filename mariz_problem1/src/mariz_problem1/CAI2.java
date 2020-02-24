package mariz_problem1;
import java.util.Scanner;
import java.security.SecureRandom;

public class CAI2 {
	SecureRandom rand = new SecureRandom();
	Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		CAI2 app = new CAI2();
		System.out.println("This is 2");
		app.quiz();

	}
	public void quiz()
	{
		int i = 0;
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
		int randcor = rand.nextInt(4);
		switch(randcor)
		{
		case 0 :
			System.out.println("Very good!");
			break;
		case 1 :
			System.out.println("Excellent!");
			break;
		case 2 :
			System.out.println("Nice work!");
			break;
		case 3 :
			System.out.println("Keep up the good work!");
			break;
		}
	}
	public void displayIncorrectResponse()
	{
		int randincor = rand.nextInt(4);
		switch(randincor)
		{
		case 0 :
			System.out.println("No. Please try again.");
			break;
		case 1 :
			System.out.println("Wrong. Try once more.");
			break;
		case 2 :
			System.out.println("Don't give up!");
			break;
		case 3 :
			System.out.println("No. Keep trying.");
			break;
		}
	}

}