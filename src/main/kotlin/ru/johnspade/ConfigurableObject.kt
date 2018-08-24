package ru.johnspade

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Configurable

@Configurable
class ConfigurableObject {

	@Autowired
	private lateinit var springService: SpringService

	fun hello() = "ConfigurableObject: " + springService.hello()

}
