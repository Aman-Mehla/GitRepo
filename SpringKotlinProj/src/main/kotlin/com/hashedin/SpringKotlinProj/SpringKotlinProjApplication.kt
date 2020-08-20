package com.hashedin.SpringKotlinProj

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration(exclude=[MongoAutoConfiguration ::class])
class SpringKotlinProjApplication

fun main(args: Array<String>) {
	runApplication<SpringKotlinProjApplication>(*args)
	println("hey hiii")
}
