package servicio;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Dueño;

public class DueñoService {

    private ArrayList<Dueño> dueños = new ArrayList<>();

    public void registrarDueño() {

         String nombreDueño = JOptionPane.showInputDialog("Nombre del dueño: ");

                    String dni = JOptionPane.showInputDialog("DNI: ");

                    String telefono = JOptionPane.showInputDialog("Teléfono: ");
                    
                    String correo = JOptionPane.showInputDialog("Correo: ");
            
                    Dueño dueño = new Dueño(
                            nombreDueño,
                            dni,
                            telefono,
                            correo
                    );

        dueños.add(dueño);

        JOptionPane.showMessageDialog(null,"Dueño registrado correctamente.");
    }

    public void mostrarDueños() {

        if (dueños.isEmpty()) {

            JOptionPane.showMessageDialog(null,"No existen dueños.");

            return;
        }

        String lista = "";

        for (Dueño d : dueños) {

            lista +=
                    "Nombre: " + d.getNombre()
                    + "\nDNI: " + d.getDni()
                    + "\nTeléfono: " + d.getTelefono()
                    + "\nDueño: " + d.getCorreo()
                    + "\n----------------------\n";
        }

        JOptionPane.showMessageDialog(null, lista);
    }

    public ArrayList<Dueño> getDueños() {
        return dueños;
    }

}