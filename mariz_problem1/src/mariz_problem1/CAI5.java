package mariz_problem1;
import java.util.Scanner;
import java.security.SecureRandom;

public class CAI5 {
	SecureRandom rand = new SecureRandom();
	Scanner userinput = new Scanner(System.in);
	int correctcount;
	int probvar;
	public static void main(String[] args) {
		CAI5 app = new CAI5();
		System.out.println("This is 5");
		app.quiz();

	}
	public void quiz()
	{
		correctcount=0;
		int i = 0;
		int userans;
		float divuserans;
		int probtype = readProblemtype();
		int userdif = readDifficulty();
		for(i=1;i<11;i++)
		{
			int rand1 = generateQuestionArgument(userdif);
			int rand2 = generateQuestionArgument(userdif);
			System.out.print(i + ".");
			askQuestion(rand1, rand2, probtype);
			if(probvar == 4)
			{
				divuserans = readDivResponse();
				isDivAnswerCorrect(rand1, rand2, divuserans);
			}
			else 
			{
				userans = readResponse();
				isAnswerCorrect(rand1, rand2, userans, probvar);
			}
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
	public void askQuestion(int a, int b, int c)
	{
		if(c == 5)
		{
			c = rand.nextInt(4) + 1;
		}
		switch(c)
		{
		case 1 :
			System.out.println("How much is " + a + " plus " + b + "?");
			probvar = 1;
			break;
		case 2 :
			System.out.println("How much is " + a + " times " + b + "?");
			probvar = 2;
			break;
		case 3 :
			System.out.println("How much is " + a + " minus " + b + "?");
			probvar = 3;
			break;
		case 4 :
			System.out.println("How much is " + a + " divided by " + b + "? Must be within .5 of answer.");
			probvar = 4;
			break;
		}
	}
	public int readResponse()
	{
		int rep = userinput.nextInt();
		return rep;
	}
	public float readDivResponse()
	{
		float divrep = userinput.nextFloat();
		return divrep;
	}
	public int isAnswerCorrect(int x, int y, int z, int w)
	{
		int ye;
		switch(w)
		{
		case 1 :
			if(x + y == z)
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
		case 2 :
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
		case 3 :
			if(x - y == z)
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
		return 0;
		
	}
	public int isDivAnswerCorrect(int x, int y, float z)
	{
		int ye;
		if(y == 0)
		{
			x = 0;
			y = 1;
		}
		float x1 = x;
		float y1 = y;
		float divans = x1/y1;
		float divanslowbound = divans - (float)0.5;
		float divanshighbound = divans + (float).5;
		if(z > divanslowbound && z < divanshighbound)
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
	public int readDifficulty()
	{
		System.out.println("Enter your difficulty level.");
		int diflevel = userinput.nextInt();
		if(diflevel < 1 || diflevel > 4)
		{
			System.exit(0);
		}
		return diflevel;
	}
	public int generateQuestionArgument(int yehaw)
	{
		int randoboi;
		if(yehaw == 1)
		{
			randoboi = rand.nextInt(10);
			return randoboi;
		}
		else if(yehaw == 2)
		{
			randoboi = rand.nextInt(100);
			return randoboi;
		}
		else if(yehaw == 3)
		{
			randoboi = rand.nextInt(1000);
			return randoboi;
		}
		else if(yehaw == 4)
		{
			randoboi = rand.nextInt(10000);
			return randoboi;
		}
		else
		{
			return 0;
		}
	}
	public int readProblemtype()
	{
		System.out.println("What type of problem would you like? 1 for addition, 2 for multiplication, 3 for subtraction, 4 for division, 5 for mixed");
		int userprob = userinput.nextInt();
		return userprob;
	}

}
