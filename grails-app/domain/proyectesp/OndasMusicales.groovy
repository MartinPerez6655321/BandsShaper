package proyectesp

class OndasMusicales {

    OndaMusical onda

    static constraints = {
        onda blank: false
    }

    static belongsTo = [ perfilMusical : PerfilMusical ]

}
