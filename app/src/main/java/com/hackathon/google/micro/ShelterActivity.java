package com.hackathon.google.micro;

        import android.app.FragmentManager;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v4.app.FragmentActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.google.android.gms.maps.CameraUpdateFactory;
        import com.google.android.gms.maps.GoogleMap;
        import com.google.android.gms.maps.MapFragment;
        import com.google.android.gms.maps.OnMapReadyCallback;
        import com.google.android.gms.maps.model.BitmapDescriptorFactory;
        import com.google.android.gms.maps.model.LatLng;
        import com.google.android.gms.maps.model.MarkerOptions;

public class ShelterActivity extends FragmentActivity implements OnMapReadyCallback{

    Button b1;
    EditText ed, ed2;
    MapFragment m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter);
        m = (MapFragment)getFragmentManager().findFragmentById(R.id.map);
        m.getMapAsync(this);
        b1=(Button)findViewById(R.id.button);
        ed=(EditText)findViewById(R.id.editZipCode);
        ed2=(EditText)findViewById(R.id.editText3);
    }

    public void find(View view) {
        Toast.makeText(getApplicationContext(),
                "Loading restaurants that pay it forward!", Toast.LENGTH_SHORT).show();
    }

    public void enterCode(View view) {
        Intent intent = new Intent(this, EnterCodeActivity.class);
        startActivity(intent);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        map.addMarker(new MarkerOptions()
                .position(new LatLng(36.156608, -86.778491))
                .title("Music City Center"));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(36.1517802, -86.7868616))
                .title("Watermark Restaurant")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(36.1514713, -86.7817981))
                .title("Arnold's")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(36.147159, -86.798898))
                .title("Chipotle Mexican Grill")
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(36.156608, -86.778491), (float)12.5));
    }
}