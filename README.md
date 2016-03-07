# javaee jax-rs REST API exmaple 

## Build and run
maven build with goal `clean package` -> generates jax_rs.war file in target folder

run on server -> tested on tomcat 8.0 

Open follwoing URL from browser or REST client -> `http://localhost:8080/jax_rs/rest/hello/<msg>`

## Host on IBM Bluemix 
`cf push jax_rs_sanket -p jax_rs.war`

## Output

	 * Maps to REST API http://localhost:8080/jax_rs/rest/hello/sanket
	 * @param msg "sanket"
	 * @return "Jax-rs REST API : sanket"
	 * @see http://www.mkyong.com/webservices/jax-rs/jersey-hello-world-example/
	 * @see http://www.mkyong.com/webservices/jax-rs/json-example-with-jersey-jackson/
