package proyectesp

class PerfilMusical {

    Usuario usuario

    static constraints = {
        usuario blank: false
    }

    String toString() { return usuario}

    static hasMany = [ experienciaInstrumental : ExperienciaInstrumental,
                       generosMusicales : GenerosMusicales,
                       ondasMusicales : OndasMusicales]

}
