
public class Key {
	int KeyiPosition;
	int KeyjPosition;
	
	public Key(int KeyiPosition, int KeyjPosition) {
		this.KeyiPosition = KeyiPosition;
		this.KeyjPosition = KeyjPosition;
	}
	
	
	public String RandomJump() {

		return "'Key' has randomly jumped!";
	}
	
	
	
	public String toString() {
		return "Hey boys, im at [" + this.KeyiPosition +","+ this.KeyjPosition + "] position";
	}
}
