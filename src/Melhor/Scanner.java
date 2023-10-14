package Melhor;

import Ruim.Documento;

public class Scanner implements IDigitalizadora{
    @Override
    public void Scan(Documento documento) {
        System.out.println("Escaneando documento pelo Scanner");
    }
}
