package telran.java41.students.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StudentCredentialsDto {
	Integer id;
	String name;
	String password;
}
