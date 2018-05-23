package proyectesp

import usuarios.UsuarioService

class UsuarioController {

    def home() {
        redirect(action: "login")
    }

    def parametrization() {
        redirect(action: "addInstrument")
    }

    //---------------------------------------------------------------------------

    def login() {
    }

    def sing_up() {
    }

    def logueo() {
        if (UsuarioService.realizarLogin(params.Email, params.Password))
        {
            redirect(action: "loginExitoso")
        }
        else
        {
            redirect(action: "login")
        }
    }

    def alta() {
        if (UsuarioService.realizarAlta(params.Name, params.LastName, params.Email, params.Password))
        {
            redirect(action: "registracionExitosa", method: "post", params: [Name: params.Name, LastName: params.LastName])
        }
        else
        {
            //Indicar donde fue el error
            redirect(action: "sing_up")
        }
    }

    def registracionExitosa(){
        [datos: params]
    }

    def loginExitoso(){

    }

    //---------------------------------------------------------------------------

    def addInstrument(){
        [ instrumentos: UsuarioService.listarInstrumentos() ]
    }

    def addGenderMusic(){
        [ generosMusicales: UsuarioService.listarGenerosMusicales() ]
    }

    def addRoleMusic(){
        [ rolesMusicales: UsuarioService.listarRolesMusicales() ]
    }

    def saveInstrumento(){
        UsuarioService.guardarInstrumento(params.instrument)
        redirect(action: "addInstrument")
    }

    def saveGeneroMusical(){
        UsuarioService.guardarGeneroMusical(params.gender)
        redirect(action: "addGenderMusic")
    }

    def saveRolMusical(){
        UsuarioService.guardarRolMusical(params.role)
        redirect(action: "addRoleMusic")
    }

}
