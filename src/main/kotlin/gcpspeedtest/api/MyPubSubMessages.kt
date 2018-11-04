package gcpspeedtest.api

import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate

class MyPubSubMessages(val pubSub: PubSubTemplate) {

    fun publish(myMessage: String) {
        this.pubSub.publish("the_topic_name", myMessage)
    }

}