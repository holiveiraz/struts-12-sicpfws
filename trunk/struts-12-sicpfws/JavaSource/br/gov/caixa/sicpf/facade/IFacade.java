package br.gov.caixa.sicpf.facade;

import br.gov.caixa.sicpf.dto.AbstractBook;


public interface IFacade {

    public void consultaAtendimento(AbstractBook cobolBook);

    public void validaConcluiAtendimento(AbstractBook cobolBook);

    public void consultaSituacaoAtendimento(AbstractBook cobolBook);

    public void consultaAtendimentoNaoConcluido(AbstractBook cobolBook);
}
