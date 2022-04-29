
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTelecommande {
    @Test
    public void test_ajout_lampe_telecommande_vide(){
        //preparation des données
        Telecommande tel1 =new Telecommande();
        Lampe l1 = new Lampe("lampe1");

        //execution de la methode testé
        tel1.ajouterAppareil((Peripherique) l1);

        //test
        Assertions.assertEquals(l1,tel1.getperipheriques(0),"la lampe en position 0 doit etre ");
    }

    @Test
    public void test_ajout_lampe_telecommande_1element(){
        //preparation des données
        Telecommande tel1 =new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        tel1.ajouterAppareil((Peripherique) l1);

        //execution de la methode testé
        tel1.ajouterAppareil((Peripherique) l2);

        //test
        Assertions.assertEquals(l2,tel1.getperipheriques(1),"la lampe en position 0 doit etre ");
    }

    @Test
    public void test_activation_lampe_position_0(){
        //preparation des données
        Telecommande tel1 =new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        tel1.ajouterAppareil((Peripherique) l1);
        tel1.ajouterAppareil((Peripherique) l2);

        //execution de la methode testé
        tel1.activerAppareil(0);

        //test
        Assertions.assertEquals(true,l1.isAllume(),"la lampe l1 doit etre allumer");
    }

    @Test
    public void test_activation_lampe_position_1(){
        //preparation des données
        Telecommande tel1 =new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        tel1.ajouterAppareil((Peripherique) l1);
        tel1.ajouterAppareil((Peripherique) l2);

        //execution de la methode testé
        tel1.activerAppareil(1);

        //test
        Assertions.assertEquals(true,l2.isAllume(),"la lampe l1 doit etre allumer");
    }


    @Test
    public void test_activation_lampe_inexistante(){
        //preparation des données
        Telecommande tel1 =new Telecommande();
        tel1.ajouterAppareil(new Lampe("l"));
        Lampe l2 = new Lampe("l");
        //test
        Assertions.assertEquals(tel1.getperipheriques(0).toString(), l2.toString(),"rien ne devrait avoir changé");
    }
}
