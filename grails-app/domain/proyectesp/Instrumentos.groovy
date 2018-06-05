package proyectesp

class Instrumentos {

    Instrumento inst

    static constraints = {
        PostulacionMusico
        Instrumento
        inst blank: false
    }

    String toString() { return inst}

    static belongsTo = [ postulacionMusical : PostulacionMusico ]

}
