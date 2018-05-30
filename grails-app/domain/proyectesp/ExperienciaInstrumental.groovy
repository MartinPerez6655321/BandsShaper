package proyectesp

class ExperienciaInstrumental {

    Instrumento instrumento
    int yearsExperience

    static constraints = {
        yearsExperience blank: false
    }

    static belongsTo = [ perfilMusical : PerfilMusical ]

}
