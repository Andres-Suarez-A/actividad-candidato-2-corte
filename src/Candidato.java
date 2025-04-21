public class Candidato {
    private String nombre;
    private int votosRadio;
    private int votosTelevision;
    private int votosInternet;
    private double costoCampaña;

    public Candidato(String nombre) {
        this.nombre = nombre;
        this.votosRadio = 0;
        this.votosTelevision = 0;
        this.votosInternet = 0;
        this.costoCampaña = 0;
    }

    public void registrarVoto(String tipoVoto) {
        switch (tipoVoto.toLowerCase()) {
            case "internet":
                votosInternet++;
                costoCampaña += 700000;
                break;
            case "radio":
                votosRadio++;
                costoCampaña += 200000;
                break;
            case "television":
                votosTelevision++;
                costoCampaña += 600000;
                break;
            default:
                System.out.println("Tipo de voto incorrecto");
        }
    }

    public double getCostoCampaña() {
        return costoCampaña;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTotalVotos() {
        return votosRadio + votosTelevision + votosInternet;
    }

    public void reiniciarVotos() {
        votosRadio = 0;
        votosTelevision = 0;
        votosInternet = 0;
    }
}
