package ru.johnspade

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.AdviceMode
import org.springframework.context.annotation.aspectj.EnableSpringConfigured

@EnableCaching(mode = AdviceMode.ASPECTJ)
@EnableSpringConfigured
@SpringBootApplication
class Application(private val springService: SpringService): CommandLineRunner {

	override fun run(vararg args: String) {
		println(springService.hello())
		println(ConfigurableObject().hello())
	}

}

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
