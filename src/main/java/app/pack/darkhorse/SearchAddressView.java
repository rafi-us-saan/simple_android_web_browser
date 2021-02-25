package app.pack.darkhorse;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class SearchAddressView extends AppCompatActivity implements View.OnClickListener {

    private Button searchButton;
    private Button searchIcon;

    private Button goBackBtn;
    private Button reloadBtn;
    private Button homeBtn;
    private Button forwardBtn;
    private Button bookmarkBtn;
    private Button settingsBtn;


    private EditText searchBar;
    private WebView searchWebAddress;
    String url;

    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_address_view);


        searchButton = (Button) findViewById(R.id.search);
        searchIcon = (Button) findViewById(R.id.search_icon);

        settingsBtn = (Button) findViewById(R.id.settings);
        searchBar = (EditText) findViewById(R.id.search_bar);
        searchWebAddress = (WebView) findViewById(R.id.web_view);

        goBackBtn = (Button) findViewById(R.id.backward);
        reloadBtn = (Button) findViewById(R.id.reload);
        homeBtn = (Button) findViewById(R.id.home);
        forwardBtn = (Button) findViewById(R.id.forward);
        bookmarkBtn = (Button) findViewById(R.id.bookmark);

        searchBar = (EditText) findViewById(R.id.search_bar);



        url = Objects.requireNonNull(getIntent().getExtras().get("url_address")).toString();
        searchBar.setText(url);

        WebSettings webSetting = searchWebAddress.getSettings();
        webSetting.setJavaScriptEnabled(true);
        webSetting.setLoadsImagesAutomatically(true);
        webSetting.supportMultipleWindows();
        searchWebAddress.loadUrl(url);
        searchWebAddress.setWebViewClient(new WebViewClient());

        searchButton.setOnClickListener(this);
        searchIcon.setOnClickListener(this);

        goBackBtn.setOnClickListener(this);
        reloadBtn.setOnClickListener(this);
        homeBtn.setOnClickListener(this);
        bookmarkBtn.setOnClickListener(this);
        forwardBtn.setOnClickListener(this);
    }


    @Override
    public void onBackPressed(){
        if(searchWebAddress.canGoBack()){
            searchWebAddress.canGoBack();
        }
        else {
            super.onBackPressed();
        }
    }


    public void onClick(View view)
    {
        if(view == searchButton)
        {
            searchWebAddress();
        }

        if(view == searchIcon)
        {

            Intent SearchWeb = new Intent(SearchAddressView.this, SearchAddressView.class);
            startActivity(SearchWeb);
        }


        if(view == goBackBtn)
        {
            finish();
            Intent Home = new Intent(SearchAddressView.this, MainActivity.class);
            startActivity(Home);
        }

        if(view == reloadBtn)
        {
            finish();
            searchWebAddress.reload();
        }

        if(view == homeBtn)
        {
            finish();
            Intent Home = new Intent(SearchAddressView.this, MainActivity.class);
            startActivity(Home);
        }

        if(view == bookmarkBtn)
        {
            Toast tst = Toast.makeText(SearchAddressView.this, getString(R.string.umsg), Toast.LENGTH_LONG);
            tst.show();

        }

        if(view == forwardBtn)
        {
            finish();
            searchWebAddress.canGoForward();
        }

        if(view == settingsBtn)
        {
            Toast tst = Toast.makeText(SearchAddressView.this, getString(R.string.umsg), Toast.LENGTH_LONG);
            tst.show();

        }
    }

    private void searchWebAddress(){
        String url_Address = searchBar.getText().toString();

        if(TextUtils.isEmpty(url_Address)){
            Toast empty = Toast.makeText(SearchAddressView.this, getString(R.string.input_url), Toast.LENGTH_LONG);
            empty.show();
        }
        else {
            String url_Without_https = url_Address.replace("https://www.", "");
            String https = "https://www.";
            String www = "www.";

            Intent Search = new Intent(SearchAddressView.this, SearchAddressView.class);
            Search.putExtra("url_address", https+www+url_Without_https);
            startActivity(Search);

            searchBar.setText("");
        }


    }

}