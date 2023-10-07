/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;

/**
 *
 * @author jaime
 */
public class Cita {

    private String nombre;

    private String fecha;
    private String hora;
    private List<Medico> medicos;
    private List<Paciente> pacientes;

    public Cita(String nombre, String fecha, String hora) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void agregarPaciente(Paciente paciente) {
        if (this.pacientes != null
                && this.pacientes.size() >= 0) {
            pacientes.add(paciente);
        }

    }

    public void agregarMedico(Medico medico) {
        if (this.medicos != null
                && this.medicos.size() >= 0) {
            medicos.add(medico);
        }

    }

    public String getTexto() {
        return this.nombre + " | " + this.fecha + " | " + this.hora;
    }

}
