/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jaime
 */
public class Especialidad extends Medico {

    public Especialidad(String nombre, String cmp, String tipoEspecialidad) {
        super(cmp, nombre);
        this.tipoEspecialidad = tipoEspecialidad;
    }

    private String tipoEspecialidad;

    public Especialidad(String cmp, String nombre) {
        super(cmp, nombre);
    }

    public String getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public void setTipoEspecialidad(String tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }
    public String getTexto() {
        return this.nombre + " | " + this.cmp+ " | " + this.tipoEspecialidad;

    }

}
