package com.fossasia.loklak.Activities.POJO;


import com.fossasia.loklak.Activities.POJO.User;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Status
{

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("screen_name")
    @Expose
    private String screenName;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("source_type")
    @Expose
    private String sourceType;
    @SerializedName("provider_type")
    @Expose
    private String providerType;
    @SerializedName("retweet_count")
    @Expose
    private Integer retweetCount;
    @SerializedName("favourites_count")
    @Expose
    private Integer favouritesCount;
    @SerializedName("images")
    @Expose
    private List<Object> images = new ArrayList<Object>();
    @SerializedName("images_count")
    @Expose
    private Integer imagesCount;
    @SerializedName("audio")
    @Expose
    private List<Object> audio = new ArrayList<Object>();
    @SerializedName("audio_count")
    @Expose
    private Integer audioCount;
    @SerializedName("videos")
    @Expose
    private List<Object> videos = new ArrayList<Object>();
    @SerializedName("videos_count")
    @Expose
    private Integer videosCount;
    @SerializedName("place_name")
    @Expose
    private String placeName;
    @SerializedName("place_id")
    @Expose
    private String placeId;
    @SerializedName("place_context")
    @Expose
    private String placeContext;
    @SerializedName("location_point")
    @Expose
    private List<Double> locationPoint = new ArrayList<Double>();
    @SerializedName("location_radius")
    @Expose
    private Integer locationRadius;
    @SerializedName("location_mark")
    @Expose
    private List<Double> locationMark = new ArrayList<Double>();
    @SerializedName("location_source")
    @Expose
    private String locationSource;
    @SerializedName("hosts")
    @Expose
    private List<String> hosts = new ArrayList<String>();
    @SerializedName("hosts_count")
    @Expose
    private Integer hostsCount;
    @SerializedName("links")
    @Expose
    private List<String> links = new ArrayList<String>();
    @SerializedName("links_count")
    @Expose
    private Integer linksCount;
    @SerializedName("mentions")
    @Expose
    private List<Object> mentions = new ArrayList<Object>();
    @SerializedName("mentions_count")
    @Expose
    private Integer mentionsCount;
    @SerializedName("hashtags")
    @Expose
    private List<Object> hashtags = new ArrayList<Object>();
    @SerializedName("hashtags_count")
    @Expose
    private Integer hashtagsCount;
    @SerializedName("without_l_len")
    @Expose
    private Integer withoutLLen;
    @SerializedName("without_lu_len")
    @Expose
    private Integer withoutLuLen;
    @SerializedName("without_luh_len")
    @Expose
    private Integer withoutLuhLen;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("provider_hash")
    @Expose
    private String providerHash;
    @SerializedName("classifier_language")
    @Expose
    private String classifierLanguage;
    @SerializedName("classifier_language_probability")
    @Expose
    private Double classifierLanguageProbability;

    /**
     *
     * @return
     * The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

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
     * The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     * The link
     */
    public String getLink() {
        return link;
    }

    /**
     *
     * @param link
     * The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     *
     * @return
     * The idStr
     */
    public String getIdStr() {
        return idStr;
    }

    /**
     *
     * @param idStr
     * The id_str
     */
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    /**
     *
     * @return
     * The sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     *
     * @param sourceType
     * The source_type
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     *
     * @return
     * The providerType
     */
    public String getProviderType() {
        return providerType;
    }

    /**
     *
     * @param providerType
     * The provider_type
     */
    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     *
     * @return
     * The retweetCount
     */
    public Integer getRetweetCount() {
        return retweetCount;
    }

    /**
     *
     * @param retweetCount
     * The retweet_count
     */
    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    /**
     *
     * @return
     * The favouritesCount
     */
    public Integer getFavouritesCount() {
        return favouritesCount;
    }

    /**
     *
     * @param favouritesCount
     * The favourites_count
     */
    public void setFavouritesCount(Integer favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    /**
     *
     * @return
     * The images
     */
    public List<Object> getImages() {
        return images;
    }

    /**
     *
     * @param images
     * The images
     */
    public void setImages(List<Object> images) {
        this.images = images;
    }

    /**
     *
     * @return
     * The imagesCount
     */
    public Integer getImagesCount() {
        return imagesCount;
    }

    /**
     *
     * @param imagesCount
     * The images_count
     */
    public void setImagesCount(Integer imagesCount) {
        this.imagesCount = imagesCount;
    }

    /**
     *
     * @return
     * The audio
     */
    public List<Object> getAudio() {
        return audio;
    }

    /**
     *
     * @param audio
     * The audio
     */
    public void setAudio(List<Object> audio) {
        this.audio = audio;
    }

    /**
     *
     * @return
     * The audioCount
     */
    public Integer getAudioCount() {
        return audioCount;
    }

    /**
     *
     * @param audioCount
     * The audio_count
     */
    public void setAudioCount(Integer audioCount) {
        this.audioCount = audioCount;
    }

    /**
     *
     * @return
     * The videos
     */
    public List<Object> getVideos() {
        return videos;
    }

    /**
     *
     * @param videos
     * The videos
     */
    public void setVideos(List<Object> videos) {
        this.videos = videos;
    }

    /**
     *
     * @return
     * The videosCount
     */
    public Integer getVideosCount() {
        return videosCount;
    }

    /**
     *
     * @param videosCount
     * The videos_count
     */
    public void setVideosCount(Integer videosCount) {
        this.videosCount = videosCount;
    }

    /**
     *
     * @return
     * The placeName
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     *
     * @param placeName
     * The place_name
     */
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    /**
     *
     * @return
     * The placeId
     */
    public String getPlaceId() {
        return placeId;
    }

    /**
     *
     * @param placeId
     * The place_id
     */
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    /**
     *
     * @return
     * The placeContext
     */
    public String getPlaceContext() {
        return placeContext;
    }

    /**
     *
     * @param placeContext
     * The place_context
     */
    public void setPlaceContext(String placeContext) {
        this.placeContext = placeContext;
    }

    /**
     *
     * @return
     * The locationPoint
     */
    public List<Double> getLocationPoint() {
        return locationPoint;
    }

    /**
     *
     * @param locationPoint
     * The location_point
     */
    public void setLocationPoint(List<Double> locationPoint) {
        this.locationPoint = locationPoint;
    }

    /**
     *
     * @return
     * The locationRadius
     */
    public Integer getLocationRadius() {
        return locationRadius;
    }

    /**
     *
     * @param locationRadius
     * The location_radius
     */
    public void setLocationRadius(Integer locationRadius) {
        this.locationRadius = locationRadius;
    }

    /**
     *
     * @return
     * The locationMark
     */
    public List<Double> getLocationMark() {
        return locationMark;
    }

    /**
     *
     * @param locationMark
     * The location_mark
     */
    public void setLocationMark(List<Double> locationMark) {
        this.locationMark = locationMark;
    }

    /**
     *
     * @return
     * The locationSource
     */
    public String getLocationSource() {
        return locationSource;
    }

    /**
     *
     * @param locationSource
     * The location_source
     */
    public void setLocationSource(String locationSource) {
        this.locationSource = locationSource;
    }

    /**
     *
     * @return
     * The hosts
     */
    public List<String> getHosts() {
        return hosts;
    }

    /**
     *
     * @param hosts
     * The hosts
     */
    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    /**
     *
     * @return
     * The hostsCount
     */
    public Integer getHostsCount() {
        return hostsCount;
    }

    /**
     *
     * @param hostsCount
     * The hosts_count
     */
    public void setHostsCount(Integer hostsCount) {
        this.hostsCount = hostsCount;
    }

    /**
     *
     * @return
     * The links
     */
    public List<String> getLinks() {
        return links;
    }

    /**
     *
     * @param links
     * The links
     */
    public void setLinks(List<String> links) {
        this.links = links;
    }

    /**
     *
     * @return
     * The linksCount
     */
    public Integer getLinksCount() {
        return linksCount;
    }

    /**
     *
     * @param linksCount
     * The links_count
     */
    public void setLinksCount(Integer linksCount) {
        this.linksCount = linksCount;
    }

    /**
     *
     * @return
     * The mentions
     */
    public List<Object> getMentions() {
        return mentions;
    }

    /**
     *
     * @param mentions
     * The mentions
     */
    public void setMentions(List<Object> mentions) {
        this.mentions = mentions;
    }

    /**
     *
     * @return
     * The mentionsCount
     */
    public Integer getMentionsCount() {
        return mentionsCount;
    }

    /**
     *
     * @param mentionsCount
     * The mentions_count
     */
    public void setMentionsCount(Integer mentionsCount) {
        this.mentionsCount = mentionsCount;
    }

    /**
     *
     * @return
     * The hashtags
     */
    public List<Object> getHashtags() {
        return hashtags;
    }

    /**
     *
     * @param hashtags
     * The hashtags
     */
    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    /**
     *
     * @return
     * The hashtagsCount
     */
    public Integer getHashtagsCount() {
        return hashtagsCount;
    }

    /**
     *
     * @param hashtagsCount
     * The hashtags_count
     */
    public void setHashtagsCount(Integer hashtagsCount) {
        this.hashtagsCount = hashtagsCount;
    }

    /**
     *
     * @return
     * The withoutLLen
     */
    public Integer getWithoutLLen() {
        return withoutLLen;
    }

    /**
     *
     * @param withoutLLen
     * The without_l_len
     */
    public void setWithoutLLen(Integer withoutLLen) {
        this.withoutLLen = withoutLLen;
    }

    /**
     *
     * @return
     * The withoutLuLen
     */
    public Integer getWithoutLuLen() {
        return withoutLuLen;
    }

    /**
     *
     * @param withoutLuLen
     * The without_lu_len
     */
    public void setWithoutLuLen(Integer withoutLuLen) {
        this.withoutLuLen = withoutLuLen;
    }

    /**
     *
     * @return
     * The withoutLuhLen
     */
    public Integer getWithoutLuhLen() {
        return withoutLuhLen;
    }

    /**
     *
     * @param withoutLuhLen
     * The without_luh_len
     */
    public void setWithoutLuhLen(Integer withoutLuhLen) {
        this.withoutLuhLen = withoutLuhLen;
    }

    /**
     *
     * @return
     * The user
     */
    public User getUser() {
        return user;
    }

    /**
     *
     * @param user
     * The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     *
     * @return
     * The providerHash
     */
    public String getProviderHash() {
        return providerHash;
    }

    /**
     *
     * @param providerHash
     * The provider_hash
     */
    public void setProviderHash(String providerHash) {
        this.providerHash = providerHash;
    }

    /**
     *
     * @return
     * The classifierLanguage
     */
    public String getClassifierLanguage() {
        return classifierLanguage;
    }

    /**
     *
     * @param classifierLanguage
     * The classifier_language
     */
    public void setClassifierLanguage(String classifierLanguage) {
        this.classifierLanguage = classifierLanguage;
    }

    /**
     *
     * @return
     * The classifierLanguageProbability
     */
    public Double getClassifierLanguageProbability() {
        return classifierLanguageProbability;
    }

    /**
     *
     * @param classifierLanguageProbability
     * The classifier_language_probability
     */
    public void setClassifierLanguageProbability(Double classifierLanguageProbability) {
        this.classifierLanguageProbability = classifierLanguageProbability;
    }

}
