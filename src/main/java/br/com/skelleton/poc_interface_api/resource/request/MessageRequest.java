package br.com.skelleton.poc_interface_api.resource.request;

import br.com.skelleton.poc_interface_api.domain.Channel;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "channel",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = PushRequest.class, name = "PUSH"),
        @JsonSubTypes.Type(value = EmailRequest.class, name = "EMAIL"),
        @JsonSubTypes.Type(value = SmsRequest.class, name = "SMS")
})
public interface MessageRequest {

    Channel getChannel();
    String getRecipient();
    String getMessage();

}
