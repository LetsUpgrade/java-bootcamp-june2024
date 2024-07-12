package interfaces;

public class SMSService implements NotifyMode{

	public void sendMessage(String message) {
		System.out.println("Sending via SMS");
		System.out.println(message);
	}
}
