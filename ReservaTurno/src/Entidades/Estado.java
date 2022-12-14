package Entidades;

public class Estado {
    //Atributos
    private String nombre;
    private String descripcion;
    private String ambito;
    private boolean esReservable;
    private boolean esCancelable;

    public Estado() {
    }
    public Estado(String nombre, String ambito){
        this.nombre = nombre;
        this.ambito = ambito;
    }

    public Estado(String nombre, String descripcion, String ambito, boolean esReservable, boolean esCancelable) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ambito = ambito;
        this.esReservable = esReservable;
        this.esCancelable = esCancelable;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public boolean isEsReservable() {
        return esReservable;
    }

    public void setEsReservable(boolean esReservable) {
        this.esReservable = esReservable;
    }

    public boolean isEsCancelable() {
        return esCancelable;
    }

    public void setEsCancelable(boolean esCancelable) {
        this.esCancelable = esCancelable;
    }
    
    //Empieza CU en Estado
    //Metodo 8
    //Verificar si el estado es activo, NO BAJA TECNICA, NI BAJA DEFINITIVA
        public boolean esActivo(){
        if (this.nombre == "Baja tecnica" || this.nombre == "Baja definitiva")
            return false;
        return true;
    }
    
    //Metodo 24
    public String getNombre() {
        return nombre;
    }
    
    public boolean esAmbitoTurno(){
        if(this.ambito == "Turno")
            return true;
        return false;
    }
    
    public boolean esReservado(){
        if(this.nombre == "Reservado")
            return true;
        return false;
    }
}
