
public class TVTest {
	public static void main(String[] args) {
		TV tv = new TV(1);
		
		System.out.println(tv);

		tv.onState();
		tv.volumeUp();
		tv.changeChannel();
		tv.muteState();
		tv.offState();
		
		System.out.println(tv);

	}
}

