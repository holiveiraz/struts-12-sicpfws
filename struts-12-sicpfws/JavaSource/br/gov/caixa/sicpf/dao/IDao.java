package br.gov.caixa.sicpf.dao;

import br.gov.caixa.sicpf.dto.AbstractBook;

public interface IDao {
	
	AbstractBook execute(AbstractBook cobolBook);
	
}
