/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jaime
 */
public class Medico extends Persona {

    String cmp;

    public Medico(String nombre) {
        super(nombre);
    }

    public Medico(String cmp, String nombre) {
        super(nombre);
        this.cmp = cmp;
    }

    public String getCmp() {
        return cmp;
    }

    public void setCmp(String cmp) {
        this.cmp = cmp;
    }

    public String getTexto() {
        return this.nombre + " | " + this.cmp;

    }
}
