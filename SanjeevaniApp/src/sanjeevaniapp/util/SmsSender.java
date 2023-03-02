/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevaniapp.util;
import java.net.*;
import java.util.Base64;
import java.io.*;
public class SmsSender implements Sender {
    @Override
    public boolean send(String number, String data)throws Exception{
        String myURI = "https://api.bulksms.com/v1/messages";

        // change these values to match your own account
        String myUsername = NewBulkSMSId.getUserName();
        String myPassword = NewBulkSMSId.getPassword();
         number="91"+number.trim();
        // the details of the message we want to send
        String myData = "{to:\""+number.trim()+"\", encoding: \"UNICODE\", body: \""+data+"\"}";
        StringBuilder result;

        // if your message does not contain unicode, the "encoding" is not required:
        // String myData = "{to: \"1111111\", body: \"Hello Mr. Smith!\"}";

        // build the request based on the supplied settings
        URL url = new URL(myURI);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.setDoOutput(true);

        // supply the credentials
        String authStr = myUsername + ":" + myPassword;
        String authEncoded = Base64.getEncoder().encodeToString(authStr.getBytes());
        request.setRequestProperty("Authorization", "Basic " + authEncoded);

        // we want to use HTTP POST
        request.setRequestMethod("POST");
        request.setRequestProperty( "Content-Type", "application/json");

        // write the data to the request
        OutputStreamWriter out = new OutputStreamWriter(request.getOutputStream());
        out.write(myData);
        out.close();

        // try ... catch to handle errors nicely
        try {
          // make the call to the API
          result=new StringBuilder();
          InputStream response = request.getInputStream();
          BufferedReader in = new BufferedReader(new InputStreamReader(response));
          String replyText;
          while ((replyText = in.readLine()) != null) {
//            System.out.println(replyText);

            if(replyText.contains("SENT"))return true;
            result.append(replyText);
          }
          in.close();
        } catch (IOException ex) {
            result=new StringBuilder();
          System.out.println("An error occurred:" + ex.getMessage());
          BufferedReader in = new BufferedReader(new InputStreamReader(request.getErrorStream()));
          // print the detail that comes with the error
          String replyText;
          while ((replyText = in.readLine()) != null) {
            System.out.println(replyText);
            result.append(replyText);
          }
          in.close();
        }
        request.disconnect();
        String res=result.toString();
        return res.contains("SENT")||res.contains("Insufficient Credits");
       
    
    }
}
