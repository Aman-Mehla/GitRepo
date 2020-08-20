package com.hashedin.SpringKotlinDemo

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration

@SpringBootApplication
class SpringKotlinDemoApplication

fun main(args: Array<String>) {
	println("hello world")
	runApplication<SpringKotlinDemoApplication>(*args)
}
