package com.tender.golmalconfig

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class GolmalConfigApplication

fun main(args: Array<String>) {
	runApplication<GolmalConfigApplication>(*args)
}
