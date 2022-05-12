import java.util.Date;

/*
 ** created by: jorge.lessa
 */
public class Jogo implements Cloneable {

    private String nome;
    private String categoria;
    private Date dataLancamento;

    public Jogo() {
    }

    public Jogo(String nome, String categoria, Date dataLancamento) {
        this.nome = nome;
        this.categoria = categoria;
        this.dataLancamento = dataLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + this.nome + '\'' +
                ", categoria='" + this.categoria + '\'' +
                ", dataLancamento=" + this.dataLancamento +
                '}';
    }
}
