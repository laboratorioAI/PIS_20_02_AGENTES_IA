/**************************************************************************************************************************
 **                                                                                                                      **
 **                                              PROYECTO PIS-20-02                                                      **
 **                                         AGENTE DE RESPUESTA SIGOAVE                                                  **
 **                                                                                                                      **
 **                                                DESARROLLADOR                                                         **
 **                                                                                                                      **
 **                                         ARROYO AUZ CHRISTIAN XAVIER                                                  **
 **                                         christian.arroyo@epn.edu.ec                                                  **
 **                                                                                                                      **
 *************************************************************************************************************************/

//Paquete que contiene un conjunto de clases relacionadas por finalidad, ámbito y herencia
package com.proyecto.pis_20_02.base_datos;

//Clases usadas para la conexión con AWS mediante Amplify y Cognito
//Clases usadas para la presentación de información al usuario
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import android.app.Application;
import android.util.Log;

//Clase que permite la conexión con los servidores de AWS
public class PrincipalAmplify extends Application {
    //En el método onCreate() ejecuta la lógica de
    //arranque básica de la aplicación
    public void onCreate() {
        super.onCreate();
        //Inicia la conexión con Cognito de AWS, presentando un mensaje en consola si se establece la conexión  o no.
        try {
            Amplify.addPlugin(new AWSCognitoAuthPlugin());
            Log.i("MyCognitoApp", "Initialized Cognito");
        } catch (AmplifyException e) {
            Log.e("MyCognitoApp", "Could not initialize Cognito", e);
        }
        //Inicia la conexión con Amplify de AWS, presentando un mensaje en consola si se establece la conexión o no.
        try {
            Amplify.configure(getApplicationContext());
            Log.i("MyAmplifyApp", "Initialized Amplify");
        } catch (AmplifyException error) {
            Log.e("MyAmplifyApp", "Could not initialize Amplify", error);
        }
    }
}