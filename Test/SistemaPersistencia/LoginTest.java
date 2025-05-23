package SistemaPersistencia;

import Herramientas.Usuario;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;
class LoginTest {

    @Test
    void iniciarSesion() {
        Login login = new Login();
        Usuario result = login.iniciarSesion("Admin", "Admin");
        assertNotNull(result);
        assertNotNull(result.getUserName());
    }

    @Test
    void iniciarSesionFallidoUsuarioExistente() {
        UsersData usersData = PersistenciaManager.getInstance().getPersistencia().getUsersData();
        Usuario admin = usersData.getUsuarioByNick("Admin");
        if (admin != null){
            Login login = new Login();
            Usuario result = login.iniciarSesion("Admin", "123");
            assertNull(result);
        }
    }

    @Test
    void iniciarSesionFallidoUsuarioNoExistente() {
        UsersData usersData = PersistenciaManager.getInstance().getPersistencia().getUsersData();
        Usuario admin = usersData.getUsuarioByNick("UsuarioNoExistente");
        if (admin == null){
            Login login = new Login();
            Usuario result = login.iniciarSesion("UsuarioNoExistente", "123");
            assertNull(result);
        }
    }

}