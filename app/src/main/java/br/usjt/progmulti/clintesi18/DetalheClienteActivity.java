package br.usjt.progmulti.clintesi18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author 81610253 Gabriela Vieira SIN3AN-MCA1
 */

public class DetalheClienteActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_cliente);

        TextView nomeSelecionado = (TextView) findViewById(R.id.nome_selecionado);
        Intent intent =getIntent();
        nomeSelecionado.setText(intent.getStringExtra(ListaClientesActivity.NOME));
    }

}
