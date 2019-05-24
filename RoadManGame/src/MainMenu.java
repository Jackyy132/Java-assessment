import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Random;

public class MainMenu {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Player> players = new ArrayList<>();
	static int x = 100;
	static int y = 100;
	static int StartiPosition = (CreatePositions());
	static int StartjPosition = (CreatePositions());
	static int KeyiPosition = (CreatePositions());
	static int KeyjPosition = (CreatePositions());
	static int[][] array = new int[x][y];
	
	
	
	public static void Menu() {
		array[StartiPosition][StartjPosition] = 1;
		while (StartiPosition == KeyiPosition && StartjPosition == KeyjPosition) {
			 KeyiPosition = (CreatePositions());
			 //System.out.println("IF I AM THE SAME, NEW KEY I POSITION" + KeyiPosition);
			 KeyjPosition = (CreatePositions());
			 //System.out.println("IF I AM THE SAME, NEW KEY J POSITION" + KeyjPosition);
		}
		String Name;
		String Gender;
		int IncorrectTimes = 0;
		boolean GenderLoop = false;
		Key k = new Key(KeyiPosition, KeyjPosition);
		
		System.out.println("Yo like, Welcome init, whats your name n that?");
		Name = input.next();
		do {
			System.out.println("You know, " +Name+ "... mans just gonna get straight to the point, whats your gender looking like? boy or girl");
			Gender = input.next();
			if (Gender.equals("boy") || (Gender.equals("girl"))){
				GenderLoop = true;
			}
			else {
				IncorrectTimes++;
				if(IncorrectTimes == 5) {
					System.out.println("Yo bruddah, type either boy or girl, is not that hard... I can play this game all day yo");
				}
				if(IncorrectTimes == 10) {
					System.out.println("Ite, whatever, you do you boo boo, keep playing this game with me...");
				}
				GenderLoop = false;

			}
		}while(GenderLoop == false);
		
		if (Gender.equals("boy")) {
			Boy b = new Boy(Name, Gender, StartiPosition, StartjPosition);
			players.add(b);
			System.out.println(b.SetUpScene());
		}
		else {
			Girl g = new Girl(Name, Gender, StartiPosition, StartjPosition);
			players.add(g);
			System.out.println(g.SetUpScene());
		}
		StartUpMenu();
		
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
public static int CreatePositions() {
	Random random = new Random();
	return random.nextInt(x);
}

public static void StartUpMenu() {
	String UserChoice;
	do {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Game name: 'LOST' - Road man edition");
		System.out.println("Bad man Menu");
		System.out.println("Pick su'tin below and it will happen init");
		System.out.println("A) Do some mad maths to see how far you are to the key");
		System.out.println("B) Use mad looking watch to choose direction");
		System.out.println("C) Load up a map n that");
		System.out.println("D) Duck from game");
		System.out.println("E) Check details from start");
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
			WinCondition();
			if (WinCondition() == true) {
				System.out.println("YOU FOUND THE TREASURE BABY GIRL! YOU WIN!! Your prize? it's obviously me baby girl...");
				System.exit(0);
			}
			else {
				System.out.println("Come on baby girl, choose the right way...");
			}
		}
		if (UserChoice.equals("C")) {
			LookAtMap();
			Sleep(4);
		}
		if (UserChoice.equals("E")) {
			Coordinates();
		}
		
		
	}while(!UserChoice.equals("D"));
}


public static void Coordinates() {
	System.out.println(players.toString());
}




public static void Sleep(int MadTimeDelay) {
	try {
		TimeUnit.SECONDS.sleep(MadTimeDelay);
	} catch (InterruptedException e) {
		System.out.println("Nani?");
		e.printStackTrace();
	}
}

public static boolean WinCondition() {
	boolean Win = false;
	if (StartiPosition == KeyiPosition && StartjPosition == KeyjPosition) {
		Win = true;
		return Win;
		
	}
	else {
		Win = false;
		return Win;
	}
	
	
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

public static void LookAtMap() {
	System.out.println("Yo boo, like dis a map to tell you where we at in it");
	System.out.println("Outta all the 0's ere, you the '1' for me baby girl ;) but if you a guy, nahh you a 1/10 still");
	
	for (int i = 0; i < x; i++) {
	for (int j = 0; j < y; j++) {
		System.out.print(array[i][j]+ " ");
	}
	System.out.println();
}
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

	
}
