import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/*
 ** created by: jorge.lessa
 */

class JogoTest {

    @Test
    void testClone() throws CloneNotSupportedException, ParseException {
        Jogo jogo = new Jogo("FIFA12", "esportes", this.stringToDate("10/10/2012"));

        Jogo jogoClone = (Jogo) jogo.clone();
        jogoClone.setCategoria("futebol");

        assertEquals("Jogo{nome='FIFA12', categoria='esportes', dataLancamento=Wed Oct 10 00:00:00 BRT 2012}", jogo.toString());
        assertEquals("Jogo{nome='FIFA12', categoria='futebol', dataLancamento=Wed Oct 10 00:00:00 BRT 2012}", jogoClone.toString());
    }

    Date stringToDate(String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.parse(data);
    }

}