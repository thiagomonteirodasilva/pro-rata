package prorata.thiagomonteiro.com.prorata.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import prorata.thiagomonteiro.com.prorata.R;

/**
 * Created by Thiago on 09/04/2018.
 */
public class PopSignificado extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));
    }
}
