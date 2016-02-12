package com.fossasia.loklak.Activities;


import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fossasia.loklak.Activities.POJO.Status;
import com.fossasia.loklak.R;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.HashMap;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.FeedsViewHolder>
{
    private static final String CHECK = "http";





    DataHolder d1 = new DataHolder();



    public  class FeedsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        CardView cv;

        ImageView webImage;
        TextView titleWeb;
        ImageView profileDp;
        TextView userName;
        TextView nameOfUser;
        TextView tweetText;
        CardView previewCard;
        TextView descriptionText;
        StringBuilder url;




        FeedsViewHolder(final View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
           // titleWeb = (TextView)itemView.findViewById(R.id.title_web);
            profileDp = (ImageView)itemView.findViewById(R.id.profile_pic);
            webImage = (ImageView)itemView.findViewById(R.id.web_image);
            userName = (TextView)itemView.findViewById(R.id.tweet_user_name);
            nameOfUser = (TextView)itemView.findViewById(R.id.tweet_name_of_user);
            tweetText = (TextView)itemView.findViewById(R.id.tweet_text);
            descriptionText = (TextView)itemView.findViewById(R.id.description_text);
            previewCard = (CardView)itemView.findViewById(R.id.web_info_card);

            Typeface face= Typeface.createFromAsset(itemView.getContext().getAssets(), "fonts/Roboto-Regular.ttf");
            tweetText.setTypeface(face);
            nameOfUser.setTypeface(face);
            userName.setTypeface(face);

            if(d1.feeds.get(getLayoutPosition()+1).getLinks().isEmpty())
                previewCard.setVisibility(View.GONE);

            if(!d1.feeds.get(getLayoutPosition()+1).getLinks().isEmpty())
            {
                try
                {
                    previewCard.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v)
                        {
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(d1.feeds.get(getLayoutPosition()).getLinks().get(0)));
                            itemView.getContext().startActivity(i);

                        }
                    });

                    tweetText.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(d1.feeds.get(getLayoutPosition()).getLinks().get(0)));
                            itemView.getContext().startActivity(i);

                        }
                    });

                }
                catch (IndexOutOfBoundsException e){e.printStackTrace();}



            }





            itemView.setOnClickListener(this);



        }


        @Override
        public void onClick(View view)
        {


        }


    }

    private class DataHolder
    {
        List<Status> feeds;
        HashMap<String,JsoupMaterials> jsoup_doc;

    }



    CustomAdapter(List<Status> mpost,HashMap<String,JsoupMaterials> temp)
    {
        this.d1.feeds = mpost;
        this.d1.jsoup_doc = temp;
    }



    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }








    @Override
    public FeedsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);
        FeedsViewHolder pvh = new FeedsViewHolder(v);
        return pvh;
    }



    @Override
    public void onBindViewHolder(FeedsViewHolder feedViewHolder, int i)
    {
        JsoupMaterials tempJS;





        if(d1.feeds.get(i).getUser().getProfileImageUrlHttps()!=null)
        {


            Picasso.with(feedViewHolder.profileDp.getContext())
                    .load(d1.feeds.get(i).getUser().getProfileImageUrlHttps())
                    .into(feedViewHolder.profileDp);

        }
        if(!d1.feeds.get(i).getLinks().isEmpty() && d1.feeds.get(i).getLinks() != null)
        {
           tempJS = d1.jsoup_doc.get(d1.feeds.get(i).getLinks().get(0));

            try
            {
                //if(!tempJS.getTitle().isEmpty() && tempJS.getTitle() != null)
                //    feedViewHolder.titleWeb.setText(tempJS.getTitle());

                if(!tempJS.getDescription().isEmpty() && tempJS.getDescription() != null)
                    feedViewHolder.descriptionText.setText(tempJS.getDescription());




            Picasso.with(feedViewHolder.webImage.getContext())
                    .load(tempJS.getImageUrl())
                    .into(feedViewHolder.webImage);
            }
            catch (NullPointerException e){e.printStackTrace();}
        }

        if(d1.feeds.get(i).getUser().getName().length()>12)
        {
            feedViewHolder.nameOfUser.setText(d1.feeds.get(i).getUser().getName().substring(0,11));
        }
        else
        {
            feedViewHolder.nameOfUser.setText(d1.feeds.get(i).getUser().getName());
        }


        feedViewHolder.userName.setText("@"+d1.feeds.get(i).getScreenName());
        try
        {
            int temp = d1.feeds.get(i).getText().indexOf(CHECK);

            if (temp != -1)
            {
                 String A = d1.feeds.get(i).getText().substring(0, temp);
                 String B = d1.feeds.get(i).getText().substring(temp);


                if(B.length()>30)
                    B = B.substring(0,30)+"...";

                 String C = "<font color='#008FB3'>" + B + "</font>";
                 feedViewHolder.tweetText.setText(Html.fromHtml(A + C));

            }
            else
            {
                 feedViewHolder.tweetText.setText(d1.feeds.get(i).getText());
            }
        }
        catch (Exception e)
        {e.printStackTrace();}

        //feedViewHolder.profileDp.setImageUrl(d1.feeds.get(i).getUser().getProfileImageUrlHttps(),imageLoader);








    }

    @Override
    public int getItemCount()
    {

        if(d1.feeds!=null)
        {
            return d1.feeds.size();
        }
        else
        {
            return 0;
        }
    }



}

