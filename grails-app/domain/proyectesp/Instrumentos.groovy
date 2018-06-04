package proyectesp

class Instrumentos {

    Instrumento inst

    static constraints = {
        inst blank: false
    }

    static belongsTo = [ postulacionMusical : PostulacionMusico ]

}
