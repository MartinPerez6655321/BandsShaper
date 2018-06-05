package proyectesp

class ListaGenerosMusicales {

    GeneroMusical genero

    static constraints = {
        genero blank: false
    }

    String toString() { return genero}

    static belongsTo = [ postulacionMusical : PostulacionMusico ]

}
