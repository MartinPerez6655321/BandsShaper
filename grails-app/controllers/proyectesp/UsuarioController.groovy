package proyectesp

import usuarios.UsuarioService

class UsuarioController {

    def index() {
    }

    def registracion() {
    }

    def alta() {
        if (UsuarioService.realizarAlta(params.Name, params.LastName, params.Email, params.Password)) {
            redirect(action: "registracionExitosa", method: "post", params: [Name: params.Name, LastName: params.LastName])
        }
        else{
            //Indicar donde fue el error
        }
    }

    def registracionExitosa(){
        [datos: params]
    }

}
