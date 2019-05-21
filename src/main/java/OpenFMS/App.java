/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package OpenFMS;

import OpenFMS.field.Arena;

public class App {
    static Arena field;
    static CLI cli;

    public static void main(String[] args) {
        field = new Arena();
        cli = new CLI(field);

        // Start FMS
        System.out.println("[App] Welcome to OpenFMS!");
        field.start();

        cli.run();
    }
}
