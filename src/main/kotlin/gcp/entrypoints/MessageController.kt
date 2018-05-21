package gcp.entrypoints

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

data class Message(val text: String, val priority: String)

@RestController
class MessageController {

    @GetMapping("/message")
    fun message(): Message {
        return Message("Hello from Google App Engine", "High")
    }

}