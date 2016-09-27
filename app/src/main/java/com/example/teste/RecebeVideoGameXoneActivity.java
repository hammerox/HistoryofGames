package com.example.teste;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class RecebeVideoGameXoneActivity extends Activity {

	  private String[] listaxone = new String [] { "A Empresa", "Icone da Empresa", "Atual Geração", "Halo"};
	  private int[] imagensxone = {R.drawable.microsoft,R.drawable.windows,R.drawable.xboxone,R.drawable.halo};
	  Spinner sp;
	  private ImageView iv;
	  TextView textObservacao; 
	  Button btAbrirSite_xone;
	  
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recebe_video_game_microsoft);
	
		sp = (Spinner) findViewById(R.id.spinner1);
		iv = (ImageView) findViewById(R.id.imageView2);
		textObservacao = (TextView) findViewById(R.id.textView2);
		btAbrirSite_xone = (Button) findViewById(R.id.buttonsitemicrosoft);
	
		ArrayAdapter<String> adapter =new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, listaxone);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp.setAdapter(adapter);
		
		sp.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
			   
				iv.setImageResource(imagensxone[position]);
				if(position == 0)
					textObservacao.setText(" A Sony é uma multinacional japonesa especializada em fabricar diversos tipos de eletrônicos. \n" +
							               " Fundada em 1946, a Sony ficou mundialmente conhecida por causa do seu vasto portifólio de produtos eletrônicos de alta  qualidade.");
				if(position == 1)
					textObservacao.setText(" O Windows é o sistema operacional mais revolucionário e mais utilizado em todo o planeta. \n" +
							               " O Windows ultrapassou todos os sistemas operacionais de sua época. Incluive o seu principal rival foi derrotado facilmente: o OSx da Apple.");
				if(position == 2)
					textObservacao.setText(" O XBox One é a plataforma de entretenimento da Microsoft. \n" +
							"O Atual video game, conta com o chancela de peso de sua produtora: A Microsoft.");
				if(position == 3)
					textObservacao.setText(" A franquia Halo foi consagrada da Microsoft. \n" +
							               " O Jogo já consagrado no PC e Xbox, agora chega ao Xbox One. \n" +
							               " Tal jogo já foi eleito um dos melhores jogos já inventados no ambiente de terceira pessoa.");
							               
				
			
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
	
		
		btAbrirSite_xone.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse("http://microsoft.com");
				Intent intencao_abrir_site = new Intent(Intent.ACTION_VIEW,uri);		
				startActivity(intencao_abrir_site);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.recebe_video_game, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
