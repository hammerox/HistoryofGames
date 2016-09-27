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

public class RecebeVideoGameActivity extends Activity {

	  private String[] listanintendo = new String [] { "A Empresa", "Icone da Empresa", "Atual Geração", "MegaMan"};
	  private int[] imagensnintendo = {R.drawable.nintendo,R.drawable.mario,R.drawable.wiiu,R.drawable.megaman};
	  Spinner sp;
	  private ImageView iv;
	  TextView textObservacao;
	  Button btAbrirSite_nintendo;
	  
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recebe_video_game);
	
		sp = (Spinner) findViewById(R.id.spinner1);
		iv = (ImageView) findViewById(R.id.imageView1);
		textObservacao = (TextView) findViewById(R.id.textView2);
		btAbrirSite_nintendo = (Button) findViewById(R.id.buttonsitenintendo);
	
		ArrayAdapter<String> adapter =new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, listanintendo);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp.setAdapter(adapter);
		
		sp.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
			   
				iv.setImageResource(imagensnintendo[position]);
				if(position == 0)
					textObservacao.setText(" A Nintendo foi a maior empresa de video games do mundo. \n" +
							               "Sua fundaçãoo foi no ano 1889 e produzia cartõees artesanais. Os mesmos eram definidos com uma espécie de baralho. Em 1981 foi lançado o primeiro jogo de arcade: Donkey Kong.");
				if(position == 1)
					textObservacao.setText("Mario Bros é o principal ícone da empresa. O jogo lançado em 1985 para o NES, foi o predecesor de muitos jogos de sucessos.\n" +
							"Vários jogos com o personagem Mario Bros e sua turma foram lançados durante várias geraçõees de consoles, e até hoje hoje, é o principal personagem de jogos de video games do todo o mundo");
				if(position == 2)
					textObservacao.setText(" O WiiU representa o atual console da Nintendo. \n" +
							"Entre os clássicos em versões em HD para o WiiU estão: Donkey Kong, Mario Kart, DuckTales, Batman, entre outros ");
				if(position == 3)
					textObservacao.setText(" O Personagem Mega Man, É o personagem mais famoso depois de Mario Bros. \n" +
							               " O Mega Man era uma grande carta na manga para os consoles da Nintendo, pois além de Mario, A Nintendo possuía o Mega Man para rivalizar com a Sega, que possuía apenas como grande personagem para suas plataformas, o personagem chamado Sonic.");
				
			
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
	
		
		btAbrirSite_nintendo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse("http://nintendo.com");
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
