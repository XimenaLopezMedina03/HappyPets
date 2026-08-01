package modelo;

public class Tratamiento {

    private Cita cita;
    private String medicamento;
    private String dosis;
    private String duracion;
    private String observaciones;

    public Tratamiento(Cita cita,String medicamento, String dosis,String duracion,String observaciones) {
        this.cita = cita;
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.duracion = duracion;
        this.observaciones = observaciones;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}