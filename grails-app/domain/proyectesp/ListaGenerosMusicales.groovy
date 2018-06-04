package proyectesp

class ListaGenerosMusicales {

    GeneroMusical genero

    static constraints = {
        genero blank: false
    }

    static belongsTo = [ postulacionMusical : PostulacionMusico ]

}
