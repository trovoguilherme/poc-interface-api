package br.com.skelleton.poc_interface_api.resource;

import br.com.skelleton.poc_interface_api.domain.Channel;
import br.com.skelleton.poc_interface_api.resource.request.MessageRequest;
import br.com.skelleton.poc_interface_api.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/message")
public class MessageResource {

    private final MessageService messageService;

    @PostMapping
    public ResponseEntity<Void> sendEmail(@RequestBody final MessageRequest messageRequest) {
        messageService.send(messageRequest.getChannel(), messageRequest);
        return ResponseEntity.ok().build();
    }

}
