package IMC;

public class Imc {

    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getImc() {
        float imc = usuario.getPeso() / (usuario.getAltura() * usuario.getAltura());
        String resultado;

        if (imc < 20) {
            resultado = imc + ", anemia";
        } else if (imc >= 20 && imc < 25) {
            resultado = imc + ", ideal";
        } else {
            resultado = imc + ", sobrepeso";
        }

        return resultado;
    }

}
