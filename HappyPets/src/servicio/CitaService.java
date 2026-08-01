package servicio;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cita;
import modelo.Mascota;
import modelo.Veterinario;

public class CitaService {

    private ArrayList<Cita> citas = new ArrayList<>();

    public void registrarCita(ArrayList<Mascota> mascotas,
                              ArrayList<Veterinario> veterinarios) {

        if (mascotas.isEmpty()) {

            JOptionPane.showMessageDialog(null,"Primero registre una mascota.");
            
            return;
        }

        if (veterinarios.isEmpty()) {

            JOptionPane.showMessageDialog(null,"Primero registre un veterinario." );

            return;
        }

        String listaMascotas = "";

        for (int i = 0; i < mascotas.size(); i++) {

            listaMascotas +=
                    (i + 1)
                    + ". "
                    + mascotas.get(i).getNombre()
                    + "\n";
        }

        int opcionMascota = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una mascota\n\n" + listaMascotas));

        Mascota mascota = mascotas.get(opcionMascota - 1);

        String listaVeterinarios = "";

        for (int i = 0; i < veterinarios.size(); i++) {

            listaVeterinarios +=
                    (i + 1)
                    + ". "
                    + veterinarios.get(i).getNombre()
                    + "\n";
        }

        int opcionVeterinario = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un veterinario\n\n" + listaVeterinarios));

        Veterinario veterinario = veterinarios.get(opcionVeterinario - 1);

        String fecha = JOptionPane.showInputDialog("Fecha:");

        String hora = JOptionPane.showInputDialog("Hora:");

        String motivo = JOptionPane.showInputDialog("Motivo:");

        String estado = "Pendiente";

        Cita cita = new Cita(
                mascota,
                veterinario,
                fecha,
                hora,
                motivo,
                estado
        );

        citas.add(cita);

        JOptionPane.showMessageDialog(null,"Cita registrada correctamente.");

    }

    public void mostrarCitas() {

        if (citas.isEmpty()) {

            JOptionPane.showMessageDialog(null,"No existen citas.");

            return;
        }

        String lista = "";

        for (Cita c : citas) {

            lista +=
                    "Mascota: "
                    + c.getMascota().getNombre()

                    + "\nVeterinario: "
                    + c.getVeterinario().getNombre()

                    + "\nFecha: "
                    + c.getFecha()

                    + "\nHora: "
                    + c.getHora()

                    + "\nMotivo: "
                    + c.getMotivo()

                    + "\nEstado: "
                    + c.getEstado()

                    + "\n----------------------\n";
        }

        JOptionPane.showMessageDialog(null, lista);
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

}