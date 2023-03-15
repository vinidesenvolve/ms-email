package br.com.vinicius.msemail.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import br.com.vinicius.msemail.dtos.EmailDTO;
import br.com.vinicius.msemail.models.EmailModel;
import br.com.vinicius.msemail.services.EmailService;

@Component
public class EmailConsumer {

    @Autowired
    EmailService emailService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload EmailDTO emailDTO) {
        EmailModel email = new EmailModel();
        BeanUtils.copyProperties(emailDTO, email);

        emailService.sendEmail(email);

        System.out.println("Email status: " + email.getStatus().toString());
    }
}
