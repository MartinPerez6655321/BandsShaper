package proyectesp

class GenerosMusicales {

    GeneroMusical genero

    static constraints = {
        PerfilMusical
        GeneroMusical
        genero blank: false
    }

    String toString() { return genero }


    static belongsTo = [ perfilMusical : PerfilMusical ]

}
