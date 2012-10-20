package br.gov.caixa.sicpf.model.dao;

import java.util.Arrays;

public class MockCicsDAO {

    private static final char PICX_CHAR = ' ';
    private static final char PIC9_CHAR = '0';
    protected static final char FILLER = ' ';

    protected String pic(final String field, final int tamanho) {

        final StringBuilder builder = new StringBuilder(field);
        final int len = builder.length();

        if (len > tamanho) {
            builder.setLength(tamanho);
        } else {
            final char[] str = new char[tamanho - len];
            Arrays.fill(str, PICX_CHAR);
            builder.insert(len, str);
        }

        return builder.toString();
    }
    //metodos para adicionar 0 a esquerda do numero
    protected String pic(final long field, final int tamanhox) {
        final StringBuilder builder = new StringBuilder(Long.toString(field));
        final int len = builder.length();

        if (len > tamanhox) {
            builder.setLength(tamanhox);
        } else {
            final char[] str = new char[tamanhox - len];
            Arrays.fill(str, PIC9_CHAR);
            builder.insert(0, str);
        }

        return builder.toString();
    }
}
