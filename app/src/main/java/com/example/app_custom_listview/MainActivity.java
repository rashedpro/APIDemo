package com.example.app_custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Button button;
    EditText editText;
    int currentposition=-1;
     ArrayList<String> name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list1);
        button=findViewById(R.id.btn1);
        editText=findViewById(R.id.edt1);

         name = new ArrayList<>();
        name.add("rashed");
        name.add("ali");
        name.add("saleh");
        name.add("sam");

        //Myadapter myadapter = new Myadapter(this, name);
        final ArrayAdapter<String>myadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);
        listView.setAdapter(myadapter);
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 String x=myadapter.getItem(i);
                  editText.setText(x);
                  currentposition=i;

             }
         });
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(currentposition>=0){

                     name.set(currentposition,editText.getText().toString());
                     currentposition=-1;
                     editText.setText("");
                 }else {
                     String valu = editText.getText().toString();
                     name.add(valu);
                 }
                 myadapter.notifyDataSetChanged();
             }
         });
    }

}
