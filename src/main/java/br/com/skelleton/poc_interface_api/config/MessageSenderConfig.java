package br.com.skelleton.poc_interface_api.config;

import br.com.skelleton.poc_interface_api.domain.Channel;
import br.com.skelleton.poc_interface_api.sender.EmailSender;
import br.com.skelleton.poc_interface_api.sender.MessageSender;
import br.com.skelleton.poc_interface_api.sender.PushSender;
import br.com.skelleton.poc_interface_api.sender.SmsSender;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class MessageSenderConfig {

    private final EmailSender emailSender;
    private final PushSender pushSender;
    private final SmsSender smsSender;

    @Bean
    public Map<Channel, MessageSender> messageSenderMap() {
        return Map.of(
                Channel.EMAIL, emailSender,
                Channel.PUSH, pushSender,
                Channel.SMS, smsSender
        );
    }

}
