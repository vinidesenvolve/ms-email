package br.com.vinicius.msemail.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import br.com.vinicius.msemail.models.EmailModel;
import br.com.vinicius.msemail.enums.EmailStatus;
import br.com.vinicius.msemail.repositories.EmailRepository;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    private JavaMailSender emailSender;

    public EmailModel sendEmail(EmailModel email) {
        email.setSentDate(LocalDateTime.now());

        try {
            SimpleMailMessage message = new SimpleMailMessage();

            message.setFrom(email.getEmailFrom());
            message.setTo(email.getEmailTo());
            message.setSubject(email.getSubject());
            message.setText(email.getContent());

            emailSender.send(message);

            email.setStatus(EmailStatus.SENT);
            
        } catch (MailException e) {
            email.setStatus(EmailStatus.ERROR);
        } finally {
            return emailRepository.save(email);
        }

    }

}
