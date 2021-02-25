package app.pack.darkhorse;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity implements OnClickListener  {

    private Button searchButtonHome;
    private Button searchIcon;
    private Button googleBtn;
    private Button facebookBtn;
    private Button youtubeBtn;
    private Button yahooBtn;
    private Button twitterBtn;
    private Button snapchatBtn;
    private Button instagramBtn;
    private Button duckDuckGoBtn;
    private Button settingsBtn;


    private Button goBackBtn;
    private Button reloadBtn;
    private Button homeBtn;
    private Button bookmarkBtn;
    private Button forwardBtn;


    private EditText searchBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchButtonHome = (Button) findViewById(R.id.search);
        searchIcon = (Button) findViewById(R.id.search_icon);



        googleBtn = (Button) findViewById(R.id.googleBtn);
        facebookBtn = (Button) findViewById(R.id.facebookBtn);
        youtubeBtn = (Button) findViewById(R.id.youtubeBtn);
        yahooBtn = (Button) findViewById(R.id.yahooBtn);
        twitterBtn = (Button) findViewById(R.id.twitterBtn);
        snapchatBtn = (Button) findViewById(R.id.snapchatBtn);
        instagramBtn = (Button) findViewById(R.id.instagramBtn);
        duckDuckGoBtn = (Button) findViewById(R.id.duck_duck_goBtn);
        settingsBtn = (Button) findViewById(R.id.settings);

        YoYo.with(Techniques.SlideInUp).duration(3000).repeat(0).playOn(googleBtn);
        YoYo.with(Techniques.RollIn).duration(3000).repeat(0).playOn(facebookBtn);
        YoYo.with(Techniques.BounceInRight).duration(3000).repeat(0).playOn(youtubeBtn);
        YoYo.with(Techniques.RollIn).duration(3000).repeat(0).playOn(yahooBtn);
        YoYo.with(Techniques.SlideInUp).duration(3000).repeat(0).playOn(twitterBtn);
        YoYo.with(Techniques.RubberBand).duration(3000).repeat(0).playOn(snapchatBtn);
        YoYo.with(Techniques.RollIn).duration(3000).repeat(0).playOn(instagramBtn);
        YoYo.with(Techniques.RubberBand).duration(3000).repeat(0).playOn(duckDuckGoBtn);


        goBackBtn = (Button) findViewById(R.id.backward);
        reloadBtn = (Button) findViewById(R.id.reload);
        homeBtn = (Button) findViewById(R.id.home);
        forwardBtn = (Button) findViewById(R.id.forward);
        bookmarkBtn = (Button) findViewById(R.id.bookmark);
        searchBar = (EditText) findViewById(R.id.search_bar);

        searchButtonHome.setOnClickListener(this);
        searchIcon.setOnClickListener(this);
        googleBtn.setOnClickListener(this);
        facebookBtn.setOnClickListener(this);
        youtubeBtn.setOnClickListener(this);
        yahooBtn.setOnClickListener(this);
        twitterBtn.setOnClickListener(this);
        snapchatBtn.setOnClickListener(this);
        instagramBtn.setOnClickListener(this);
        duckDuckGoBtn.setOnClickListener(this);

        goBackBtn.setOnClickListener(this);
        reloadBtn.setOnClickListener(this);
        homeBtn.setOnClickListener(this);
        bookmarkBtn.setOnClickListener(this);
        forwardBtn.setOnClickListener(this);
        settingsBtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View view)
    {
        if(view == searchButtonHome)
        {

            Intent SearchWeb = new Intent(MainActivity.this, SearchAddressView.class);
            startActivity(SearchWeb);
        }

        if(view == searchIcon)
        {

            Intent SearchWeb = new Intent(MainActivity.this, SearchAddressView.class);
            startActivity(SearchWeb);
        }


        if(view == googleBtn)
        {

            Intent Open_google = new Intent(MainActivity.this, SearchAddressView.class);
            Open_google.putExtra("url_address","https://www.google.com");
            startActivity(Open_google);
        }

        if(view == facebookBtn)
        {

            Intent Open_facebook = new Intent(MainActivity.this, SearchAddressView.class);
            Open_facebook.putExtra("url_address","https://www.facebook.com");
            startActivity(Open_facebook);
        }

        if(view == youtubeBtn)
        {

            Intent Open_youtube = new Intent(MainActivity.this, SearchAddressView.class);
            Open_youtube.putExtra("url_address","https://www.youtube.com");
            startActivity(Open_youtube);
        }

        if(view == yahooBtn)
        {

            Intent Open_yahoo = new Intent(MainActivity.this, SearchAddressView.class);
            Open_yahoo.putExtra("url_address","https://www.yahoo.com");
            startActivity(Open_yahoo);
        }

        if(view == twitterBtn)
        {

            Intent Open_twitter = new Intent(MainActivity.this, SearchAddressView.class);
            Open_twitter.putExtra("url_address","https://www.twitter.com");
            startActivity(Open_twitter);
        }

        if(view == snapchatBtn)
        {

            Intent Open_snapchat = new Intent(MainActivity.this, SearchAddressView.class);
            Open_snapchat.putExtra("url_address","https://www.snapchat.com");
            startActivity(Open_snapchat);
        }

        if(view == instagramBtn)
        {

            Intent Open_instagram = new Intent(MainActivity.this, SearchAddressView.class);
            Open_instagram.putExtra("url_address","https://www.instagram.com");
            startActivity(Open_instagram);
        }


        if(view == duckDuckGoBtn)
        {

            Intent Open_duckduckgo = new Intent(MainActivity.this, SearchAddressView.class);
            Open_duckduckgo.putExtra("url_address","https://www.duckduckgo.com");
            startActivity(Open_duckduckgo);
        }


        if(view == goBackBtn)
        {
            Toast bck = Toast.makeText(MainActivity.this, getString(R.string.exit_text), Toast.LENGTH_LONG);
            bck.show();
            finish();
        }

        if(view == reloadBtn)
        {
            Toast bck = Toast.makeText(MainActivity.this, getString(R.string.reload), Toast.LENGTH_LONG);
            bck.show();
            this.recreate();
        }

        if(view == homeBtn) {
            Toast bck = Toast.makeText(MainActivity.this, getString(R.string.bck_text), Toast.LENGTH_LONG);
            bck.show();
        }

        if(view == bookmarkBtn)
        {
            Toast tst = Toast.makeText(MainActivity.this, getString(R.string.umsg), Toast.LENGTH_LONG);
            tst.show();

        }

        if(view == forwardBtn)
        {
            Toast tst = Toast.makeText(MainActivity.this, getString(R.string.msg_url), Toast.LENGTH_LONG);
            tst.show();
        }
        if(view == settingsBtn)
        {
            Toast tst = Toast.makeText(MainActivity.this, getString(R.string.umsg), Toast.LENGTH_LONG);
            tst.show();

        }
    }

    private void OpenWebSite(){
        String url_Address = searchBar.getText().toString();

        if(TextUtils.isEmpty(url_Address)){
            Toast empty = Toast.makeText(MainActivity.this, getString(R.string.input_url), Toast.LENGTH_LONG);
            empty.show();
        }
        else {
            String url_Without_https = url_Address.replace("https://www.", "");
            String https = "https://www.";
            String www = "www.";

            Intent Search = new Intent(MainActivity.this, SearchAddressView.class);
            Search.putExtra("url_address", https+www+url_Without_https);
            startActivity(Search);

            searchBar.setText("");
        }

    }
}