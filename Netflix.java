public class Netflix
{
    private int idFilme;
    private String nomeFilme;
    private String categoriaFilme;
    private String atoresFilme;
    private int anoFilme;

    public Netflix (String nomeFilme, String categoriaFilme)
    {
        this.nomeFilme = nomeFilme;
        this.categoriaFilme = categoriaFilme;
    }
    public void setIdFilme(int idFilme)
    {
        this.idFilme = idFilme;
    }

    public void setNomeFilme(String nomeFilme)
    {
        this.nomeFilme = nomeFilme;
    }

    public void setCategoriaFilme(String categoriaFilme)
    {
        this.categoriaFilme = categoriaFilme;
    }

    public void setAtoresFilme(String atoresFilme)
    {
        this.atoresFilme = atoresFilme;   
    }

    public void setAnoFilme(int anoFilme)
    {
        this.anoFilme = anoFilme;
    }

    public int getIdFilme()
    {
        return this.idFilme;
    }

    public String getNomeFilme()
    {
        return this.nomeFilme;
    }

    public String getCategoriaFilme()
    {
        return this.categoriaFilme;
    }

    public String getAtoresFilme()
    {
        return this.atoresFilme;
    }

    public int getAnoFilme()
    {
        return this.anoFilme;
    }

    public void consultarFilme()
    {
        System.out.println("Id = " + this.getIdFilme() + 
        "\nNome = " + this.getNomeFilme() + 
        "\nCategoria = " + this.getCategoriaFilme() + 
        "\nAtores Principais = " + this.getAtoresFilme() +
        "\nAno do lançamento = " + this.getAnoFilme());
    } 
}