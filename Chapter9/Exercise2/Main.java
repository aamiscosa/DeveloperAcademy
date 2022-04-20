package Chapter9.Exercise2;

public class Main {
    public static void main(String...args) {
        PersonalAccount pAccount = new PersonalAccount(110, "Azana", "Erano", "E. Gonzales Street", "Silang", "Cavite", "4118");
        pAccount.withdrawal(10);
        System.out.println("-".repeat(50));
        pAccount.withdrawal(10);

        System.out.println("-".repeat(50));

        BusinessAccount bAccount = new BusinessAccount(550, "Salonga", "Aldrin", "Grove Street", "General Trias", "Cavite", "4107");
        bAccount.withdrawal(50);
        System.out.println("-".repeat(50));
        bAccount.withdrawal(50);
    }
}
