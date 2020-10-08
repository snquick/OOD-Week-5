
public class OnState implements State {
	
	TV tv;
	
	public OnState(TV tv) {
		this.tv = tv;
	}
  
	public void muteState() {
		System.out.println("The TV is muted.");
		tv.setState(tv.getMuteState());
	}

	public void offState() {	
		System.out.println("Off");
	}

	public void onState() {
		System.out.println("On");
	}
	
	public void changeChannel() {
		System.out.println("Changing Channel!");
	}

	public void volumeUp() {
		System.out.println("Volume Turned Up");
	}

	public void volumeDown() {
		System.out.println("Volume Turned Down");	
	}
	
	
}
