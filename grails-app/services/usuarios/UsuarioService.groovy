package usuarios

import grails.gorm.transactions.Transactional
import proyectesp.GeneroMusical
import proyectesp.Instrumento
import proyectesp.RolMusical
import proyectesp.OndaMusical
import proyectesp.Usuario

@Transactional
class UsuarioService {

    boolean realizarAlta(String nombre, String apellido, String email, String pass)
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

    boolean realizarLogin(String email, String pass)
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

//-------------------------------------------------------------
//-------------------------------------------------------------

    void guardarInstrumento(String nameInstr){
        if (Instrumento.findByName(nameInstr)==null){
            new Instrumento(name: nameInstr).save()
        }
    }

    void guardarGeneroMusical(String nameGenero){
        if (GeneroMusical.findByName(nameGenero)==null){
            new GeneroMusical(name: nameGenero).save()
        }
    }

    void guardarRolMusical(String nameRol){
        if (RolMusical.findByName(nameRol)==null){
            new RolMusical(name: nameRol).save()
        }
    }

    void guardarOndaMusical(String nameOnda){
        if (OndaMusical.findByName(nameOnda)==null){
            new OndaMusical(name: nameOnda).save()
        }
    }

    Instrumento[] listarInstrumentos() {
        Instrumento.list() as Instrumento[]
    }

    GeneroMusical[] listarGenerosMusicales() {
        GeneroMusical.list() as GeneroMusical[]
    }

    RolMusical[] listarRolesMusicales() {
        RolMusical.list() as RolMusical[]
    }

    OndaMusical[] listarOndasMusicales() {
        OndaMusical.list() as OndaMusical[]
    }

//-------------------------------------------------------------
//-------------------------------------------------------------

}