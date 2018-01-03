package fragments.estudos.com.br.projectusandofagments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by antonio on 03/01/18.
 */

public class FragmentosActionBar extends Fragment {
    private Button btnGoku;
    private Button btnBulma;
    private Button btnVegeta;
    private Button btnFreeza;

    private ImageView imageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.layout_fragmento1, container, false);
        btnGoku = (Button) view.findViewById(R.id.btnGoku);
        btnBulma = (Button) view.findViewById(R.id.btnBulma);
        btnFreeza = (Button) view.findViewById(R.id.btnFreeza);
        btnVegeta = (Button) view.findViewById(R.id.btnVegeta);

        imageView = (ImageView) view.findViewById(R.id.image);

        btnGoku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.goke);
            }
        });

        btnBulma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.bulma);
            }
        });

        btnFreeza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.freeza);
            }
        });

        btnVegeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.vegeta);
            }
        });

        return view;
    }
}
