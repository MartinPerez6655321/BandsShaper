package proyectesp

class Usuario {

    String name
    String lastname
    String email
    String password

    static constraints = {
        // unico,y debe tener valor.
        email unique: true
    }

    String toString() { return name + " " + lastname}

}
