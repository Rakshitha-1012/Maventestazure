package cambridge.prg2;
import org.apache.commons.lang3.StringUtils;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String text="      Hello Rakshu      ";
        System.out.println("Trimmed "+StringUtils.trim(text));
        System.out.println("Trimmed "+StringUtils.isEmpty(text));
        System.out.println("Trimmed "+StringUtils.isEmpty(" "));
        System.out.println( "Hello World!" );
    }
}
