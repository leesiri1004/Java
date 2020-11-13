package p213;

import p209.Amd;
import p209.GraphicCard;
import p210.Nvidia;

public class ObjectEx {
	
	public static void main(String[] args) {
		
		allObject(new GraphicCard());
		allObject(new Amd());
		allObject(new Nvidia());
		allObject("¾È³ç");
		
	}
	
	public static void allObject(Object obj) {
		System.out.println(obj.toString());
	}

}
