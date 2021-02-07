package com.e.welnessapp;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;
import java.util.Locale;

public class HomeScreen extends AppCompatActivity implements LocationListener {

    RecyclerView rvDisease;
    LinearLayout llName, llBloodGrp, llDob;
    Button openMap;
    protected LocationManager locationManager;
    protected LocationListener locationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen_activity);

        rvDisease = findViewById(R.id.rvDisease);
        openMap = findViewById(R.id.open_map_button);

//        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            // TODO: Consider calling
//            //    ActivityCompat#requestPermissions
//            // here to request the missing permissions, and then overriding
//            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//            //                                          int[] grantResults)
//            // to handle the case where the user grants the permission. See the documentation
//            // for ActivityCompat#requestPermissions for more details.
//            return;
//        }
//        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);

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
                new DiseaseListData("Covid-19", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public")
        };

        openMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("clicked");

//                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", "23.6102°", "85.2799°");
                Intent intent = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://maps.google.com/maps?saddr=20.344,34.34&daddr=20.5666,45.345"));
                startActivity(intent);
            }
        });
        DiseaseListAdapter adapter = new DiseaseListAdapter(list, getApplicationContext());
        rvDisease.setLayoutManager(new LinearLayoutManager(this));
        rvDisease.setAdapter(adapter);
    }

    @Override
    public void onLocationChanged(Location location) {
        Double lat = location.getLatitude();
        Double lng = location.getLongitude();

        System.out.println("user lat and longitude:" + lat + " " + lng);
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
