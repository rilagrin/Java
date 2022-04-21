public class Televisao {
    private int volume = 25;
    private int canal = 10;

    public void setVolume(int vol)
    {
        this.volume = vol; 
    }

    public void setCanal (int canal)
    {
        if (canal < 1 || canal > 50)
        {
            System.out.println("Não foi possível inserir o canal desejado (entre 1 e 50)");
        }
        else
        {
           this.canal = canal; 
        }
    }

    public int getVolume()
    {
        return this.volume;
    }

    public int getCanal()
    {
        return this.canal;
    }
}
