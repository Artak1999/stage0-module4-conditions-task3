package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int s = symbol;
        if((s >= 65 && s <= 90) || (s >= 97 && s <= 122))
            System.out.println("English");
        else
            System.out.println("Non English");
    }
}
