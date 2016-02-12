package com.fossasia.loklak.Activities;


public class JsoupMaterials
{
    private String title;
    private String description;
    private String imageUrl;

    JsoupMaterials(String title,String desc,String imageUrl)
    {
        this.title = title;
        this.description = desc;
        this.imageUrl = imageUrl;
    }

    public String getTitle()
    {
        return title;

    }

    public String getDescription()
    {
        return description;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }


}
