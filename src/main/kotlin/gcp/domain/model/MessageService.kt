package gcp.domain.model

import org.springframework.stereotype.Service

@Service
class MessageService {

    fun getMessages() = listOf(Message("Hello from Google App Engine", "High"), Message("Another", "low"))

}