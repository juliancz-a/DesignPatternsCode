public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private String cbu;

    public Cliente(String nombre, String apellido, String email, String cbu) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.cbu = cbu;
    }

    public String getEmail() {
        return email;
    }

    public String getCBU() {
        return cbu;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
