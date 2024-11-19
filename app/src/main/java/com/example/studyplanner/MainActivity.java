package com.example.studyplanner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth auth;
   private Toolbar toolbar;
   private ListView listView;
    FirebaseUser user;
    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        setupUIViews();
        initToolbar();
        setupListView();

        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
        drawerLayout = findViewById(R.id.main);
        buttonDrawerToggle = findViewById(R.id.buttonDrawerToggle);
        navigationView = findViewById(R.id.navigationView);


        buttonDrawerToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.open();
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemid = item.getItemId();
                if (itemid == R.id.navTerms) {
                    Toast.makeText(MainActivity.this, "terms and condition clicked", Toast.LENGTH_SHORT).show();
                }
                if (itemid == R.id.navFeedback) {
                    Toast.makeText(MainActivity.this, "feedback clicked", Toast.LENGTH_SHORT).show();
                }
                if (itemid == R.id.navContact) {
                    Toast.makeText(MainActivity.this, "contavt us clicked", Toast.LENGTH_SHORT).show();
                }

                drawerLayout.close();
                return false;
            }
        });

    }
    private void setupUIViews(){
toolbar = findViewById(R.id.toolbar);
listView = findViewById(R.id.lvmain);
    }
    private void initToolbar(){
       setSupportActionBar(toolbar);
       getSupportActionBar().setTitle("Study planner app");
    }
    private void setupListView(){
      String[] title = getResources().getStringArray(R.array.mains);
      String[] description = getResources().getStringArray(R.array.Description);
      simpleAdapter simpleAdapter = new simpleAdapter(this, title, description);
      listView.setAdapter(simpleAdapter);
      listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
         switch (position){
             case 0:  {
                 Intent intent = new Intent(MainActivity.this, Timetable.class);
                 startActivity(intent);

                 break;

             }
             case 1:  {
                 Intent intent = new Intent(MainActivity.this, sub.class);
                 startActivity(intent);
                 break;
             }
             case 2:  {
                 Intent intent = new Intent(MainActivity.this, pdf.class);
                 startActivity(intent);
                 break;

             }
             case 3:  {
                 Intent intent = new Intent(MainActivity.this, ytresource.class);
                 startActivity(intent);
                 break;
             }
             case 4:  {
                 Intent intent = new Intent(MainActivity.this, Quiz.class);
                 startActivity(intent);
                 break;
             }
         }
          }
      });
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }
    public class simpleAdapter extends BaseAdapter {

        private Context mContext;
        private LayoutInflater layoutInflater;
        private TextView title, description;
        private String[] titleArray;
        private String[] descriptionArray;
        private ImageView imageView;

        public simpleAdapter(Context context, String[] title, String[] description) {
            mContext = context;
            titleArray = title;
            descriptionArray = description;
            layoutInflater = LayoutInflater.from(context);

        }

        @Override
        public int getCount() {
            return titleArray.length;
        }

        @Override
        public Object getItem(int position) {
            return titleArray[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = layoutInflater.inflate(R.layout.main_activity_single_item, parent, false);
            }
          title = (TextView)convertView.findViewById(R.id.tvmain);
            description = (TextView)convertView.findViewById(R.id.tvdescription);
            imageView = (ImageView)convertView.findViewById(R.id.ivmain);

            title.setText(titleArray[position]);
            description.setText(descriptionArray[position]);

            if (titleArray[position].equalsIgnoreCase("Timetable")){
                imageView.setImageResource(R.drawable.timetable);
            }else if (titleArray[position].equalsIgnoreCase("Subjects")){
                imageView.setImageResource(R.drawable.subjects);
            }else if (titleArray[position].equalsIgnoreCase("Resources")) {
                imageView.setImageResource(R.drawable.resources);
            }else if (titleArray[position].equalsIgnoreCase("Video Resources")) {
                imageView.setImageResource(R.drawable.videoresources);
            }else if (titleArray[position].equalsIgnoreCase("Quiz test")) {
                imageView.setImageResource(R.drawable.qiuz);
            }
            return convertView;
        }
    }
}