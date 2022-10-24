package models;



public class ServicoISerie implements ISerie{

    @Override
    public String serieNome(String nome) {
        return "Voce solicitou a Serie " + nome;

    }

}
