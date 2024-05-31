package org.example.ijeventlisteners

import org.springframework.context.ApplicationEventPublisher
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class  TestController {

    TestController(ApplicationEventPublisher publisher) {
        this.publisher = publisher
    }

    ApplicationEventPublisher publisher

    @GetMapping
     String doTest() {
        publisher.publishEvent(new RequestReceivedEvent('I received a request'))
        return 'request'
    }
}