package sendingEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

    public static void sendEmail() throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("dincautotest@gmail.com", "zwtjvkyhouvymhwm"));
        email.setSSLOnConnect(true);
        email.setFrom("dincmurad@gmail.com");
        email.setSubject("Amax Automation Test Report");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("dincmurad@gmail.com");
        email.send();
    }
}
