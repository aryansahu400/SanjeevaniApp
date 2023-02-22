/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevaniapp.util;

import java.util.Base64;

public class EncryptData {
    public static String encryptString(String s){
        Base64.Encoder en=Base64.getEncoder();
        byte[] bytearray=s.getBytes();
        return new String(en.encodeToString(bytearray));
    }
    
}
