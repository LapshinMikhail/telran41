package telran.java41.students.configuration;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.AccessLevel;

@Configuration
public class StudentConfiguration {

	@Bean
	public ModelMapper getModelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration()
							.setFieldMatchingEnabled(true)
							.setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
							.setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}
}
