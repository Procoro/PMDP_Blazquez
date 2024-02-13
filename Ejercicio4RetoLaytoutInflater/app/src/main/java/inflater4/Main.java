package inflater4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
 import com.pblazquez.primera.ejercicio4retolaytoutinflater.R;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflar el diseño XML
        View rootView = LayoutInflater.from(this).inflate(R.layout.activity_main, null);

        // Obtener referencia al linearLayout (puedes usar el tipo de layout que estés utilizando)
        LinearLayout linearLayout = rootView.findViewById(R.id.linearLayoutContainer);

        // Crear un nuevo TextView dinámicamente
        TextView nuevoTextView = new TextView(this);
        nuevoTextView.setText("Hola, Pablo");
        Button nuevoButton = new Button(this);
        nuevoButton.setText("Boton de Pablo");
        TextView nuevoTextView2 = new TextView(this);
        nuevoTextView2.setText("Hola, Pablo, otro textview");

        // Agregar el nuevo TextView al contenedor
        linearLayout.addView(nuevoTextView);
        linearLayout.addView(nuevoButton);
        linearLayout.addView(nuevoTextView2);

        // Establecer la vista inflada en la actividad
        setContentView(rootView);
    }
}