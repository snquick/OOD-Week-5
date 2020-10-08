
public class TV {
	State offState;
	State onState;
	State muteState;
	
	State state;

	public TV(int onOrOff) {
		offState = new OffState(this);
		onState = new OnState(this);
		muteState = new MuteState(this);
		
		if (onOrOff == 0) {
			state = offState;
		} else if (onOrOff == 1) {
			state = onState;
		} else if (onOrOff == 3) {
			state = muteState;
		}
	}

	public void muteState() {
		state.muteState();
	}

	public void volumeUp() {
		state.volumeUp();
	}
	
	public void volumeDown() {
		state.volumeDown();
	}
	
	public void onState() {
		state.onState();
	}
	
	public void offState() {
		state.offState();
	}
	
	public void changeChannel() {
		state.changeChannel();
	}
	
	public void state(int change) {
		if (change == 0) {
			state = offState;
		} else if (change == 1) {
			state = onState;
		} else if (change == 2) {
			state = muteState;
		}
	}
	
	void setState(State state) {
		this.state = state;
	}
	
    public State getState() {
        return state;
    }
    
    public State getOnState() {
    	return onState;
    }
    
    public State getMuteState() {
    	return muteState;
    }
    
    public State getOffState() {
    	return offState;
    }
    
    public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("Samsung TV");
		return result.toString();
    }
}