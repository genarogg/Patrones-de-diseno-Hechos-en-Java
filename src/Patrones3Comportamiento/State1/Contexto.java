package Patrones3Comportamiento.State;

/**
 * @author Genarogg
 */
public class Contexto{
    private Estado estado;
    
    public Contexto(){
        this.estado = new EstadoConcretoA();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public void mostrar(){
        estado.mostrar();
    }
}