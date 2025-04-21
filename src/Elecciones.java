import java.util.ArrayList;
import java.util.List;

public class Elecciones {
    private List<Candidato> candidatos;
    private int votosTotales;

    public Elecciones() {
        candidatos = new ArrayList<>();
        votosTotales = 0;
    }

    public void agregarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public int getVotosTotales() {
        return votosTotales;
    }

    public void votarPorCandidatos(int i, String tipoVoto) {
        if (i >= 0 && i < candidatos.size()) {
            candidatos.get(i).registrarVoto(tipoVoto);
            votosTotales++;
        } else {
            System.out.println("Índice incorrecto");
        }
    }

    public void vaciarUrnas() {
        for (Candidato candidato : candidatos) {
            candidato.reiniciarVotos();
        }
        votosTotales = 0;
    }

    public void calcularPorcentajeVotos() {
        for (Candidato candidato : candidatos) {
            int totalVotosCandidato = candidato.getTotalVotos();
            double porcentaje = (totalVotosCandidato / (double) votosTotales) * 100;
            System.out.println("Candidato: " + candidato.getNombre() + ", Porcentaje de Votos: " + porcentaje + "%");
        }
    }

    public void calcularCostoTotalCampaña() {
        double costoTotalCampaña = 0;
        for (Candidato candidato : candidatos) {
            costoTotalCampaña += candidato.getCostoCampaña();
        }
        double costoPromedio = costoTotalCampaña / (votosTotales > 0 ? votosTotales : 1);
        System.out.println("Costo total promedio por voto: " + costoPromedio);
    }
}
