package com.example.locales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.locales.entity.PhoneLocale;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    ListView list;
    Set<PhoneLocale> phoneLocales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.lvList);

        list.setAdapter(new SimpleAdapter(phoneLocales.toArray(), ));

        PhoneNumberUtil phoneInstance =PhoneNumberUtil.getInstance();
        Set<String> set = phoneInstance.getSupportedRegions();
        phoneLocales = new HashSet<>();

        for(String country : set){
            Locale locale = new Locale("en", country);
            PhoneLocale pl = new PhoneLocale(
                    country,
                    phoneInstance.getCountryCodeForRegion(country),
                    locale.getDisplayCountry());
            phoneLocales.add(pl);

            Log.d("LOCALE -> ", pl.toString());
        }



    }
}
