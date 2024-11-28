package br.com.skelleton.poc_interface_api.sender;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SmsSender implements MessageSender {

    @Override
    public void send(String recipient, String message) {
        log.info("Sending SMS to {}: {}", recipient, message);
    }

}
