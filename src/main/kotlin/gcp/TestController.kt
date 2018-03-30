package gcp

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/test")
class TestController {

    @GetMapping("/hello")
    fun hello() = "hello world"

    @GetMapping
    fun someStuff() = HttpStatus.OK
}