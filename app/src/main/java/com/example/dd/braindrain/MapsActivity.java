package com.example.dd.braindrain;

import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //TODO:
        LatLng serres = new LatLng(41.092083, 23.541016);
        LatLng provatas = new LatLng(41.068238, 23.390686);
        LatLng aKamila = new LatLng(41.058320, 23.424134);
        LatLng kKamila = new LatLng(41.020431, 23.483293);
        LatLng kMitrousi = new LatLng(41.058680, 23.457547);
        LatLng koumaria = new LatLng(41.016434, 23.434656);
        LatLng skoutari = new LatLng(41.020032, 23.520701);
        LatLng adelfiko = new LatLng(41.014645, 23.457354);
        LatLng agEleni = new LatLng(41.003545, 23.559196);
        LatLng peponia = new LatLng(40.988154, 23.516756);

        mMap.addMarker(new MarkerOptions().position(serres).title("Marker in Serres"));
        mMap.addMarker(new MarkerOptions().position(provatas).title("Marker in provatas"));
        mMap.addMarker(new MarkerOptions().position(aKamila).title("Marker in aKamila"));
        mMap.addMarker(new MarkerOptions().position(kKamila).title("Marker in kKamila"));
        mMap.addMarker(new MarkerOptions().position(kMitrousi).title("Marker in kMitrousi"));
        mMap.addMarker(new MarkerOptions().position(koumaria).title("Marker in koumaria"));
        mMap.addMarker(new MarkerOptions().position(skoutari).title("Marker in skoutari"));
        mMap.addMarker(new MarkerOptions().position(adelfiko).title("Marker in adelfiko"));
        mMap.addMarker(new MarkerOptions().position(agEleni).title("Marker in agEleni"));
        mMap.addMarker(new MarkerOptions().position(peponia).title("Marker in peponia"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kKamila, 11));
    }

    //All Permissions i need for android 6.0 and above
//    public void checkLocationPermission() {
//        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//                ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, MY_PERMISSIONS_REQUEST_LOCATION);
//            }
//        }
//    }
}
