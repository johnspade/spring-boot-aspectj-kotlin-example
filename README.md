Output:
```
...
o.s.cache.aspectj.AnnotationCacheAspect  : No cache entry for key 'SimpleKey []' in cache(s) [example-cache]
o.s.cache.aspectj.AnnotationCacheAspect  : Computed cache key 'SimpleKey []' for operation Builder[public java.lang.String ru.johnspade.SpringService.hello()] caches=[example-cache]...
Hello from Spring Service!
o.s.cache.aspectj.AnnotationCacheAspect  : Computed cache key 'SimpleKey []' for operation Builder[public java.lang.String ru.johnspade.SpringService.hello()] caches=[example-cache]...
o.s.cache.aspectj.AnnotationCacheAspect  : Cache entry for key 'SimpleKey []' found in cache 'example-cache'
ConfigurableObject: Hello from Spring Service!
...
```
Most important:
1. aspectj-maven-plugin (life cycle phase "process-classes" or later);
2. weaveDirectories and spring-aspects in aspectj-maven-plugin's configuration;
3. @EnableSpringConfigured annotation.
