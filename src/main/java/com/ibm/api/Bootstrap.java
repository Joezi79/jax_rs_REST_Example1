package com.ibm.api;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.jaxrs.config.BeanConfig;

public class Bootstrap extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		String host = "localhost:8080/jax_rs";
		String application = System.getenv("VCAP_APPLICATION");
		System.out.println("application = " + application);
		if (application != null) {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode actualObj;
			try {
				actualObj = mapper.readTree(application);
				JsonNode uris = actualObj.get("application_uris");
				if (uris != null && uris.get(0) != null) {
					host = uris.get(0).asText();
					System.out.println("vcap_application URI = " + host);
				}
					
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Swagger host = " + host);

		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setVersion("1.0.0");
		beanConfig.setSchemes(new String[] { "http" });
		beanConfig.setHost(host);
		beanConfig.setBasePath("/rest");
		beanConfig.setResourcePackage("com.ibm.api");
		beanConfig.setScan(true);
	}
}