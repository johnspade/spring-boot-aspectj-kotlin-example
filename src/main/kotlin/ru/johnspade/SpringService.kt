package ru.johnspade

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class SpringService {

	@Cacheable("example-cache")
	fun hello() = "Hello from Spring Service!"

}
