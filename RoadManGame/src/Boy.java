
public class Boy extends Player{

	public Boy(String Name, String Gender, int StartiPosition, int StartjPosition) {
		super(Name, Gender,StartiPosition,StartjPosition);
	}

	String SetUpScene() {
		return "Grey foggy clouds float oppressively close to you,\r\n" + 
				"reflected in the murky grey water which reaches up your shins.\r\n" + 
				"Some black plants barely poke out of the shallow water.\r\n" + 
				"Try \"north\",\"south\",\"east\",or \"west\"\r\n" + 
				"You notice a small watch-like device in your left hand.\r\n" + 
				"It has hands like a watch, but the hands don't seem to tell time.\r\n" + 
				"";
		
	}
	
	public String toString() {
		return "My name is: " + this.Name + " Gender: " + this.Gender + " My current position is: [" + this.StartiPosition + ","+this.StartjPosition + "]";
	}

	
	
	

}
