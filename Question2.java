import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int u=0,c=0;
		char p1,p2;
		char[] arr = {'R','P','S'};
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		for(int i=0;i<3;i++) {
			System.out.println("\n"+(i+1)+"st Round:");
			System.out.println("Enter user's choice:");
			p1 = sc.next().charAt(0);
			int x = r.nextInt(arr.length);
			p2 = arr[x];
			System.out.println("Computer's choice:\n"+p2);
			if (p1==p2)
				System.out.println("Tie of round");
			if (p1 == 'R' && p2 == 'S') {
				System.out.println("User won the round");
				u++;
			}
			if (p1 == 'S' && p2 == 'P') {
				System.out.println("User won the round");
				u++;
			}
			if (p1 == 'P' && p2 == 'R') {
				System.out.println("User won the round");
				u++;
			}
			if (p2 == 'R' && p1 == 'S') {
				System.out.println("Computer won the round");
				c++;
			}
			if (p2 == 'S' && p1 == 'P') {
				System.out.println("Computer won the round");
				c++;
			}
			if (p2 == 'P' && p1 == 'R') {
				System.out.println("computer won the round");
				c++;
			}
		}
		if(u>c)
			System.out.println("3 Rounds over, user scored "+u+", User Won the game.");
		else if(c>u)
			System.out.println("3 Rounds over, Computer scored "+c+", Computer Won the game.");
		else
			System.out.println("3 rounds over, game tie");
	}

}
