package br.com.incubacao;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Incubação Apis", version = "2.0", description = "Apis para o controle de incubações."))
public class IncubacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncubacaoApplication.class, args);
	}

}
