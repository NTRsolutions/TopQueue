package it.crudmon.interview.topqueue;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class Books extends AppCompatActivity{
    GridView grid;
    Toolbar toolbar;
    ProgressDialog dialog;
    CardView cd;
    CustomGridBook adapter;
    ArrayList<Integer>  arrayList;
    private PrefManager pref;
    String test[]={"Book1","Book2","Book3","Book4","Book5"};
    String web[]={"Book_Desc1","Book_Desc2","Book_Desc3","Book_Desc4","Book_Desc5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        grid=(GridView)findViewById(R.id.BookGrid);
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.pref);
        pref = new PrefManager(getApplicationContext());
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        cd=(CardView)findViewById(R.id.book_card_view);
        toolbar.setTitle("BookStore");

        arrayList=new ArrayList<Integer>();
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        for(int i=0;i<5;i++)
        {
            adapter = new CustomGridBook(getApplicationContext(), test,web);



        grid.setAdapter(adapter);}
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home) {

            startActivity(new Intent(this,MainActivity.class));
        }
        return true;
    }
}
