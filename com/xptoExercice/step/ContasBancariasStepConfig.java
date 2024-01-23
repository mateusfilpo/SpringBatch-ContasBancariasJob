package com.xptoExercice.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import com.xptoExercice.domain.Cliente;
import com.xptoExercice.domain.Conta;

@Configuration
public class ContasBancariasStepConfig {

	@Bean
	public Step contasBancariasStep(JobRepository jobRepository,
			PlatformTransactionManager transactionManager,
			ItemReader<Cliente> contasBancariasReader,
			ItemProcessor<Cliente, Conta> contasBancariasProcessor,
			ItemWriter<Conta> contasBancariasWriter) {
		return new StepBuilder("contasBancariasStep", jobRepository)
				.<Cliente, Conta>chunk(1, transactionManager)
				.reader(contasBancariasReader)
				.processor(contasBancariasProcessor)
				.writer(contasBancariasWriter)
				.build();
	}
}
