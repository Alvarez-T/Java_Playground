package Ruim;

public class Digitalizadora implements IImpressoraRuim {

    @Override
    public void Imprimir(Documento documento) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void Fax(Documento documento) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void Scan(Documento documento) {
        System.out.println("Digitalizando documento...");
    }
}
