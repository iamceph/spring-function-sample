package cz.iamceph.demo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.messaging.Message

@Configuration
class AnotherFunctionConfig {

    @Bean
    fun funcD(): (Message<ByteArray>) -> Message<*>? {
        return { message -> message}
    }
}