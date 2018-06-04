package proyectesp

class PostulacionMusico {

    Usuario usuario

    static constraints = {
    }

    static hasMany = [ agregarInstrumento : Instrumentos, agregarGenero : ListaGenerosMusicales  ]
}
