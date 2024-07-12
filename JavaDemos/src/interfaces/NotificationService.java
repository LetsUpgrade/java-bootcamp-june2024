package interfaces;

public class NotificationService {

//	EmailService emailService = new EmailService();
//	SMSService service = new SMSService();
	
	NotifyMode notifyMode;
	public NotificationService(NotifyMode notifyMode) {
		this.notifyMode =notifyMode;
	}
	void notifyUser(String message, String mode) {
//		if(mode.equals("email"))
//			emailService.sendMessage(message);
//		else
//			service.sendMessage(message);
		notifyMode.sendMessage(message);
	}
}
