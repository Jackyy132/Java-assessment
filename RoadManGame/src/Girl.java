import java.util.concurrent.TimeUnit;

public class Girl extends Player{

	public Girl(String Name, String Gender, int StartiPosition, int StartjPosition) {
		super(Name, Gender,StartiPosition,StartjPosition);
	}

	@Override
	String SetUpScene() {
		System.out.println("Girl? say swear, aite baby girl wait here.");
		System.out.println("Ite boo boo, let man set the scene for you... and switch up the game n that");
		Sleep(5);
		System.out.println("You are playing...");
		Sleep(2);
		System.out.println("Game name: 'LOST' - Road man edition");
		Sleep(5);
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
		
		return null;
	}
	public String JumpToKey() {
		//KeyiPosition = StartiPosition;
		//KeyjPosition = StartjPosition;
		return "Jumping to the key...";
	}
	
	public static void Sleep(int MadTimeDelay) {
		try {
			TimeUnit.SECONDS.sleep(MadTimeDelay);
		} catch (InterruptedException e) {
			System.out.println("Nani?");
			e.printStackTrace();
		}
	}
	public String toString() {
		return "My name is: " + this.Name + " Gender: " + this.Gender + " My current position is: [" + this.StartiPosition + ","+this.StartjPosition + "]";
	}
	
	

}
