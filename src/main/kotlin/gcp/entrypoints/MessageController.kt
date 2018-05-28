package gcp.entrypoints

import gcp.domain.model.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class MessageController {

    @GetMapping("/message")
    fun message(): Message {
        return Message("Hello from Google App Engine", "High")
    }

}