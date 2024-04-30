package be.intecbrussel.notebooks.jpa;

import be.intecbrussel.notebooks.jpa.util.CRUDOperations;

public class App {
    public static void main(String[] args) {

        CRUDOperations crudOperations = new CRUDOperations();
        crudOperations.insertEntity();
        crudOperations.findEntity();
        crudOperations.updateEntity();
        crudOperations.removeEntity();

    }
}
