package br.gov.caixa.sicpf.facade;

import br.gov.caixa.sicpf.dao.CicsDaoFactory;
import br.gov.caixa.sicpf.dao.IDao;
import br.gov.caixa.sicpf.dto.AbstractBook;

public class FacadeImpl implements IFacade {

    private final transient IDao dao = CicsDaoFactory.getDao(null);

    @Override
    public void consultaAtendimento(final AbstractBook cobolBook) {
        // TODO Auto-generated method stub
       dao.execute(cobolBook); 
    }

    @Override
    public void validaConcluiAtendimento(final AbstractBook cobolBook) {
        // TODO Auto-generated method stub
        dao.execute(cobolBook);         
    }

    @Override
    public void consultaSituacaoAtendimento(final AbstractBook cobolBook) {
        // TODO Auto-generated method stub
        dao.execute(cobolBook);         
    }

    @Override
    public void consultaAtendimentoNaoConcluido(final AbstractBook cobolBook) {
        // TODO Auto-generated method stub
        dao.execute(cobolBook);         
    }
}
