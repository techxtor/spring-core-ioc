*spring-core-ioc*
---
Spring Core IoC
---
* [Details on IoC and Dependency Injection](https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring)
* [Details on ApplicationContext](https://www.baeldung.com/spring-component-annotation#spring-applicationcontext)
* 
### Order of Reading:
- Bean Factory
- Application Context
- Container
- Singleton vs Prototype
- Setter Injection
  - Primitive
  - Reference
- Constructor Injection
- Autowire

### Important Notes:
- `ApplicationContext` creates Spring Container - the Container will have Beans.
- Spring creates objects/beans as soon as application runs (not for `scope="prototype"`, though).
  - bean(s) to be created are provided in `spring.xml`
  - created by `ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");`
  - in case of `scope="prototype"`, bean(s) are created when asked for. 
  - when bean(s) are created, constructor is called
- Spring, by default, follows **Singleton Design Pattern** - i.e. by default, Spring container will provide only one object.
  - to get multiple objects, add xml property to bean: `scope="prototype"`
- Two different types of injections are available:
  - Setter Injection
    - Primitive: `<property name="_prop_" value="_value_"></property>`
    - Reference: `<property name="_prop_" ref="_bean_id_of_reference_type"></property>`
  - Constructor Injection:  `<constructor-arg value="_value_"></constructor-arg>`
- Autowire: when using autowire, `property` tag is not required.
  - `autowire="byName"`: looks for bean with name (`id`) that equals property name.
  - `autowire="byType"`: looks for bean with type (`class`) that equals property type.
  - in case of conflict, provide `primary="true"` tag in the desired one to resolve  .
  
