package game;

public class NeutralToken extends Token {
	NeutralToken(int points,boolean isVisible) {
		super(points, isVisible);
	}
	
	protected boolean moveAllowed (byte vectorX, byte vectorY) {
		if (Game.playBoard.emptyFieldFrom(x, y, vectorX, vectorY))
			return true;
		
		else if	((vectorX == 1 && x == Game.playBoard.getBase()+1)||
			 	  (vectorX == -1 && x == 0)||
				   (vectorY == 1 && y == Game.playBoard.getBase()+1)||
				    (vectorY == -1&& y == 0)) 
			if(!(Game.playBoard.getTokenOn((byte)(x-vectorX),(byte)(y-vectorY)) instanceof NeutralToken))
				return false;
			else 
				return true;
			

		else return true;
		}
	public Player getAffinity() {
		return Game.player[0];
	}
	}