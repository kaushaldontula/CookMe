package com.applications.cookme;      

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseObject;

public class MainActivity extends Activity {
	private Spinner spinner1,spinner2,spinner3,spinner4;
	private Button btnSubmit;
	public String i1,i2,i3,i4;
	public String ing="-";
	 StringBuilder value = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        Parse.initialize(this, "sKLoVNlFLmUUZfDdt7iQHuMwq7SSpZ9U4kjjJSOd", "uoXScusc1n8zbghM5kONCrQV28xAmO2O3ySMdFmU");
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("finalstring", "hello");
        testObject.saveInBackground();
        
        spinner1= (Spinner) findViewById(R.id.s1);  
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, getResources()
                            .getStringArray(R.array.elements));//  
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> arg0, View arg1,
                        int pos, long id) {
                	 i1=arg0.getItemAtPosition(pos).toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> arg0) {
                }
            });
        
        
        spinner2= (Spinner) findViewById(R.id.s2);  
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, getResources()
                            .getStringArray(R.array.elements));//  
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> arg0, View arg1,
                        int pos, long id) {
                	 i2=arg0.getItemAtPosition(pos).toString();
                	
                }

                @Override
                public void onNothingSelected(AdapterView<?> arg0) {
                }
            });
        
        spinner3= (Spinner) findViewById(R.id.s3);  
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, getResources()
                            .getStringArray(R.array.elements));//  
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> arg0, View arg1,
                        int pos, long id) {
                	i3=arg0.getItemAtPosition(pos).toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> arg0) {
                }
            });
        
        spinner4= (Spinner) findViewById(R.id.s4);  
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, getResources()
                            .getStringArray(R.array.elements));//  
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(new OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> arg0, View arg1,
                        int pos, long id) {
                 i4=arg0.getItemAtPosition(pos).toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> arg0) {
                }
            });
     
        btnSubmit = (Button) findViewById(R.id.b1);
         
      
        btnSubmit.setOnClickListener(new OnClickListener() {

        	public void onClick(View v) {
        		ing =i1 + "|" + i2 + "|" + i3 + "|" + i4 ; 
        //	Toast.makeText(MainActivity.this,a + "|" + b + "|" + c + "|" + d ,Toast.LENGTH_SHORT).show();
        		Toast.makeText(MainActivity.this,ing ,Toast.LENGTH_SHORT).show();
        			
        	}


        });

        JSONObject jsonObj = new JSONObject();
        try {
			jsonObj.put("finalstring", ing);
		} catch (JSONException e) {
			e.printStackTrace();
		}
        
       
    
    }
    
    

 
    
}
