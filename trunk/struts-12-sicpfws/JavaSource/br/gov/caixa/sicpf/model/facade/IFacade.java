package br.gov.caixa.sicpf.model.facade;

import br.gov.caixa.sicpf.model.dto.AbstractBook;


public interface IFacade {

    public void consultaAtendimento(AbstractBook cobolBook);

    public void validaConcluiAtendimento(AbstractBook cobolBook);

    public void consultaSituacaoAtendimento(AbstractBook cobolBook);

    public void consultaAtendimentoNaoConcluido(AbstractBook cobolBook);
}
