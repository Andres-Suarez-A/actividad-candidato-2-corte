import java.util.ArrayList;
import java.util.List;

public class Elecciones {
    private List<Candidato> candidatos; // Cambiado a Candidato
    private int votosTotales;

    public Elecciones() {
        candidatos = new ArrayList<>();
        votosTotales = 0;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public void setVotosTotales(int votosTotales) {
        this.votosTotales = votosTotales;
    }

    public void votarPorCandidatos(int i) {
        if (i >= 0 && i < candidatos.size()) {
            candidatos.get(i).incrementarVoto();
            votosTotales++;
        } else {
            System.out.println("Íncorrecto");
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
            costoTotalCampaña += candidato.calcularCostoTotalCampaña();
        }
        double costoPromedio = costoTotalCampaña / votosTotales;
        System.out.println("Costo total promedio por voto: " + costoPromedio);
    }
}
