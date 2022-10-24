package models;

public class SerieProxy implements ISerie{
    private int qtdViewes = 0;
    @Override
    public String serieNome(String nome) {

        if(qtdViewes <= 5){

            ServicoISerie servicoISerie = new ServicoISerie();
            servicoISerie.serieNome(nome);
            System.out.println("O link dessa serie: www." + nome);
            qtdViewes ++;


        }
        else {
            System.out.println("Voce ja solicitou 5 vezes essa semana, aguarde a proxima semana!");
        }

        System.out.println(qtdViewes);
        return nome;
    }
}
