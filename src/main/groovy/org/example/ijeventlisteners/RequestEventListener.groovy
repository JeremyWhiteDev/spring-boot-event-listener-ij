package org.example.ijeventlisteners

import org.springframework.stereotype.Component
import org.springframework.context.event.EventListener


@Component
class RequestEventListener {

    @EventListener
    void handleRequestReceivedEvent(RequestReceivedEvent event) {
        System.out.println("Processing Event: $event.message")
    }

}
