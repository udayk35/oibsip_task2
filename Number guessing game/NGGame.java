import java.util.Scanner;

public class NGGame {
    public static void main(String[] args) throws InterruptedException {
    int score=0;
    try (Scanner obj = new Scanner(System.in)) {
        System.out.println("\n\n");
        star(15);
        System.out.print(" Welcome to NGG ");
        star(15);
        System.out.println("\n");
        System.out.println("Enter anything except number to exit");
        for(int i=0;i<5;i++)
        {
            int attempts=(i+1)*5;
            System.out.println("\nLevel "+(i+1)+": ");
            int l=(int)Math.pow(10,i);
            int h=(int)Math.pow(10,i+1);
            int number=(int) (Math.random()*(h-l+1));
            int q=Math.max(l/10,1);
            while(number<l)
            {
                number=number*10+(int)(Math.random()*10);
            }
            System.out.println("Guess the Number between "+l+" and "+h);
            int guess=obj.nextInt();

            while(attempts>0)
            {
                if(guess==number)
                {
                    break;
                }
                else if(attempts!=1)
                {if(guess<number)
                {
                    System.out.println("Try again! The number is greater");
                }
                else
                {
                    System.out.println("Try again! The number is Lesser");
                }
                
                guess=obj.nextInt();
            }
                attempts--;
            }
            score+=attempts*10;
            if(i!=4)
            System.out.println("Congratulations!!! Your Score is "+score+".");
            else
            System.out.println("Congratulations!!! Your final Score is "+score+".");
            if(attempts==0 || i==5)
            { 
            break;
            }
            else 
            {   if(i!=4)
                {
                System.out.print("\nEntering into next level");
                for(int t=0;t<4;t++)
                {
                    System.out.print(".");
                    Thread.sleep(1000);
                }
                System.out.println();
            }
            }
        }
    }
    catch(Exception e)
    {
        System.out.println("\nYou exited the game with the score of "+score+".");
    }
    finally
    {
        System.out.print("\nThe game ended");
        for(int t=0;t<4;t++)
                {
                    System.out.print(".");
                    Thread.sleep(1000);
                }
                System.out.println();
    }
}
static void star(int n)
{
    for(int i=0;i<n;i++)
    System.out.print("*");
}
}
