package servicio;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Veterinario;

public class VeterinarioService {

    private ArrayList<Veterinario> veterinarios = new ArrayList<>();

    public void registrarVeterinario() {

        String nombre = JOptionPane.showInputDialog("Nombre:");

        int dni = Integer.parseInt(JOptionPane.showInputDialog("DNI:") );

        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Teléfono:"));

        String especialidad = JOptionPane.showInputDialog("Especialidad:");

        Veterinario veterinario = new Veterinario(
                nombre,
                dni,
                telefono,
                especialidad
        );

        veterinarios.add(veterinario);

        JOptionPane.showMessageDialog(null,"Veterinario registrado correctamente.");
    }

    public void mostrarVeterinarios() {

        if (veterinarios.isEmpty()) {

            JOptionPane.showMessageDialog(null,"No existen veterinarios.");

            return;
        }

        String lista = "";

        for (Veterinario v : veterinarios) {

            lista +=
                    "Nombre: " + v.getNombre()
                    + "\nDNI: " + v.getDni()
                    + "\nTeléfono: " + v.getTelefono()
                    + "\nEspecialidad: " + v.getEspecialidad()
                    + "\n----------------------\n";

        }

        JOptionPane.showMessageDialog(null, lista);
    }

    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

}