
public abstract class Player {
	String Name;
	String Gender;
	int StartiPosition;
	int StartjPosition;
	abstract String SetUpScene();
	
	public Player(String Name, String Gender, int StartiPosition, int StartjPosition) {
		this.Name = Name;
		this.Gender = Gender;
		this.StartiPosition = StartiPosition;
		this.StartjPosition = StartjPosition;
	}
	

	
	
	
}
