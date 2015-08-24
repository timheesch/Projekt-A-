package game;

public class StarToken extends ShapedToken {

	public StarToken(int points, boolean isVisible, Player affinity) {
		super(points,  isVisible,  affinity);
	}
	protected boolean moveAllowed (byte vectorX, byte vectorY) {
			
		if	(Game.playBoard.emptyFieldFrom(x, y, vectorX, vectorY))
			return true;
		
		else if	((vectorX == 1 && x == Game.playBoard.getBase()+1)||
		 	  (vectorX == -1 && x == 0)||
			   (vectorY == 1 && y == Game.playBoard.getBase()+1)||
			    (vectorY == -1&& y == 0)) 
			if(!(Game.playBoard.getTokenOn((byte)(x-vectorX),(byte)(y-vectorY)) instanceof ShapedToken)||
				this.affinity.equals(Game.playBoard.getTokenOn((byte)(x-vectorX),(byte)(y-vectorY)).getAffinity()))
				return false;
			else return true;
			

		else return false;
	
	}
}