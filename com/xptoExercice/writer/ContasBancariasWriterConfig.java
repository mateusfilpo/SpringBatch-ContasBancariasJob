package com.xptoExercice.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xptoExercice.domain.Conta;

@Configuration
public class ContasBancariasWriterConfig {

	@Bean
	public ItemWriter<Conta> contasBancariasWriter() {
		return contas -> contas.forEach(System.out::println);
	}
	
}
