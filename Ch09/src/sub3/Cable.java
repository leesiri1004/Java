package sub3;

public class Cable implements Socket {

	private Bulb bulb;
	
	public Cable(Bulb bulb) {
		this.bulb =  bulb;
	}
	
	@Override
	public void switchOn() {
		System.out.println("Àü±¸ ºÒ ÄÑÁü");
	}

	@Override
	public void switchOff() {
		System.out.println("Àü±¸ ºÒ ²¨Áü");
	}

}
