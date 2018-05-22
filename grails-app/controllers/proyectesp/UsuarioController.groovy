package proyectesp

import usuarios.UsuarioService

class UsuarioController {

    def index() {
    }

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
            redirect(action: "registracion")
        }
    }

    def registracionExitosa(){
        [datos: params]
    }

    def loginExitoso(){

    }

}
