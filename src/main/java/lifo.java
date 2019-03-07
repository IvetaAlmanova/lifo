import java.util.Stack;

public class lifo {
    public static void main(String[] args) {

        Stack<String> stackOfCards = new Stack<>();


        stackOfCards.push("Slon");
        stackOfCards.push("Krtko");
        stackOfCards.push("Pes");
        stackOfCards.push("Macka");

        System.out.println("Najdene vsetky => " + stackOfCards);
        System.out.println();


        String cardAtTop = stackOfCards.pop();
        System.out.println("Vypis posledne a zmaz() => " + cardAtTop);
        System.out.println("Aktualny zásobník => " + stackOfCards);

        cardAtTop = stackOfCards.pop();
        System.out.println("Vypis posledne a zmaz () => " + cardAtTop);
        System.out.println("Aktualny zásobník => " + stackOfCards);

    }
}