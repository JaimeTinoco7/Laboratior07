/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jaime
 */
public class Paciente extends Persona {

    private String dni;
    private int telefono;
    private String sexo;

    public Paciente(String nombre, String dni, int telefono, String sexo) {
        super(nombre);
        this.dni = dni;
        this.telefono = telefono;
        this.sexo = sexo;
    }

    public Paciente(String nombre) {
        super(nombre);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTexto() {
        return this.nombre + " | " + this.dni
                + " | " + this.telefono + " | "
                + this.sexo;
    }


}
