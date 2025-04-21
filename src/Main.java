public class Main {
    public static void main(String[] args) {
        Elecciones elecciones = new Elecciones();
        Candidato candidato1 = new Candidato("David Garcia");
        Candidato candidato2 = new Candidato("Andres Suarez");
        Candidato candidato3 = new Candidato("Juan Lopez");

        elecciones.agregarCandidato(candidato1);
        elecciones.agregarCandidato(candidato2);
        elecciones.agregarCandidato(candidato3);

        elecciones.votarPorCandidatos(0, "internet");
        elecciones.votarPorCandidatos(1, "radio");
        elecciones.votarPorCandidatos(2, "television");

        System.out.println("Porcentajes de votos por candidato:");
        elecciones.calcularPorcentajeVotos();

        System.out.println("Costo promedio de campaña:");
        elecciones.calcularCostoTotalCampaña();

        System.out.println("Vaciando urnas:");
        elecciones.vaciarUrnas();
        System.out.println("Nuevo total de votos tras vaciar las urnas: " + elecciones.getVotosTotales());
    }
}
