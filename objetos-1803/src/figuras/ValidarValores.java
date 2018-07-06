
package figuras;

public class ValidarValores {
    
    public static void ValidarNoNegativo(float valor)throws ValorNegativoException{
        if(valor<0)throw new ValorNegativoException();

    }    
}
