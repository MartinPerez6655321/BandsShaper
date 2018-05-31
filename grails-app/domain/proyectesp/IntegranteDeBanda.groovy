package proyectesp

class IntegranteDeBanda {

    Usuario integrante
    RolMusical rolQueCumple
    Instrumento instrumento

    static belongsTo = [ banda : Banda ]

}
