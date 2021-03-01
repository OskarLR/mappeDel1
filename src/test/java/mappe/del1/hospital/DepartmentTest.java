package mappe.del1.hospital;

import mappe.del1.hospital.healtpersonal.Employee;
import org.junit.jupiter.api.*;

class DepartmentTest {
    Patient patient = new Patient("Tore","Tang","12345");
    Employee employee = new Employee("Akka","Bakka","54321");

    Department department = new Department("Department");

    @Nested
    @DisplayName("Testing if method removes employee and patient when the actually exist in the department")
    class positiveTests{

        @Test
        void removePatientWhenPresent() {
            department.addPatient(patient);
            try {
                department.remove(patient);
            } catch (RemoveException e) {
                e.printStackTrace();
            }
            Assertions.assertEquals(department.getPatients().size(), 0);
        }

        @Test
        void removeEmployeeWhenPresent() {
            department.addEmployee(employee);
            try {
                department.remove(employee);
            } catch (RemoveException e) {
                e.printStackTrace();
            }
            Assertions.assertEquals(department.getEmployees().size(), 0);
        }
    }

    @Nested
    @DisplayName("Testing if method throws exception when employee and patient does not exist in the department")
    class negativeTests{
        @Test
        void removePatientWhenAbsent() {
            department.getPatients().clear();
            Assertions.assertThrows(RemoveException.class, () -> department.remove(patient));
        }

        @Test
        void removeEmployeeWhenAbsent() {
            department.getEmployees().clear();
            Assertions.assertThrows(RemoveException.class, () -> department.remove(employee));
        }
    }
}