package com.heeheepresso.menu

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class MenuApplication

fun main(args: Array<String>) {
    runApplication<MenuApplication>(*args)
}

@RestController
class MessageController {
    @GetMapping("/")
    fun index() = listOf(
            Message("1", "Hello!"),
            Message("2", "Bonjour!"),
    )
}

data class Message(val id: String?, val text: String)