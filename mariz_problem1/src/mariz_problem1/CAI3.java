package mariz_problem1;
import java.util.Scanner;
import java.security.SecureRandom;

public class CAI3 {
	SecureRandom rand = new SecureRandom();
	Scanner userinput = new Scanner(System.in);
	int correctcount;
	public static void main(String[] args) {
		CAI3 app = new CAI3();
		System.out.println("This is 3");
		app.quiz();

	}
	public void quiz()
	{
		correctcount=0;
		int i = 0;
		int userans;
		for(i=1;i<11;i++)
		{
			int rand1 = rand.nextInt(10);
			int rand2 = rand.nextInt(10);
			System.out.print(i + ".");
			askQuestion(rand1, rand2);
			userans = readResponse();
			isAnswerCorrect(rand1, rand2, userans);
		}
		displayCompletionMessage();
		System.out.println("Would you like another problem set? 1 for yes, 2 for no.");
		int rerun = userinput.nextInt();
		if(rerun == 1)
		{
			quiz();
		}
		else
		{
			return;
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
		correctcount++;
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
	public void displayCompletionMessage()
	{
		int corpercent = correctcount*100/10;
		System.out.println("Your score is " + corpercent + "%.");
		if(corpercent >= 75)
		{
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		else
		{
			System.out.println("Please ask your teacher for extra help.");
		}
	}

}