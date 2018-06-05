package proyectesp

class ExperienciaInstrumental {

    Instrumento instrumento
    int añosDeExperiencia

    static constraints = {
        PerfilMusical
        Instrumento
        int
        añosDeExperiencia blank: false
    }

    String toString() { return añosDeExperiencia + " año de " + instrumento}

    static belongsTo = [ perfilMusical : PerfilMusical ]

}
