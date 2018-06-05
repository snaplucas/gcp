package gcp.entrypoints

import gcp.domain.model.Message
import gcp.domain.model.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class MessageController(private val messageService: MessageService) {

    @GetMapping("/messages")
    fun message(): List<Message> {
        return messageService.getMessages()
    }

}