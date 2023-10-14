package Melhor;

import Ruim.Documento;

public class ImpressoraMultifuncional implements IImpressoraMultiFuncional {

    @Override
    public void Scan(Documento documento) {
        System.out.println("Escanenando documento na impressora multi-funcional");
    }

    @Override
    public void RealizarFax(Documento documento) {
        System.out.println("Realizando fax na impressora multi-funcional");
    }

    @Override
    public void Imprimir(Documento documento) {
        System.out.println("Imprimindo documento na impressora multi-funcional");
    }
}
