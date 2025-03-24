package cz.iamceph.demo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.messaging.Message

@Configuration
class FunctionConfig {

    @Bean
    fun funcA(): (Message<ByteArray>) -> Message<*>? {
        return { message -> message}
    }

    @Bean
    fun funcB(): (Message<ByteArray>) -> Message<*>? {
        return { message -> message}
    }

    @Bean
    fun funcC(): (Message<ByteArray>) -> Message<*>? {
        return { message -> message}
    }
}