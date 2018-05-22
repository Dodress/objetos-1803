package abstraccion;

public class Conversion {
    private Grados grados;
    private Longitudes longitudes;
    
    public float centigradosAFarenheit(){
    //este metodo tiene logica
    return grados.getCentigrados()*1.8f+32;
    }

    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }
    
    public float metrosAPies(){
    //este metodo hace la conversion de metros a pies
    return longitudes.getMetro()*3.28f;
    }

    public Longitudes getLongitudes() {
        return longitudes;
    }

    public void setLongitudes(Longitudes longitudes) {
        this.longitudes = longitudes;
    }
 
}
