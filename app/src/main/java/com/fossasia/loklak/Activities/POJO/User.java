package com.fossasia.loklak.Activities.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User
{

    @SerializedName("screen_name")
    @Expose
    private String screenName;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("profile_image_url_https")
    @Expose
    private String profileImageUrlHttps;
    @SerializedName("appearance_first")
    @Expose
    private String appearanceFirst;
    @SerializedName("appearance_latest")
    @Expose
    private String appearanceLatest;

    /**
     *
     * @return
     * The screenName
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     *
     * @param screenName
     * The screen_name
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    /**
     *
     * @return
     * The userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     * The user_id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The profileImageUrlHttps
     */
    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    /**
     *
     * @param profileImageUrlHttps
     * The profile_image_url_https
     */
    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    /**
     *
     * @return
     * The appearanceFirst
     */
    public String getAppearanceFirst() {
        return appearanceFirst;
    }

    /**
     *
     * @param appearanceFirst
     * The appearance_first
     */
    public void setAppearanceFirst(String appearanceFirst) {
        this.appearanceFirst = appearanceFirst;
    }

    /**
     *
     * @return
     * The appearanceLatest
     */
    public String getAppearanceLatest() {
        return appearanceLatest;
    }

    /**
     *
     * @param appearanceLatest
     * The appearance_latest
     */
    public void setAppearanceLatest(String appearanceLatest) {
        this.appearanceLatest = appearanceLatest;
    }

}
