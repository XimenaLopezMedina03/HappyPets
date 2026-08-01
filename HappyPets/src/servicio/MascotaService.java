package servicio;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Dueño;
import modelo.Mascota;

public class MascotaService {

    private ArrayList<Mascota> mascotas = new ArrayList<>();

    public void registrarMascota(ArrayList<Dueño> dueños) {

        if (dueños.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Primero registre un dueño.");
           
            return;
        }

        String nombre = JOptionPane.showInputDialog("Nombre:");

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));

        String especie = JOptionPane.showInputDialog("Especie:");

        String raza = JOptionPane.showInputDialog("Raza:");

        String lista = "";

        for (int i = 0; i < dueños.size(); i++) {

            lista += (i + 1)
                    + ". "
                    + dueños.get(i).getNombre()
                    + "\n";

        }

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un dueño\n\n" + lista));

        Dueño dueño = dueños.get(opcion - 1);

        Mascota mascota = new Mascota(
                nombre,
                edad,
                peso,
                especie,
                raza,
                dueño
        );

        mascotas.add(mascota);

        JOptionPane.showMessageDialog(null,"Mascota registrada correctamente.");

    }

    public void mostrarMascotas() {

        if (mascotas.isEmpty()) {

            JOptionPane.showMessageDialog(null,"No existen mascotas.");

            return;
        }

        String lista = "";

        for (Mascota m : mascotas) {

            lista +=
                    "Nombre: " + m.getNombre()
                    + "\nEdad: " + m.getEdad()
                    + "\nPeso: " + m.getPeso()
                    + "\nEspecie: " + m.getEspecie()
                    + "\nRaza: " + m.getRaza()
                    + "\nDueño: " + m.getDueño().getNombre()
                    + "\n----------------------\n";

        }

        JOptionPane.showMessageDialog(null, lista);
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

}