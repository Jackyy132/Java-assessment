import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;
public class Main {
	static Scanner input = new Scanner(System.in);
	static int x = 100;
	static int y = 100;
	static int[][] array = new int[x][y];
	static int StartiPosition = (CreatePositions());
	static int StartjPosition = (CreatePositions());
	static int KeyiPosition = (CreatePositions());
	static int KeyjPosition = (CreatePositions());
	
	public static void main(String[] Jacky) {
		System.out.println("You are playing...");
		Sleep(2);
		System.out.println("Game name: 'LOST' - Road man edition");
		Sleep(5);
		CharacterName();
		
		System.out.println("Foggy clouds baaaaareeeeeeeeeeeeee up in my grill it aint even funny yo... ");
		Sleep(4);
		System.out.println("Bare murkey water all up in my £100 creps fam wag1 still though...");
		Sleep(4);
		System.out.println("Some green tings bare poking out to say wag1 to me though, does man wanna throw hands or su'tin?");
		Sleep(4);
		System.out.println("Like... go up down left right n that, mans bare lost ");
		Sleep(4);
		System.out.println("Bro, mans got some next device on me wrist fam, yo looks like a rolex n that ");
		Sleep(4);
		System.out.println("Wait... this cheap ass rolex don't even tell time though? Bruh might have to dash this away still...");
		Sleep(4);
		System.out.println("Nahhh g, man can't be living out 'ere like this, yo fam guide me outta here, you get me?");
		Sleep(4);
		String UserChoice;
		//System.out.println("I AM THE START I POSITION " + StartiPosition);
		//System.out.println("I AM THE START J POSITION " + StartjPosition);
		//System.out.println("I AM THE KEY I POSITION " + KeyiPosition);
		//System.out.println("I AM THE KEY J POSITION " + KeyjPosition);
		
		CreateMap();
		while (StartiPosition == KeyiPosition && StartjPosition == KeyjPosition) {
			 KeyiPosition = (CreatePositions());
			 //System.out.println("IF I AM THE SAME, NEW KEY I POSITION" + KeyiPosition);
			 KeyjPosition = (CreatePositions());
			 //System.out.println("IF I AM THE SAME, NEW KEY J POSITION" + KeyjPosition);
		}
		//Player start position
		array[StartiPosition][StartjPosition] = 1;
		//Key start position
		//array[KeyiPosition][KeyjPosition] = 2;
		
		
		do {
			System.out.println("------------------------------------------------------------------");
			System.out.println("Game name: 'LOST' - Road man edition");
			System.out.println("Bad man Menu");
			System.out.println("Pick su'tin below and it will happen init");
			System.out.println("A) Do some mad maths to see how far you are to the key");
			System.out.println("B) Use mad looking watch to choose direction");
			System.out.println("C) Load up a map n that");
			System.out.println("D) Duck from game");
			System.out.println("------------------------------------------------------------------");
			UserChoice = input.next().toUpperCase();
			if (UserChoice.equals("A")) {
				int MadCalculations = 3;
				System.out.println("Doing some mad calculations... Give me one second...");
				Sleep(MadCalculations);
				
				System.out.println(CheckDistance(StartiPosition,StartjPosition,KeyiPosition,KeyjPosition));
			}
			if (UserChoice.equals("B")) {
				Direction();	
				System.out.println(WinCondition());
				
			}
			if (UserChoice.equals("C")) {
				LookAtMap();
				Sleep(4);
			}
			
		}while(!UserChoice.equals("D"));
	}
	
	
	public static void Direction() {
		String Direction;
		boolean LoopMore = true;
		System.out.println("Which direction do you want to go? North, South, East or West?" );
		Direction = input.next().toUpperCase();	
		
		while (LoopMore == true) {
			switch(Direction) {
			case "NORTH": 
				if ((StartiPosition - 1) < 0) {
					System.out.println("YOOO BABY GIRL?! YOU GON FALL OUT THE MAP! CAREFUL NOW...");
					Direction = input.next().toUpperCase();
				}
				else {
					array[StartiPosition][StartjPosition] = 0;
					array[StartiPosition-1][StartjPosition] = 1;
					StartiPosition--;
					System.out.println("You have moved " + Direction + "...");
					LoopMore = false;
				}
				break;
			case "EAST":
				if ((StartjPosition + 1) > (y-1)) {
					System.out.println("YOOO BABY GIRL?! YOU GON FALL OUT THE MAP! CAREFUL NOW...");
					Direction = input.next().toUpperCase();
				}
				else {
					array[StartiPosition][StartjPosition] = 0;
					array[StartiPosition][StartjPosition+1] = 1;
					StartjPosition++;
					System.out.println("You have moved " + Direction + "...");
					LoopMore = false;
				}
				break;
			case "SOUTH":
				if ((StartiPosition + 1) > (x-1)) {
					System.out.println("YOOO BABY GIRL?! YOU GON FALL OUT THE MAP! CAREFUL NOW...");
					Direction = input.next().toUpperCase();
				}
				else {
					array[StartiPosition][StartjPosition] = 0;
					array[StartiPosition+1][StartjPosition] = 1;
					StartiPosition++;
					System.out.println("You have moved " + Direction + "...");
					LoopMore = false;
				}
				break;
			case "WEST":
				if ((StartjPosition - 1) < 0) {
					System.out.println("YOOO BABY GIRL?! YOU GON FALL OUT THE MAP! CAREFUL NOW...");
					Direction = input.next().toUpperCase();
				}
				else {
					array[StartiPosition][StartjPosition] = 0;
					array[StartiPosition][StartjPosition-1] = 1;
					StartjPosition--;
					System.out.println("You have moved " + Direction + "...");
					LoopMore = false;
				}
				break;
			default:
				System.out.println("Nani?! Man dont get it? '" + Direction + "'... Type either 'north' 'east' 'south' or 'west' fam");
				Direction = input.next().toUpperCase();
				}
			}
		}
	
	

	public static void CreateMap() {
		
		//Set all map to 0's
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				array[i][j] = 0;
			}
		}

		//testing purposes to see map
//		for (int i = 0; i < x; i++) {
//			for (int j = 0; j < y; j++) {
//				System.out.print(array[i][j]);
//			}
//			System.out.println();
//		}
		
	
	}
	public static void LookAtMap() {
		System.out.println("Yo boo, like dis a map to tell you where we at in it");
		System.out.println("Outta all the 0's ere, you the '1' for me baby girl ;) but if you a guy, nahh you a 1/10 still");
		
		for (int i = 0; i < x; i++) {
		for (int j = 0; j < y; j++) {
			System.out.print(array[i][j]);
		}
		System.out.println();
	}
	}
	
	public static int CreatePositions() {
		Random random = new Random();
		return random.nextInt(x);
	}
	
	public static String CheckDistance(int StartiPosition,int StartjPosition,int KeyiPosition,int KeyjPosition) {
		int DistanceI = StartiPosition - KeyiPosition;
		int DistanceJ = StartjPosition - KeyjPosition;
		if (DistanceI < 0) {
			DistanceI = DistanceI * -1;
		}
		if (DistanceJ < 0) {
			DistanceJ = DistanceJ * -1;
		}
		int TotalDistanceAway = DistanceI + DistanceJ;
		

		//System.out.println("I AM THE TOTAL DISTANCE AWAY TING " + TotalDistanceAway);
		return  "You are " + TotalDistanceAway + "m's away from the key... to my heart baby girl";
		
		
	}
	
	public static String WinCondition() {
		if (StartiPosition == KeyiPosition && StartjPosition == KeyjPosition) {
			return "YOU FOUND THE HEART BABY GIRL! YOU WIN!! Your prize? it's obviously me baby girl...";
		}
		return "Come on baby girl, choose the right way...";
		
		
	}
	
	public static void Sleep(int MadTimeDelay) {
		try {
			TimeUnit.SECONDS.sleep(MadTimeDelay);
		} catch (InterruptedException e) {
			System.out.println("Nani?");
			e.printStackTrace();
		}
	}
	
	public static void CharacterName() {
		String Name;
		String Gender;
		int IncorrectTimes = 0;
		boolean GenderCatch = false;
		System.out.println("Yo like, Welcome init, whats your name n that?");
		Name = input.nextLine();
		
		do {
			System.out.println("Are you boy or girl? ");
			Gender = input.next().toLowerCase();
			if (Gender.equals("boy") || (Gender.equals("girl"))){
				GenderCatch = true;
			}
			else {
				IncorrectTimes++;
				if(IncorrectTimes == 5) {
					System.out.println("Yo bruddah, type either boy or girl, is not that hard... I can play this game all day yo");
				}
				if(IncorrectTimes == 10) {
					System.out.println("Ite, whatever, you do you boo boo, keep playing this game with me...");
				}
				GenderCatch = false;

			}
			
		}while(GenderCatch == false);
		if (Gender.equals("boy")) {
			System.out.println("boy? bruh... allow that...");
			System.out.println("why this game always matching me with the guys though...");
		}
		else {
			System.out.println("Girl? say swear, aite baby girl wait here.");
			System.out.println("Ite boo boo, let man set the scene for you...");
		}
		
		Sleep(5);
		
		
		
	}
	
	
	
	
}
