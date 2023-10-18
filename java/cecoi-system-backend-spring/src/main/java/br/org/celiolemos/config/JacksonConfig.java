package br.org.celiolemos.config;

import java.util.TimeZone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * 
 * Classe criada para configuracao da data, por padrao o jackson esta definindo
 * um dia antes do atual
 * 
 * https://stackoverflow.com/questions/31622254/lost-one-day-for-a-date
 *
 */
@Configuration
public class JacksonConfig {

	@Bean
	@Primary
	public Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder() {
		final Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder = new Jackson2ObjectMapperBuilder();
		jackson2ObjectMapperBuilder.timeZone(TimeZone.getDefault());
		jackson2ObjectMapperBuilder.serializationInclusion(JsonInclude.Include.NON_EMPTY);
		jackson2ObjectMapperBuilder.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		return jackson2ObjectMapperBuilder;
	}

}
