package curso.its.com.usobutterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {


    @Bind(R.id.number)
    TextView texto;

    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Uso de Butter Knife");
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
        //TextView texto = (TextView) findViewById(R.id.number);

    }

    @OnClick(R.id.buttonCount)
    public void contar ()
    {
        num ++;
        texto.setText(String.valueOf(num));
    }

}
