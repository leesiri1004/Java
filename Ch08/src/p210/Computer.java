package p210;

import p209.Amd;
import p209.GraphicCard;

public class Computer {
	public static void main(String[] args) {
		
		GraphicCard gc = new GraphicCard();
		gc.process(); // ���� �׷���ó�� process
		
		gc = new Amd();
		gc.process();
		
		gc = new Nvidia();
		gc.process();
	}

}
