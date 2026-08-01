package servicio;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cita;
import modelo.Tratamiento;

public class TratamientoService {

    private ArrayList<Tratamiento> tratamientos =
            new ArrayList<>();

    public void registrarTratamiento(
            ArrayList<Cita> citas) {

        if (citas.isEmpty()) {

            JOptionPane.showMessageDialog(null,"Primero registre una cita.");

            return;
        }

        String lista = "";

        for (int i = 0; i < citas.size(); i++) {

            lista +=
                    (i + 1)
                    + ". "
                    + citas.get(i).getMascota().getNombre()
                    + " - "
                    + citas.get(i).getFecha()
                    + "\n";
        }

        int opcion = Integer.parseInt(

                JOptionPane.showInputDialog("Seleccione una cita\n\n" + lista));

        Cita cita = citas.get(opcion - 1);

        String medicamento = JOptionPane.showInputDialog("Medicamento:");

        String dosis = JOptionPane.showInputDialog("Dosis:");

        String duracion = JOptionPane.showInputDialog("Duración:");

        String observaciones =JOptionPane.showInputDialog("Observaciones:" );

        Tratamiento tratamiento = new Tratamiento(
                    cita,
                    medicamento,
                    dosis,
                    duracion,
                    observaciones
                );

        tratamientos.add(tratamiento);

        JOptionPane.showMessageDialog(
                null,
                "Tratamiento registrado correctamente."
        );
    }

    public void mostrarTratamientos() {

        if (tratamientos.isEmpty()) {

            JOptionPane.showMessageDialog(null,"No existen tratamientos.");

            return;
        }

        String lista = "";

        for (Tratamiento t : tratamientos) {

            lista +=
                    "Mascota: "
                    + t.getCita().getMascota().getNombre()

                    + "\nVeterinario: "
                    + t.getCita().getVeterinario().getNombre()

                    + "\nMedicamento: "
                    + t.getMedicamento()

                    + "\nDosis: "
                    + t.getDosis()

                    + "\nDuración: "
                    + t.getDuracion()

                    + "\nObservaciones: "
                    + t.getObservaciones()

                    + "\n----------------------\n";

        }

        JOptionPane.showMessageDialog(null, lista);
    }

    public ArrayList<Tratamiento> getTratamientos() {
        return tratamientos;
    }

}