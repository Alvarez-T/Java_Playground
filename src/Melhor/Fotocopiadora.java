package Melhor;

import Ruim.Documento;

public class Fotocopiadora implements IImpressora, IDigitalizadora {

    @Override
    public void Imprimir(Documento documento) {
        System.out.println("Imprimindo documento pela Fotocopiadora");
    }

    @Override
    public void Scan(Documento documento) {
        System.out.println("Escaneando documento pela Fotocopiadora");
    }
}


