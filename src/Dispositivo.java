public class Dispositivo {
    private String nombre;
    private String marca;
    private boolean activo;
    private String tipo;

    // implemetacion de Setters y Getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // metodo para saber si el dispositivo esta activo o no
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Metodo para activar el dispositivo
    public void activar() {
        this.activo = true;
    }

    // Metodo para desactivar el dispositivo
    public void desactivar() {
        this.activo = false;
    }





}
