package com.xptoExercice.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xptoExercice.domain.Cliente;
import com.xptoExercice.domain.Conta;
import com.xptoExercice.domain.enums.Tipo;

@Configuration
public class ContasBancariasProcessorConfig {

	private int idAccount = 1;
	
	@Bean
	public ItemProcessor<Cliente, Conta> contasBancariasProcessor() {
		return new ItemProcessor<Cliente, Conta>() {

			@Override
			public Conta process(Cliente cliente) throws Exception {
				Conta conta = new Conta();
				conta.setId(idAccount);
				idAccount++;
				conta.setTipo(getAccountType(cliente));
				conta.setLimite(getAccountLimit(conta));
				conta.setCliente_id(cliente.getEmail());
				return conta;
			}

			private Tipo getAccountType(Cliente cliente) {
				if (cliente.getFaixaSalarial() <= 3000)
					return Tipo.PRATA;
				if (cliente.getFaixaSalarial() <= 5000)
					return Tipo.OURO;
				if (cliente.getFaixaSalarial() <= 10000)
					return Tipo.PLATINA;
				return Tipo.DIAMANTE;
			}
			
			private double getAccountLimit(Conta conta) {
				if (conta.getTipo() == Tipo.PRATA)
					return 500.0;
				if (conta.getTipo() == Tipo.OURO)
					return 1000.0;
				if (conta.getTipo() == Tipo.PLATINA)
					return 2500.0;
				return 5000.0;
			}
			
		};
	}

	
}
