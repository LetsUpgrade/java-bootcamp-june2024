package interfaces;

public class Test {
	public static void main(String[] args) {
		/**
		 * interface reference can be passed
		 * object of the class that implements the interface
		 */
		SMSService service = new SMSService();
		NotificationService notificationService =
				new NotificationService(service);
		notificationService.notifyUser("Send email", null);
	}
}
