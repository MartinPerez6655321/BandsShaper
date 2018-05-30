package proyectesp

class GenerosMusicales {

    GeneroMusical genero

    static constraints = {
        genero blank: false
    }

    static belongsTo = [ perfilMusical : PerfilMusical ]

}
