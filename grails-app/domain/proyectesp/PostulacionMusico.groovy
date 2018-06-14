package proyectesp

class PostulacionMusico {

    Usuario usuario
    Instrumento instrumento
    GeneroMusical generoMusical

    static constraints = {
        usuario blank: false
        instrumento blank: false
        generoMusical blank: false
    }

    String toString() { return usuario; return instrumento; return generoMusical}

}
