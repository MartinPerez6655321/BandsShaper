package proyectesp

class UsuarioController {

    def UsuarioService

    def index(){
        new Instrumento(name: 'Guitarra Electrica').save()
        new Instrumento(name: 'Bajo').save()
        new Instrumento(name: 'Bateria').save()

        new GeneroMusical(name: 'Hard Rock').save()
        new GeneroMusical(name: 'Heavy Metal').save()
        new GeneroMusical(name: 'Alternative Rock').save()

        new RolMusical(name: 'Voz').save()
        new RolMusical(name: 'Bajista').save()
        new RolMusical(name: 'Guitarrista').save()

        new OndaMusical(name: 'Led Zeppelin').save()
        new OndaMusical(name: 'Queen').save()

        new Usuario(name: 'Ernesto', lastname: 'Guevara', email: 'Ernesto@gmail.com', password: 12345678).save()
        new Usuario(name: 'Diego', lastname: 'Maradona', email: 'Diego@gmail.com', password: 12345678).save()

        redirect(action: "home")

    }

    def home() {
        redirect(action: "login")
    }

    def parametrization() {
        redirect(action: "addInstrument")
    }

//---------------------------------------------------------------------------
//---------------------------------------------------------------------------

    def login() {
    }

    def sign_up() {
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
            redirect(action: "sign_up")
        }
    }

    def registracionExitosa(){
        [datos: params]
    }

    def loginExitoso(){

    }

//---------------------------------------------------------------------------
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

    def addOndaMusic(){
        [ OndasMusicales: UsuarioService.listarOndasMusicales() ]
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

    def saveOndaMusical(){
        UsuarioService.guardarOndaMusical(params.onda)
        redirect(action: "addOndaMusic")
    }
//---------------------------------------------------------------------------
//---------------------------------------------------------------------------


}
