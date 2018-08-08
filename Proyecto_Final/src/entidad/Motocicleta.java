package entidad;

public class Motocicleta extends Vehiculo{
    private String uso;
    private int ccMotor;
    private String clasificacionUso;

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public int getCcMotor() {
        return ccMotor;
    }

    public void setCcMotor(int ccMotor) {
        this.ccMotor = ccMotor;
    }

    public String getClasificacionUso() {
        return clasificacionUso;
    }

    public void setClasificacionUso(String clasificacionUso) {
        this.clasificacionUso = clasificacionUso;
    }

    public Motocicleta() {
    }

    public Motocicleta(String uso, int ccMotor, String clasificacionUso, String marca, String modelo, int año, String color, String paisOrigen, double precio) {
        super(marca, modelo, año, color, paisOrigen, precio);
        this.uso = uso;
        this.ccMotor = ccMotor;
        this.clasificacionUso = clasificacionUso;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + tooString() + "uso=" + uso + ", ccMotor=" + ccMotor + ", clasificacionUso=" + clasificacionUso + '}';
    }
    
    
    
}
