public class Candidato {

    private String Nombre;
    private int votosRadio;
    private int votosTelevisores;
    private int votosInternet;
    private double costoCampaña;

    public void candidato(String Nombre){
        this.Nombre = Nombre;
        this.votosRadio = 0;
        this.votosTelevisores = 0;
        this.votosInternet = 0;
        this.costoCampaña = 0;
    }
    public void registrarVotos(){
        String Votos = null;
        switch (Votos){
            case "internet":
                votosInternet++;
                costoCampaña += 700000;
                break;
            case "Radio":
                votosRadio++;
                costoCampaña += 200000;
                break;
            case "Televisores":
                votosTelevisores++;
                costoCampaña += 600000;
                break;
            default:
                System.out.println("incorrecto");
        }
    }
    public double CostoCampaña(){
        return costoCampaña;
    }
    public String getNombre() {
        return Nombre;
    }

    public int getVotosRadio() {
        return votosRadio;
    }

    public int getVotosTelevisores() {
        return votosTelevisores;
    }

    public int getVotosInternet() {
        return votosInternet;
    }
}
