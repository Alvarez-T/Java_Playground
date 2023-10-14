package Ruim;

public class Impressora implements IImpressoraRuim {

    @Override
    public void Imprimir(Documento documento) {
        System.out.println("Imprimindo documento...");
    }

    @Override
    public void Fax(Documento documento) {
        System.out.println("Realizando FAX do documento...");
    }

    @Override
    public void Scan(Documento documento) {
        System.out.println("Escaneando documento...");
    }
}
