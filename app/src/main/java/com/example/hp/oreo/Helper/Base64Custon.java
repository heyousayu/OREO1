package com.example.hp.oreo.Helper;

import android.util.Base64;

/**
 * Created by HP on 10/09/2017.
 */

public class Base64Custon {

    public static String codificarBase64(String texto){
        return Base64.encodeToString(texto.getBytes(),Base64.DEFAULT).replaceAll("(\\n|\\r)","");
    }

    public static String decodificarBase64(String textoCodificado){
        return new String(Base64.decode(textoCodificado, Base64.DEFAULT ));
    }

}
