
package figuras;


public class ValorNegativoException extends Exception{
    public ValorNegativoException(){
        super("no se permiten valores negativos!!!"
        //las excepciones nunca llevan logica
        );
    }
}
