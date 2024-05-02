package bdd.finalProject.Utility;

public class DataProvider {

    public String getRandomEmail() {
        String name = "Ferdawssek12";
        String email = "@gmail.com";
        String num = "";
        for (int i = 0; i <= 11; i++) {
            num += (int) (Math.random() * 10);
        }
        return name + num + email;
    }
}
