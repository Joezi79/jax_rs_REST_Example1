# javaee jax-rs REST API exmaple 

## Build and run
maven build with goal `clean package` -> generates jax_rs.war file in target folder

run on server -> tested on tomcat 8.0 

Open follwoing URL from browser or REST client -> `http://localhost:8080/jax_rs/rest/hello/`

## Host on IBM Bluemix 
`cf push jax_rs_sanket -p jax_rs.war`

## Output
API 01

	* Maps to REST API http://localhost:8080/jax_rs/rest/hello/
	* @return Plan Text "Hello World from Javaee_JAX-RS"
	* @see http://www.mkyong.com/webservices/jax-rs/jersey-hello-world-example/
	* @see http://www.mkyong.com/webservices/jax-rs/json-example-with-jersey-jackson

API 02

	* Maps to REST API http://localhost:8080/jax_rs/rest/operate/add/51/67
	* @return JSON Object { "imeplementation": "Javaee_JAX-RS","result": "118" }

## Swagger
- run on server for swagger JSON: http://localhost:8080/jax_rs/rest/swagger.json
- yaml: http://localhost:8080/jax_rs/rest/swagger.yaml 

Point your swagger UI dist/index.html to this swagger.json to see the documentation

Referred from https://github.com/swagger-api/swagger-core/wiki/Swagger-Core-Jersey-2.X-Project-Setup-1.5

**How to integrate swagger with jax-rs:** http://stackoverflow.com/a/35905415/5076414

An alternate way: http://stackoverflow.com/a/35905560/5076414
