package polimorfismo;

public abstract class Trabajador{

    private int seguro;
    private String nombe;
    private float sueldoBase;

    public abstract void pagar();

    public int getSeguro() {
        return seguro;
    }

    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

}
