//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EspecieMarina pez = new Pez("Pez1", "Tanque1", TipoAgua.AGUA_DULCE, 2, false);
        EspecieMarina molusco = new Molusco("Molusco1", "Tanque2", TipoAgua.AGUA_SALADA, true);
        EspecieMarina coral = new Coral("Coral1", "Tanque3", TipoAgua.AGUA_SALADA, "alta");

        pez.registrarEspecie();
        molusco.registrarEspecie();
        coral.registrarEspecie();
    }
}