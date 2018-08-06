package modelo;
import entidad.*;

public class Calcular {
    
    //este metodo recive como parametro un objeto de tipo Vehiculo y le pone su atributo clasificacionPrecio
    public static void clasificacionPrecio(Vehiculo v){//cuando un metodo es statico se le puede llamar sin instanciar la clase
        if(v.getPrecio()>0&&v.getPrecio()<350000){
            v.setClasificacionPrecio("Clase C");
        } else if(v.getPrecio()>349999&&v.getPrecio()<700000){
            v.setClasificacionPrecio("Clase B");
        } else{
            v.setClasificacionPrecio("Clase A");
        }
    }
    //este metodo recive como parametro un objeto de tipo Automovil y le su atributo clasificacionAño
    public static void clasificacionAño(Automovil auto){
        if(auto.getAño()<1981){
            auto.setClasificacionAño("Clasico");
        } else if(auto.getAño()>1980&&auto.getAño()<2011){
            auto.setClasificacionAño("Usado");
        } else if(auto.getAño()>2010&&auto.getAño()<2016){
            auto.setClasificacionAño("Seminuevo");
        }else{
            auto.setClasificacionAño("Reciente");
        }
    }
    //este metodo recive como parametro un objeto de tipo camion y le su atributo clasificacionCarga
    public static void clasificacionCarga(Camion c){
        if(c.getCapacidadCarga()>0&&c.getCapacidadCarga()<2001){
            c.setClasificacionCarga("Ligero");
        } else if(c.getCapacidadCarga()>2000&&c.getCapacidadCarga()<4501){
            c.setClasificacionCarga("Mediano");
        }else {
            c.setClasificacionCarga("Pesado");
        }
    }
    
}
