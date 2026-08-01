package principal;

import javax.swing.JOptionPane;
import servicio.CitaService;
import servicio.DueñoService;
import servicio.MascotaService;
import servicio.TratamientoService;
import servicio.VeterinarioService;

public class Main {

    public static void main(String[] args) {

        MascotaService mascotaService = new MascotaService();
        DueñoService dueñoService = new DueñoService();
        VeterinarioService veterinarioService = new VeterinarioService();
        CitaService citaService = new CitaService();
        TratamientoService tratamientoService = new TratamientoService();

        int opcion;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "========== HAPPYPETS ==========\n\n"
                    + "1. Registrar dueño\n"
                    + "2. Mostrar dueños\n"
                    + "3. Registrar mascota\n"
                    + "4. Mostrar mascotas\n"
                    + "5. Registrar veterinario\n"
                    + "6. Mostrar veterinarios\n"
                    + "7. Registrar cita\n"
                    + "8. Mostrar citas\n"
                    + "9. Registrar tratamiento\n"
                    + "10. Mostrar tratamientos\n"
                    + "11. Salir\n\n"
                    + "Seleccione una opción:"
            ));

            switch (opcion) {

                case 1:
                    dueñoService.registrarDueño();
                    break;

                case 2:
                    dueñoService.mostrarDueños();
                    break;

                case 3:
                    mascotaService.registrarMascota(
                            dueñoService.getDueños()
                    );
                    break;

                case 4:
                    mascotaService.mostrarMascotas();
                    break;

                case 5:
                    veterinarioService.registrarVeterinario();
                    break;

                case 6:
                    veterinarioService.mostrarVeterinarios();
                    break;

                case 7:
                    citaService.registrarCita(
                            mascotaService.getMascotas(),
                            veterinarioService.getVeterinarios()
                    );
                    break;

                case 8:
                    citaService.mostrarCitas();
                    break;

                case 9:
                    tratamientoService.registrarTratamiento(
                            citaService.getCitas()
                    );
                    break;

                case 10:
                    tratamientoService.mostrarTratamientos();
                    break;

                case 11:
                    JOptionPane.showMessageDialog(
                            null,
                            "Gracias por usar HappyPets."
                    );
                    break;

                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opción inválida."
                    );
            }

        } while (opcion != 11);

    }

}