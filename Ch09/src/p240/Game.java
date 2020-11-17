package p240;

import p238.Amd;
import p238.GraphicCard;
import p238.Nvidia;

public class Game {
	
	public void display(GraphicCard gc) {
		gc.process();
		
	Game g = new Game();
	Amd gc1 = new Amd();
	g.display(gc1);
	
	Nvidia gc2 = new Nvidia();
	g.display(gc2);
	
	
		
	}

}
