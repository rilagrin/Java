public class Smartphone {
    public static void main(String[] args) {
        Netflix netflix = new Netflix("esquecero de min", "komediah");
        netflix.setIdFilme(1);
        netflix.setAtoresFilme("macaulay culkin");
        netflix.setAnoFilme(1992);
        netflix.consultarFilme();
    }
}
