package br.com.skelleton.poc_interface_api.resource.request;

import br.com.skelleton.poc_interface_api.domain.Channel;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmailRequest implements MessageRequest {

    @NotBlank
    private Channel channel;
    private String recipient;
    private String message;

}
