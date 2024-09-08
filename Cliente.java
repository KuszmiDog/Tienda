public class Cliente {
    private int id;
    private String nombre;
    private String correo;
    private int telefono;

    public Cliente(int id, String nombre, String correo, int telefono){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[Cliente: " +
                "ID=" + id +
                ", Nombre='" + nombre + '\'' +
                ", Correo='" + correo + '\'' +
                ", Telefono='" + telefono + '\'' +
                ']';
    }
}
