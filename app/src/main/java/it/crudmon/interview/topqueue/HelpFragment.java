package it.crudmon.interview.topqueue;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by this pc on 08-04-16.
 */
public class HelpFragment extends Fragment {
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Toolbar toolbar;
        View view=inflater.inflate(R.layout.help_layout, container, false);
        Button help=(Button)view.findViewById(R.id.helpbutton);
        Button contact=(Button)view.findViewById(R.id.contactus);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
//                i.setData(Uri.parse("http://blog.topqueue.in/"));
//                startActivity(i);
                Toast.makeText(getActivity(),"Redirecting to our blog",Toast.LENGTH_LONG).show();
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
//                i.setData(Uri.parse("http://topqueue.in/contact"));
//                startActivity(i);
                Toast.makeText(getActivity(),"Redirecting to our website",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }



    @Override
    public void onPause() {
        super.onPause();

    }
}
