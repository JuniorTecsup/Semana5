package pe.vilchez.semana5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class CarneAdapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carne_adapter);

        try {
            String dni="75600611";
            BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
            Bitmap bitmap = barcodeEncoder.encodeBitmap(dni, BarcodeFormat.QR_CODE, 400, 400);

            ImageView imageViewQrCode = (ImageView) findViewById(R.id.barra);
            imageViewQrCode.setImageBitmap(bitmap);
        } catch(Exception e) {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();

        }
    }
}
