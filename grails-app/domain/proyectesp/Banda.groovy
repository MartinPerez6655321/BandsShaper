package proyectesp

class Banda {

    String nameBanda

    String toString() { return nameBanda}

    static hasMany = [ integranteDeBanda : IntegranteDeBanda ]

}
