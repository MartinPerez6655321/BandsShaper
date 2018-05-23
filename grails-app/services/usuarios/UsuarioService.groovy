package usuarios

import grails.gorm.transactions.Transactional
import proyectesp.GeneroMusical
import proyectesp.Instrumento
import proyectesp.RolMusical
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

    static guardarInstrumento(String nameInstr){
        if (Instrumento.findByName(nameInstr)==null){
            new Instrumento(name: nameInstr).save()
        }
    }


    static guardarGeneroMusical(String nameGenero){
        if (GeneroMusical.findByName(nameGenero)==null){
            new GeneroMusical(name: nameGenero).save()
        }
    }

    static guardarRolMusical(String nameRol){
        if (RolMusical.findByName(nameRol)==null){
            new RolMusical(name: nameRol).save()
        }
    }


//-------------------------------------------------------------
//-------------------------------------------------------------

    static Instrumento[] listarInstrumentos() {
        Instrumento.list() as Instrumento[]
    }

    static GeneroMusical[] listarGenerosMusicales() {
        GeneroMusical.list() as GeneroMusical[]
    }

    static RolMusical[] listarRolesMusicales() {
        RolMusical.list() as RolMusical[]
    }

//-------------------------------------------------------------
//-------------------------------------------------------------

}