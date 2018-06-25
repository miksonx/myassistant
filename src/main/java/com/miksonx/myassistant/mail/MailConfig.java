package com.miksonx.myassistant.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MailConfig {
    @Bean
    public MailSender mockMailSender(){
        return new MockMailSender();
    }
    @Bean
    public MailSender smtpMailSender(){
        return new SmtpMailSender();
    }

}

