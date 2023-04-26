package _17;

public class Main {
    public static void main(String[] args) {
        try{
            throw new UnsupportedMusicFileException("未対応のファイルです。ファイルはmp3にしてください。");
        } catch (Exception error) {
            String message = error.getMessage();
            System.out.println(message);
            error.printStackTrace();
        }
    }
}
