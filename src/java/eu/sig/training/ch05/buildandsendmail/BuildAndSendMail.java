package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, Mail mail, MailMessage mailMessage) {
        // Format the email address
        String mId = mail.getFirstName().charAt(0) + "." + mail.getLastName().substring(0, 7) + "@"
            + mail.getDivision().substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(mailMessage.getMailFont(),
                mailMessage.message1 + mailMessage.message2 + mailMessage.message3);
        // Send message
        m.send(mId, mailMessage.subject, mMessage);
    }
    // end::buildAndSendMail[]

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }

    private class MailFont {

    }

    private class Mail {
        private String firstName;
        private String lastName;
        private String division;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getDivision() {
            return division;
        }

        public void setDivision(String division) {
            this.division = division;
        }
    }

    private class MailMessage {
        private String subject;
        private MailFont mailFont;
        private String message1;
        private String message2;
        private String message3;

        public String getMessage1() {
            return message1;
        }

        public void setMessage1(String message1) {
            this.message1 = message1;
        }

        public String getMessage2() {
            return message2;
        }

        public void setMessage2(String message2) {
            this.message2 = message2;
        }

        public String getMessage3() {
            return message3;
        }

        public void setMessage3(String message3) {
            this.message3 = message3;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public MailFont getMailFont() {
            return mailFont;
        }

        public void setMailFont(MailFont mailFont) {
            this.mailFont = mailFont;
        }
    }

}