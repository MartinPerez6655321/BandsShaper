package proyectesp

class OndasMusicales {

    OndaMusical onda

    static constraints = {
        onda blank: false
    }

    String toString() { return onda}

    static belongsTo = [ perfilMusical : PerfilMusical ]

}
