public class FieldUnit {
	
	public byte x;
	public byte y;
	public boolean hasTokenOnIt;
	
	FieldUnit(byte x, byte y, String token, boolean hasTokenOnIt) {
		this.x = x;
		this.y = y;
		this.hasTokenOnIt = hasTokenOnIt;
	}
	
	public byte getX () {
		return x;
	}
	
	public byte getY () {
		return y;
	}
}
