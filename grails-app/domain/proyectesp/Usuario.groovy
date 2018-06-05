package proyectesp

class Usuario {

    String name
    String lastname
    String email
    String password

    static constraints = {
        // con tamano, unico,y debe tener valor.
        name size: 3..20, unique: false, nullable: false
        lastname size: 3..20, unique: false, nullable: false
        email size: 6..20, unique: true, nullable: false
        password size: 4..15, nullable: false
    }

    String toString() { return name + " " + lastname}

}
