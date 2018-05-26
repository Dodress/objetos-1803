package abstraccion;

public class Conversion {

    private Grados grados;
    private Longitudes longitudes;

    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }

    public Longitudes getLongitudes() {
        return longitudes;
    }

    public void setLongitudes(Longitudes longitudes) {
        this.longitudes = longitudes;
    }

    public float centigradosAFarenheit() {
        //este metodo tiene logica
        return grados.getCentigrados() * 1.8f + 32;
    }

    public float FarenheitACentigrados() {
        //este metodo tiene logica
        return (grados.getFarenheit() - 32) / 1.8f;
    }

    public float metrosAPies() {
        //este metodo hace la conversion de metros a pies
        return longitudes.getMetro() * 3.28f;
    }

    public float PiesAMetros() {
        //este codigo tiene mas logica
        return longitudes.getPies() / 3.28f;
    }

    public float Multiconversor(int indice) {
        float resultado;
        //este metodo llama a otros metodos
        //estaba utilizando sentencias IF ELSE pero netbeans me recomendo usar
        //swith y solo le aprete un boton y lo transformo, muy eficiente fue eso
        switch (indice) {
            case 0:
                resultado=this.centigradosAFarenheit();
                break;
            case 1:
                resultado=this.FarenheitACentigrados();
                break;
            case 2:
                resultado=this.metrosAPies();
                break;
            default:
                resultado=this.PiesAMetros();
                break;
        }

        return resultado;
    }

}
