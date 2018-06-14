package proyectesp

class PostulacionBanda {

    Usuario usuario
    Instrumento instrumento
    int añosDeExperiencia

    static constraints = {
        usuario blank: false
        instrumento blank: false
        añosDeExperiencia blank: false
    }

    String toString() { return usuario; return instrumento }

}
