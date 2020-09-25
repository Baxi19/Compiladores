import generated.RegExp;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RegExp inst = null;
        CharStream input=null;
        //CommonTokenStream tokens = null;
        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new generated.RegExp(input);
            //tokens = new CommonTokenStream(inst);
        }
        catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}
        List<Token> lista = (List<Token>) inst.getAllTokens();
        for (Token t : lista)
            System.out.println(t.getType() + ":" + t.getText() + "\n");
        // inst = new Scanner(input);
        // inst.reset();
    }
}
