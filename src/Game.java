import java.util.Random;
import java.util.Scanner;
public class MainClass {
    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY ='•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println(&quot;Победил человек&quot;);
                break;
            }
            if (isMapFull()) {
                System.out.println(&quot;Ничья&quot;);
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println(&quot;Победил Искуственный Интеллект&quot;);
                break;
            }
            if (isMapFull()) {
                System.out.println(&quot;Ничья&quot;);
                break;
            }
        }
        System.out.println(&quot;Игра закончена&quot;);
    }
    public static boolean checkWin(char symb) {
        if(map[0][0] == symb &amp;&amp; map[0][1] == symb &amp;&amp; map[0][2] == symb) return
                true;
        if(map[1][0] == symb &amp;&amp; map[1][1] == symb &amp;&amp; map[1][2] == symb) return
                true;
        if (map[2][0] == symb &amp;&amp; map[2][1] == symb &amp;&amp; map[2][2] == symb) return
                true;
        if (map[0][0] == symb &amp;&amp; map[1][0] == symb &amp;&amp; map[2][0] == symb) return
                true;
        if (map[0][1] == symb &amp;&amp; map[1][1] == symb &amp;&amp; map[2][1] == symb) return
                true;
