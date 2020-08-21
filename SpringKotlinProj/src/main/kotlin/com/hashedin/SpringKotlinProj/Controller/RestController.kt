package com.hashedin.SpringKotlinProj.Controller

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/getrepo")
class RestController {



    @GetMapping(produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
     fun findAll(): Flux<String> {
        return findAll()
    }
    fun getrepo(x: Integer): Int {

        return 1

    }


}