package sena.springbootapp.services;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import sena.springbootapp.model.Empleado;

@Service
public class EmpleadoServices {
	private static final List<Empleado> empleados_LIST = new ArrayList<>(List.of(

            new Empleado(
                    9, "Fernando", "Cruz", LocalDate.of(1987, 9, 15), "Male", "Bolivian",
                    "78901234", "+591 7123 4575", "fernando.cruz@empresa.com", "Calle del Mar 456, Cochabamba",
                    "url_to_Photo_9", false, LocalDate.of(2015, 6, 30), LocalDate.of(2015, 6, 30), LocalDate.of(2023, 1, 10)
            ),
            new Empleado(
                    10, "Gabriela", "Salazar", LocalDate.of(1992, 1, 20), "Female", "Bolivian",
                    "89012345", "+591 7123 4576", "gabriela.salazar@empresa.com", "Calle de la Unión 789, Sucre",
                    "url_to_Photo_10", true, LocalDate.of(2021, 4, 25), LocalDate.of(2021, 4, 25), LocalDate.of(2023, 1, 10)
            ),
            new Empleado(
                    11, "Javier", "Mendoza", LocalDate.of(1983, 5, 5), "Male", "Bolivian",
                    "90123456", "+591 7123 4577", "javier.mendoza@empresa.com", "Calle de la Libertad 321, Tarija",
                    "url_to_Photo_11", true, LocalDate.of(2019, 8, 15), LocalDate.of(2019, 8, 15), LocalDate.of(2023, 1, 10)
            ),
            new Empleado(
                    12, "Claudia", "Paredes", LocalDate.of(1991, 10, 10), "Female", "Bolivian",
                    "01234567", "+591 7123 4578", "claudia.paredes@empresa.com", "Calle de la Esperanza 654, Potosí",
                    "url_to_Photo_12", false, LocalDate.of(2020, 12, 1), LocalDate.of(2020, 12, 1), LocalDate.of(2023, 1, 10)
            ),
            new Empleado(
                    13, "Andrés", "Vargas", LocalDate.of(1986, 3, 3), "Male", "Bolivian",
                    "12345678", "+591 7123 4579", "andres.vargas@empresa.com", "Calle del Sol 456, Cochabamba",
                    "url_to_Photo_13", true, LocalDate.of(2018, 7, 20), LocalDate.of(2018, 7, 20), LocalDate.of(2023, 1, 10)
            ),
            new Empleado(
                    14, "Patricia", "Soto", LocalDate.of(1994, 11, 11), "Female", "Bolivian",
                    "23456789", "+591 7123 4580", "patricia.soto@empresa.com", "Calle de la Paz 789, La Paz",
                    "url_to_Photo_14", false, LocalDate.of(2021, 3, 1), LocalDate.of(2021, 3, 1), LocalDate.of(2023, 1, 10)
            ),
            new Empleado(
                    15, "Ricardo", "Gutiérrez", LocalDate.of(1989, 8, 20), "Male", "Bolivian",
                    "34567890", "+591 7123 4581", "ricardo.gutierrez@empresa.com", "Calle del Río 321, Tarija",
                    "url_to_Photo_15", true, LocalDate.of(2017, 9, 12), LocalDate.of(2017, 9, 12), LocalDate.of(2023, 1, 10)
            )
    ));

    public List<Empleado> getEmpleados(){
        return empleados_LIST;
    }

}
