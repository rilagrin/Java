import java.util.Scanner;

public class ControleRemoto {
    Televisao televisao = new Televisao();
    Scanner input = new Scanner(System.in);
    private int opcao;
    public void mudarVolume()
    {
        System.out.println("Digite 1 para aumentar o volume\nDigite qualquer número para diminuir o volume: ");
        opcao = input.nextInt();
        int volume = televisao.getVolume();
        if (opcao == 1)
        {
            if (volume == 100)
            {
                System.out.println("O volume já está no máximo.");
            }
            else
            {
                volume += 1;
            }
        }
        else
        {
            if (volume == 0)
            {
                System.out.println("A televisão está sem som");
            }
            else
            {
                volume -= 1;
            }
        }
        televisao.setVolume(volume);
    }
    
    public void mudarCanal()
    {
        System.out.println("Digite 1 para aumentar o número do canal\nDigite 2 número para diminuir o número do canal\nDigite qualquer número para : ");
        opcao = input.nextInt();
        int canal = televisao.getCanal();
        if (opcao == 1)
        {
            if (canal == 50)
            {
                canal = 1;
            }
            else
            {
                canal += 1;
            }
        }
        else
        {
            if (canal == 1)
            {
                canal = 50;
            }
            else
            {
                canal -= 1;
            }
        }
        televisao.setCanal(canal);
    }

    public void consultarVolume()
    {
        System.out.println("Volume = " + televisao.getVolume());
    }

    public void consultarCanal()
    {
        System.out.println("Canal = " + televisao.getCanal());
    }
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();
        Scanner input = new Scanner(System.in);
        boolean ligada = true;
        int escolha;
        do {
            System.out.println("TELEVISÃO");
            System.out.println("1 - Aumentar/Diminuir Volume");
            System.out.println("2 - Aumentar/Diminuir Canal");
            System.out.println("3 - Desligar a televisão");
            System.out.println("Opção:");
            escolha = input.nextInt();
            if (escolha == 1) 
            {
                controleRemoto.mudarVolume();
            } 
            else 
            {
                if (escolha == 2) 
                {
                    controleRemoto.mudarCanal();
                }
                else
                {
                    if (escolha == 3) 
                    {
                        ligada = false;
                    } 
                }
            }
        } while (ligada);
    }
}
