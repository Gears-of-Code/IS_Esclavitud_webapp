/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gearsofcode.proyservsocial.logico.util;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * This class is used to send notifications through SMTP.
 * It is currently only functional for gmail usage.
 * The account info used is hard-coded ATM, implying:
 * TODO: modify to use different kinds of SMTP services.
 * @author snowingheart
 */
public class Mailing {

    private final String FROM = "servicio.social.fciencias";
    private final String PASSWORD = "BowserIsTheKoopaKing";
    private final String SMTPServer = "smtp.gmail.com";
    private final String PORT = "465";
    private Session session;
    
    
    /**
     * No parameters since we have a fixed system address.
     * The constructor sets up the mailing properties and starts the session.
     */
    public Mailing() {
        Properties props = new Properties();
        props.put("mail.smtp.host", SMTPServer);
        props.put("mail.smtp.socketFactory.port", PORT);
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", PORT);

        this.session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(FROM, PASSWORD);
                    }
                });

    }
    
    
    /**
     * Alternate constructor for a quick use of the mailing function.
     * Creates the Mailing objects and sends an email with the following parameters:
     * @param to The address in form <gibberish>@<somwhere>.com
     * @param header The desired header.
     * @param content The message content.
     */
    public Mailing(String to, String header, String content){
        Properties props = new Properties();
        props.put("mail.smtp.host", SMTPServer);
        props.put("mail.smtp.socketFactory.port", PORT);
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", PORT);

        this.session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(FROM, PASSWORD);
                    }
                });
        this.sendmail(to, header, content);
    }
    
    /**
     * The reason for the existence of this type of object.
    * @param to The address in form <gibberish>@<somwhere>.com
     * @param header The desired header.
     * @param content The message content.
     */
    public void sendmail(String to, String header, String content){
        try {
            Message message = new MimeMessage(this.session);
            message.setFrom(new InternetAddress(FROM+"@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));
            message.setSubject(header);
            message.setText(content);

            Transport.send(message);

            System.out.println("Message sent.");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
