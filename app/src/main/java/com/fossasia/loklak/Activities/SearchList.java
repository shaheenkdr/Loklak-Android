package com.fossasia.loklak.Activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.fossasia.loklak.Activities.POJO.MainPojo;
import com.fossasia.loklak.Activities.POJO.Status;
import com.fossasia.loklak.R;
import com.github.rahatarmanahmed.cpv.CircularProgressView;
import com.google.gson.Gson;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SearchList extends AppCompatActivity
{
    private static String URL_LOKLAK ="http://loklak.org/api/search.json?q=";
    private List<Status> statusX = new ArrayList<Status>();
    CustomAdapter mAdapter;
    private RecyclerView TweetView;
    HashMap <String,JsoupMaterials> htm_doc = new HashMap<>();
    CircularProgressView progressView;
    SimpleTask1 sx;
    SoupeX js;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_list);

        //Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar_list);
        //setSupportActionBar(myToolbar);
        //getSupportActionBar().setTitle(Html.fromHtml("<font color='#FFFFFF'>Loklak</font>"));

        //progressView = (CircularProgressView) findViewById(R.id.progress_view);

        TweetView = (RecyclerView)findViewById(R.id.recycler_list_tweets);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        TweetView.setLayoutManager(llm);



        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        try
        {
            if(bundle != null)
            {
                URL_LOKLAK += bundle.getString("SEARCH");
                Log.w("LoklakLOG::", "" + URL_LOKLAK);
            }
        }
        catch (Exception e)
        {e.printStackTrace();}


        sx = new SimpleTask1();
        sx.execute(URL_LOKLAK);


    }

    private class SimpleTask1 extends AsyncTask<String, String, String>
    {
        ProgressDialog loader;


        @Override
        protected void onPreExecute()
        {
            loader = new ProgressDialog(SearchList.this,ProgressDialog.STYLE_SPINNER);
            loader.setMessage("loading engine");
            loader.show();

            //getApplicationContext().progressView.startAnimation();

        }

        protected String doInBackground(String... urls)
        {
            String result1 = "";
            try {



                HttpGet httpGet1 = new HttpGet(urls[0]);
                HttpClient client1 = new DefaultHttpClient();

                HttpResponse response1 = client1.execute(httpGet1);

                int statusCode = response1.getStatusLine().getStatusCode();

                if (statusCode == 200) {
                    InputStream inputStream1 = response1.getEntity().getContent();
                    BufferedReader reader1 = new BufferedReader
                            (new InputStreamReader(inputStream1));
                    String line1;
                    while ((line1 = reader1.readLine()) != null)
                    {
                        result1 += line1;
                        if(isCancelled())
                            break;

                    }
                }



            } catch (ClientProtocolException e) {

            } catch (IOException e) {

            }
            //Log.w("PREMIERE::::",result);
            return result1;
        }

        protected void onPostExecute(String jsonString)
        {
            loader.dismiss();
            showData(jsonString);



        }




    }



    private void showData(String jsonString) {

        try
        {
            Gson gson = new Gson();
            MainPojo tweets = gson.fromJson(jsonString, MainPojo.class);
            statusX = tweets.getStatuses();
            for (Status result : statusX)
            {
                if(!result.getLinks().isEmpty())
                {
                    js = new SoupeX();

                    js.execute(result.getLinks().get(0));
                }


                Log.w("LOKLAK:::",""+result.getUser().getName());

            }

            mAdapter = new CustomAdapter(statusX,htm_doc);
            mAdapter.notifyDataSetChanged();
            TweetView.setAdapter(mAdapter);

/*
            List<Post> posts_popular = movie1.getPosts();

            mAdapterPop = new CustomAdapter(posts_popular);
            mAdapterPop.notifyDataSetChanged();




            mRecyclerViewPop.setAdapter(mAdapterPop);
*/
        }
        catch (Exception e)
        {
            Snackbar.make(this.findViewById(android.R.id.content), "Check data connection", Snackbar.LENGTH_LONG).show();
            e.printStackTrace();
        }

    }

    private class SoupeX extends AsyncTask <String, String,String>
    {


        @Override
        protected void onPreExecute()
        {


        }

        protected String doInBackground(String... urls)
        {
            try
            {
                Log.w("LOL:","WORK_TEST:"+urls[0]);
                Document doc = Jsoup.connect(urls[0]).userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
                        .referrer("http://www.google.com").timeout(1000 * 5).ignoreHttpErrors(true).get();
                Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
                Elements description = doc.select("meta[name=description]");
                String desc = description.attr("content");
                String title;
                if(doc.title().isEmpty() && doc.title()==null)
                    title=" ";
                else
                title = doc.title();
                //images.get(0).attr("src");

                if(!(images.isEmpty()&&description.isEmpty()))
                {
                    JsoupMaterials jsx = new JsoupMaterials(title, desc, images.get(0).attr("src"));
                    htm_doc.put(urls[0],jsx );
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mAdapter.notifyDataSetChanged();


                        }
                    });


                    Log.w("TANGLE:",""+htm_doc.get(urls[0]));
                }




            }
            catch (Exception e){e.printStackTrace();}

            return "";
        }

        protected void onPostExecute(String jsonString)
        {

        }


    }

    public void goBack(View view)
    {

        sx.cancel(true);
        js.cancel(true);

        finish();
    }
}
