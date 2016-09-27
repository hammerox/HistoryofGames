package com.example.teste;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;


public class MainActivity extends Activity {

	RadioGroup escolheConsole;
	Button avancar;
	int idEscolhido = R.id.wiiu; 
   
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        escolheConsole  = (RadioGroup) findViewById(R.id.radioGroup1);
        
        avancar = (Button) findViewById(R.id.button1);
        
        escolheConsole.setOnCheckedChangeListener(new OnCheckedChangeListener() {
        	
        	            
        	            public void onCheckedChanged(RadioGroup group, int checkedId) {          
        	                	 idEscolhido = escolheConsole.getCheckedRadioButtonId();
        	                	  
        	            }});       
   
    avancar.setOnClickListener(new OnClickListener() {
    	 @Override
		public void onClick(View v) {
    		 
    		  if(idEscolhido == R.id.wiiu){
			Intent intencao_chamar_tela_recebe_video_game = new Intent (getBaseContext(), RecebeVideoGameActivity.class);
			 startActivity(intencao_chamar_tela_recebe_video_game);
			
    		  }
    		  
    		  else if(idEscolhido == R.id.ps4){
    			  Intent intencao_chamar_tela_recebe_video_game_ps4 = new Intent (getBaseContext(), RecebeVideoGamePSActivity.class);
    			  startActivity(intencao_chamar_tela_recebe_video_game_ps4);
    			  
    		  }
    		  else{ 
    	        	
    			 Intent intecao_chamar_tela_xboxone = new Intent(getBaseContext(),RecebeVideoGameXoneActivity.class);	
    		      startActivity(intecao_chamar_tela_xboxone);
    		  }
    	 }
	});  
    
    }
    
   
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
