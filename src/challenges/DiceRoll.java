package challenges;

public class DiceRoll {

    int roll() {
        double random = Math.random() * 6;

        return (int) Math.ceil(random);
    }

    public static void main(String[] args) {
        DiceRoll d1 = new DiceRoll();

        int i = 0;
        while (i < 10) {
            System.out.println(d1.roll());
            i++;
        }
    }
}