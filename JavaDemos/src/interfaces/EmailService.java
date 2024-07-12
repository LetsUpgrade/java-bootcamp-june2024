package interfaces;

public class EmailService implements NotifyMode{

	public void sendMessage(String message) {
		System.out.println("Sending via email");
		System.out.println(message);
	}
}
