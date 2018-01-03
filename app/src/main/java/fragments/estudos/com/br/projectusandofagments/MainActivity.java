package fragments.estudos.com.br.projectusandofagments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtem um FragmentManager
       // FragmentManager fm = getSupportFragmentManager();

        //Abre uma transação e adiciona
        //FragmentTransaction ft = fm.beginTransaction();
        //Adiciona
       // ft.add(R.id.layoutGeral, new FragmentosActionBar());
        //Substitui
        //ft.replace(R.id.layoutGeral, new FragmentosActionBar());
        //Remove
//        ft.remove()
        //ft.commit();
    }
}
