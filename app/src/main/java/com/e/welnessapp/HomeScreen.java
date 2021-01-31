package com.e.welnessapp;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;

public class HomeScreen extends AppCompatActivity {

    RecyclerView rvDisease;
    LinearLayout llName, llBloodGrp, llDob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen_activity);

        rvDisease = findViewById(R.id.rvDisease);

        DiseaseListData[] list = new DiseaseListData[] {
                new DiseaseListData("Common Cold", "https://www.medicalnewstoday.com/articles/166606"),
                new DiseaseListData("Dengue", "https://www.cdc.gov/dengue/symptoms/index.html"),
                new DiseaseListData("Cholera", "https://www.webmd.com/a-to-z-guides/cholera-faq#:~:text=Cholera%20is%20an%20infectious%20disease,a%20bacterium%20called%20Vibrio%20cholerae."),
                new DiseaseListData("Diarrhoea", "https://www.medicalnewstoday.com/articles/158634#causes"),
                new DiseaseListData("Diabetes", "https://www.medicalnewstoday.com/articles/323627#how-insulin-problems-develop"),
                new DiseaseListData("Hepatitis–B", "https://www.webmd.com/hepatitis/digestive-diseases-hepatitis-b#:~:text=Hepatitis%20B%20is%20an%20infection,has%20the%20hepatitis%20B%20virus."),
                new DiseaseListData("Malaria", "https://www.healthline.com/health/malaria#:~:text=Malaria%20is%20a%20life%2Dthreatening,is%20released%20into%20your%20bloodstream."),
                new DiseaseListData("Rabies", "https://www.medicalnewstoday.com/articles/181980"),
                new DiseaseListData("Migraine", "https://www.medicalnewstoday.com/articles/148373"),
                new DiseaseListData("Tuberculosis", "https://www.medicalnewstoday.com/articles/8856#symptoms"),
                new DiseaseListData("Covid-19", "https://www.ncbi.nlm.nih.gov/books/NBK554776/")
        };

//        HashMap<String, String> map = new HashMap<>();

//        map.put("Common Cold", "https://www.medicalnewstoday.com/articles/166606");
//        map.put("Dengue", "https://www.cdc.gov/dengue/symptoms/index.html");
//        map.put("Cholera", "https://www.webmd.com/a-to-z-guides/cholera-faq#:~:text=Cholera%20is%20an%20infectious%20disease,a%20bacterium%20called%20Vibrio%20cholerae.");
//        map.put("Diarrhoea", "https://www.medicalnewstoday.com/articles/158634#causes");
//        map.put("Diabetes", "https://www.medicalnewstoday.com/articles/323627#how-insulin-problems-develop");
//        map.put("Hepatitis–B", "https://www.webmd.com/hepatitis/digestive-diseases-hepatitis-b#:~:text=Hepatitis%20B%20is%20an%20infection,has%20the%20hepatitis%20B%20virus.");
//        map.put("Malaria", "https://www.healthline.com/health/malaria#:~:text=Malaria%20is%20a%20life%2Dthreatening,is%20released%20into%20your%20bloodstream.");
//        map.put("Rabies", "https://www.medicalnewstoday.com/articles/181980");
//        map.put("Migraine", "https://www.medicalnewstoday.com/articles/148373");
//        map.put("Tuberculosis", "https://www.medicalnewstoday.com/articles/8856#symptoms");
//        map.put("Covid-19", "https://www.ncbi.nlm.nih.gov/books/NBK554776/");

        DiseaseListAdapter adapter = new DiseaseListAdapter(list, getApplicationContext());
        rvDisease.setLayoutManager(new LinearLayoutManager(this));
        rvDisease.setAdapter(adapter);
    }
}
