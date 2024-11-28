package br.com.skelleton.poc_interface_api.service;

import br.com.skelleton.poc_interface_api.domain.Channel;
import br.com.skelleton.poc_interface_api.resource.request.MessageRequest;
import br.com.skelleton.poc_interface_api.sender.MessageSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final Map<Channel, MessageSender> messageSenderMap;

    public void send(final Channel messageType, final MessageRequest messageRequest) {
        final MessageSender sender = messageSenderMap.get(messageType);

        if (sender == null) {
            throw new IllegalArgumentException("Message type not supported: " + messageType);
        }
        sender.send(messageRequest.getRecipient(), messageRequest.getMessage());
    }

}
