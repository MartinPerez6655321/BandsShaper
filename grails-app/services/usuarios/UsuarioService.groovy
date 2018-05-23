package usuarios

import grails.gorm.transactions.Transactional
import proyectesp.Usuario

@Transactional
class UsuarioService {

    def serviceMethod() {

    }

    static boolean realizarAlta(String nombre, String apellido, String email, String pass)
    {
        def newUser = new Usuario(name: nombre, lastname: apellido, email: email, password: pass)
        //reemplazar la condicion por un metodo que verifique que el usuario no se encuentra en la BD, esto esta en el DAO
        if(true)
        {
            newUser.save()
            return true
        }
        else
        {
            return false
        }
    }

    static boolean realizarLogin(String email, String pass)
    {
        if (Usuario.findByEmail(email) && Usuario.findByPassword(pass))
        {
            return true
        }
        else
        {
            return false
        }
    }

}