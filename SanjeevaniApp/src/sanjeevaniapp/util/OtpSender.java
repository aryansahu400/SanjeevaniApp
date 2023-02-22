
package sanjeevaniapp.util;

import com.mashape.unirest.http.Unirest;


public class OtpSender implements Sender {
    @Override
    public boolean send(String number, String data)throws Exception{
        Unirest.setTimeouts(0, 0);
        String message=Unirest.get("https://2factor.in/API/V1/f2c066af-ac76-11ed-813b-0200cd936042/SMS/"+number+"/"+data+"/OTP1").asString().getBody();
        return (message.contains("Success"));
    }
}
