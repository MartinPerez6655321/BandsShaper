package proyectesp

class UserRegisterController {

    def index() { }

    def formulary() { }

    def successfulRegister() {
        new Usuario(name: params.Name, lastName: params.LastName, email: params.Email).save()
        [datos:params]
    }

}
