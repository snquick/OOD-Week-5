
public class MuteState implements State {
	TV tv;

	public MuteState(TV tv) {
		this.tv = tv;
	}
	
	public void muteState() {
		System.out.println("Muted");
	}

	public void offState() {	
		System.out.println("Off");
	}

	public void onState() {
		System.out.println("On");
	}
	
	public void changeChannel() {
		System.out.println("hahahahah");
	}

	public void volumeUp() {
		System.out.println("Volume Turned Up");
	}

	public void volumeDown() {
		System.out.println("Volume Turned Down");	
	}
}
