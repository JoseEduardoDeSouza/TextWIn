package moblab.exemplolista;

/**
 * Created by charles on 15/07/16.
 */
public class ItemListView {

    private String texto;
    private String nome;

<<<<<<< HEAD
    public ItemListView(String texto, String nome) {
        this.texto = texto;
        this.nome = nome;
    }

    public ItemListView() {
        this.texto = "";
        this.nome = "";
=======
    public ItemListView() {
        this.texto = "";
        this.nome = "";
    }

    public ItemListView(String texto, String nome) {
        this.texto = texto;
        this.nome = nome;
>>>>>>> 7f97fcd80d3cb42aa9fc0a3800ccbc4b2a463ca4
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
