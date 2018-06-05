package proyectesp

class PostulacionMusico {

    Usuario usuario

    static constraints = {
        usuario blank: false
    }

    String toString() { return usuario}

    static hasMany = [ agregarInstrumento : Instrumentos, agregarGenero : ListaGenerosMusicales  ]
}
