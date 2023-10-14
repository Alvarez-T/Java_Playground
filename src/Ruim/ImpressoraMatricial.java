package Ruim;

public class ImpressoraMatricial implements IImpressoraRuim {

    @Override
    public void Imprimir(Documento documento) {
        System.out.println("Imprimindo documento na impressora matricial");
    }

    @Override
    public void Fax(Documento documento) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void Scan(Documento documento) {
        throw new UnsupportedOperationException();
    }
}
