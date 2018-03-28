package gcp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class AppStart

fun main(args: Array<String>) {
    SpringApplication.run(AppStart::class.java)
}