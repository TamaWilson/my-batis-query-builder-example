## MyBatis Query Builder Example

This project is an example of using my lib [MyBatis Query Builder](https://github.com/TamaWilson/mybatis-query-builder)

**Context**

I was working on an API Rest project where it is not possible to use any
ORM other than pure MyBatis, using queries written in XML files.

Initially, our team needed to receive sorting parameters using the Pageable
 interface provided by Spring, so we built a utility class that transforms `Sort.Order` objects into strings to be injected into SQL during the processing of queries by the MyBatis engine.

After that the need arose for the endpoinst of our project to deal with
dynamic filters based on the names of the properties of a class.
So I decided to create a lib to convert queries passed by query strings
in urls into instructions to be injected into queries processed by MyBatis.

** About this example **

This example has an embedded postgres database that will run on port 5432.

When executing the project some test data will be created and the application
will be available at `localhost: 8080` having only the root endpoint

* Some querys:
  * `localhost:8080?search=bar.comments:*te`
  * `localhost:8080?search=bar.comments:work`
  * `localhost:8080?search=quantity>40`
  * `localhost:8080?search=id>1`
  * `localhost:8080?search=id::(1,3)`
