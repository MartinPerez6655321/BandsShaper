package proyectesp

class PerfilMusical {

    Usuario usuario

    static hasMany = [ experienciaInstrumental : ExperienciaInstrumental,
                       generosMusicales : GenerosMusicales,
                       ondasMusicales : OndasMusicales]

}
