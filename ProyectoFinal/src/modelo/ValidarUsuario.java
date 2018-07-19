
package modelo;

public class ValidarUsuario {
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ValidarUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void Validacion(String usuario,String password) throws UsuarioNoValidoException{
        if(!usuario.equals(this.usuario.getLogin())&&!password.equals(this.usuario.getPassword())) throw new UsuarioNoValidoException();
    }
}
