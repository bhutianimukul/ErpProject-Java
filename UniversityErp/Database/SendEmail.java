package Database;

import java.util.function.Supplier;

import com.email.durgesh.Email;

public class SendEmail {

	Email email;

	public boolean sendDebardEmail(String gmail, String attendence, String date1, String date2) {
		try {
			email = new Email("moneykaur2000@gmail.com", "gagandeep22");
			email.setFrom("moneykaur2000@gmail.com", "Chandigarh Group of Colleges");
			email.setSubject("Attendece Report");
			email.setContent(
					"<h1 style=\"text-align: center;\">You are debarded</h1><br><p style=\"font-size: 20px;\">As your Attendence is "
							+ attendence
							+ " which is less then<span style=\"color: orange;\"> 75%</span>. The attendence is taken from "
							+ date1 + " to " + date2 + ".</p>" +

							"<br><p style=\"color: red;text-decoration: underline;text-background-color:yellow;font-size: 20px;\">So Clear your name from the debard list Quickly</p>",
					"text/html");
			email.addRecipient(gmail); // to whom u want to end the email
			email.send();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static String generateOtp() {

		return String.valueOf(s.get());
	}

	static Supplier<String> s = () -> {
		String otp = "";
		for (int i = 0; i < 3; i++) {
			otp = otp + (int) (Math.random() * 10);
		}

		return otp;
	};

	public boolean sendOtp(String gmail, String otp) {
		try {
			email = new Email("moneykaur2000@gmail.com", "gagandeep22");
			email.setFrom("moneykaur2000@gmail.com", "Chandigarh Group of Colleges");
			email.setSubject("Otp");
			email.setContent("<h1>Login Otp</h1><br><h3> The Login Otp for Universirty Erp is " + otp + ".</h3>",
					"text/html");
			email.addRecipient(gmail);
			email.send();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
