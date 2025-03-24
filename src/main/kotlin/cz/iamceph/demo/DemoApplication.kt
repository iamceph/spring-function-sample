package cz.iamceph.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.boot.runApplication
import org.springframework.cloud.function.context.FunctionCatalog
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}


@Component
class UvdFunctionDebugger(
    private val functionCatalog: FunctionCatalog
) {
    @EventListener(ApplicationReadyEvent::class)
    fun onReady() {
        val functions = functionCatalog.getNames(null).joinToString()
        println("Registered functions: [$functions]")
    }
}
