package p212;

import p209.Amd;
import p209.GraphicCard;
import p210.Nvidia;
import p211.Game;

public class Computer2 {
	
	public static void main(String[] args) {
		
		Game g = new Game();
		
		GraphicCard gc = new GraphicCard();
		g.display(gc);
		
		Amd gc2 = new Amd();
		g.display(gc2);
		
		Nvidia gc3 = new Nvidia();
		g.display(gc3);
	}

}
