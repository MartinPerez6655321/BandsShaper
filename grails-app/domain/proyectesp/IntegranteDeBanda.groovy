package proyectesp

class IntegranteDeBanda {

    Usuario integrante
    RolMusical rolQueCumple
    Instrumento instrumento

    static constraints = {
        Banda
        Usuario
        Instrumento
        RolMusical
    }

    String toString() { return integrante}

    static belongsTo = [ banda : Banda ]

}
