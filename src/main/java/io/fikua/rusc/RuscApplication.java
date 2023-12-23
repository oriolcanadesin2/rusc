package io.fikua.rusc;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RuscApplication {

	private static final ObjectMapper OBJECT_MAPPER =
			JsonMapper.builder().configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true).build();

	public static void main(String[] args) {
		SpringApplication.run(RuscApplication.class, args);
	}

	@Bean
	public ObjectMapper objectMapper() {
		return OBJECT_MAPPER;
	}

}
