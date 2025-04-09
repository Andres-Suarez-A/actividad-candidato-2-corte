public class Main {
    public static void main(String[] args) {
        Elecciones elecciones = new Elecciones();
        Candidato candidato1 = new Candidato("David Garcia");
        Candidato candidato2 = new Candidato("Andres Suarez");
        Candidato candidato3 = new Candidato("Juan Lopez");

        elecciones.agregarCandidato(Candidato1);
        elecciones.agregarCandidato(Candidato2);
        elecciones.agregarCandidato(Candidato3);

        elecciones.votarPorCandidatos(0,"internet");
        elecciones.votarPorCandidatos(1,"radio");
        elecciones.votarPorCandidatos(2,"television");

        System.out.println("porcentajes de votos por candidato:");
        elecciones.calcularPorcentajeVotos();
        System.out.println("costo promedio de campaña");
        elecciones.calcularCostoTotalCampaña();
        System.out.println("vacias urnas:");
        elecciones.vaciarUrnas();
        System.out.println("nuveo total de votos tras vaciar las urnas:"+elecciones.VotosTotales);
    }
}