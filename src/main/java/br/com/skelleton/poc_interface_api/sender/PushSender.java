package br.com.skelleton.poc_interface_api.sender;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PushSender implements MessageSender {

    @Override
    public void send(String recipient, String message) {
        log.info("Sending Push Notification to {}: {}",  recipient, message);
    }

}
