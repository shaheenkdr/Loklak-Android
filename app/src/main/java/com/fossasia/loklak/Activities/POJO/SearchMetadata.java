package com.fossasia.loklak.Activities.POJO;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchMetadata
{
    @SerializedName("itemsPerPage")
    @Expose
    private String itemsPerPage;
    @SerializedName("count")
    @Expose
    private String count;
    @SerializedName("count_twitter_all")
    @Expose
    private Integer countTwitterAll;
    @SerializedName("count_twitter_new")
    @Expose
    private Integer countTwitterNew;
    @SerializedName("count_backend")
    @Expose
    private Integer countBackend;
    @SerializedName("count_cache")
    @Expose
    private Integer countCache;
    @SerializedName("hits")
    @Expose
    private Integer hits;
    @SerializedName("period")
    @Expose
    private Integer period;
    @SerializedName("query")
    @Expose
    private String query;
    @SerializedName("client")
    @Expose
    private String client;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("servicereduction")
    @Expose
    private String servicereduction;

    /**
     *
     * @return
     * The itemsPerPage
     */
    public String getItemsPerPage() {
        return itemsPerPage;
    }

    /**
     *
     * @param itemsPerPage
     * The itemsPerPage
     */
    public void setItemsPerPage(String itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    /**
     *
     * @return
     * The count
     */
    public String getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    public void setCount(String count) {
        this.count = count;
    }

    /**
     *
     * @return
     * The countTwitterAll
     */
    public Integer getCountTwitterAll() {
        return countTwitterAll;
    }

    /**
     *
     * @param countTwitterAll
     * The count_twitter_all
     */
    public void setCountTwitterAll(Integer countTwitterAll) {
        this.countTwitterAll = countTwitterAll;
    }

    /**
     *
     * @return
     * The countTwitterNew
     */
    public Integer getCountTwitterNew() {
        return countTwitterNew;
    }

    /**
     *
     * @param countTwitterNew
     * The count_twitter_new
     */
    public void setCountTwitterNew(Integer countTwitterNew) {
        this.countTwitterNew = countTwitterNew;
    }

    /**
     *
     * @return
     * The countBackend
     */
    public Integer getCountBackend() {
        return countBackend;
    }

    /**
     *
     * @param countBackend
     * The count_backend
     */
    public void setCountBackend(Integer countBackend) {
        this.countBackend = countBackend;
    }

    /**
     *
     * @return
     * The countCache
     */
    public Integer getCountCache() {
        return countCache;
    }

    /**
     *
     * @param countCache
     * The count_cache
     */
    public void setCountCache(Integer countCache) {
        this.countCache = countCache;
    }

    /**
     *
     * @return
     * The hits
     */
    public Integer getHits() {
        return hits;
    }

    /**
     *
     * @param hits
     * The hits
     */
    public void setHits(Integer hits) {
        this.hits = hits;
    }

    /**
     *
     * @return
     * The period
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     *
     * @param period
     * The period
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     *
     * @return
     * The query
     */
    public String getQuery() {
        return query;
    }

    /**
     *
     * @param query
     * The query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     *
     * @return
     * The client
     */
    public String getClient() {
        return client;
    }

    /**
     *
     * @param client
     * The client
     */
    public void setClient(String client) {
        this.client = client;
    }

    /**
     *
     * @return
     * The time
     */
    public Integer getTime() {
        return time;
    }

    /**
     *
     * @param time
     * The time
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     *
     * @return
     * The servicereduction
     */
    public String getServicereduction() {
        return servicereduction;
    }

    /**
     *
     * @param servicereduction
     * The servicereduction
     */
    public void setServicereduction(String servicereduction) {
        this.servicereduction = servicereduction;
    }

}
