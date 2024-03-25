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
package com.proyecto.pis_20_02.clases.menu;

//Clases usadas para reconocimiento de elementos en actividades
//Clases usadas para la presentación de información al usuario
//Clases usadas para cambio entre actividades
//Clases usadas para la conexión interclases
//Clases usadas para el uso de fragmentos
//Clases usadas para el mapeo de cadenas
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import com.proyecto.pis_20_02.R;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;

@SuppressWarnings("UnnecessaryLocalVariable")
public class FragmentosPoliticas extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Creación y presentación visual de la actividad
        final View view = inflater.inflate(R.layout.fragmento_lateral_politicas, container, false);
        //Retornando el estado de la actividad
        return view;
    }

    public void onDestroyView() {
        //Finaliza la interacción con la actividad
        super.onDestroyView();
        //TODO
    }
}