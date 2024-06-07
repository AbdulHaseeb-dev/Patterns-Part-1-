public class CharacterPattern {
    public static void main(String[] args) {
        int n = 4;
        char q = 'A';
        for (int line=1; line<=n; line++) {
            for (int i=1; i<=line; i++) {
                System.out.print(q);
                q ++;
            }
            System.out.println();
        }
    }
}
