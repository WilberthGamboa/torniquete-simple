public class Torniquete {
    private boolean estado;

    public Torniquete() {
        this.estado = false;
    }

    public void setMoneda(){
        this.estado=true;
    }

    public void setPaso(){
        this.estado=false;
    }

    public String isEstado() {
        String mensaje;
       if (this.estado) {
           mensaje="Maquina desbloqueada";
           
       } else {
           mensaje="maquina bloqueada";
           
       }

       return mensaje;
    }

    
    
    
}
