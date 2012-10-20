package br.gov.caixa.sicpf.model.dao;

import br.gov.caixa.sicpf.model.dto.AbstractBook;

public interface IDao {
	
	AbstractBook execute(AbstractBook cobolBook);
	
}
