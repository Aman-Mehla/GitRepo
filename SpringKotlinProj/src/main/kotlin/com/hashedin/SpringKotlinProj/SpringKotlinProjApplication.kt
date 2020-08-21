package com.hashedin.SpringKotlinProj

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.http.MediaType
import org.springframework.util.Base64Utils
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody
import sun.nio.cs.UTF_8

@SpringBootApplication
@EnableAutoConfiguration(exclude=[MongoAutoConfiguration ::class])
class SpringKotlinProjApplication


fun main(args: Array<String>) {
	runApplication<SpringKotlinProjApplication>(*args)
	println("hey hiii")
	//{{url}}/repos/{{username}}/TestGit/
	//23295ffc37b754e78277aee9ca3135fae142a9bd
	val client=WebClient.create("https://api.github.com")
	val result=client.get().uri("/repos/Aman-Mehla/TestGit/pulls")
			.header("Authoriation","Basic " + Base64Utils.encodeToString(("Aman-Mehla" + ":"+"23295ffc37b754e78277aee9ca3135fae142a9bd").encodeToByteArray(UTF_8)))
			.accept(MediaType.APPLICATION_JSON)
			.retrieve()
	println(result)
}


