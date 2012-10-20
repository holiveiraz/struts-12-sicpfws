package br.gov.caixa.sicpf.model.dao;

public final class CicsDaoFactory {
    
    private final static CicsDaoFactory INSTANCE = new CicsDaoFactory();
    
    private CicsDaoFactory() {
        // TODO Auto-generated constructor stub
    }
    
    public CicsDaoFactory getInstance() {
        return INSTANCE;
    }
    
    public static IDao getDao(final String coPrograma) {
        return new CicsDAO(coPrograma);
    }

}
