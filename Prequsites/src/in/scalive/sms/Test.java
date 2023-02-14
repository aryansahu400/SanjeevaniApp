import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Test {
    public static void main(String[] args) {
        Unirest.setTimeouts(0,0);
        String answer= null;
        try {
            answer = Unirest.get("https://2factor.in/API/V1/f2c066af-ac76-11ed-813b-0200cd936042/SMS/9131042312/2821/OTP1").asString().getBody();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        System.out.println(answer);
    }
}
