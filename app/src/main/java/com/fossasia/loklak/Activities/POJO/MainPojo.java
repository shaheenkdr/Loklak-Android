package com.fossasia.loklak.Activities.POJO;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class MainPojo
{
    @SerializedName("readme_0")
    @Expose
    private String readme0;
    @SerializedName("readme_1")
    @Expose
    private String readme1;
    @SerializedName("readme_2")
    @Expose
    private String readme2;
    @SerializedName("readme_3")
    @Expose
    private String readme3;
    @SerializedName("search_metadata")
    @Expose
    private SearchMetadata searchMetadata;
    @SerializedName("statuses")
    @Expose
    private List<Status> statuses = new ArrayList<Status>();
    @SerializedName("aggregations")
    @Expose
    private Aggregations aggregations;

    /**
     *
     * @return
     * The readme0
     */
    public String getReadme0() {
        return readme0;
    }

    /**
     *
     * @param readme0
     * The readme_0
     */
    public void setReadme0(String readme0) {
        this.readme0 = readme0;
    }

    /**
     *
     * @return
     * The readme1
     */
    public String getReadme1() {
        return readme1;
    }

    /**
     *
     * @param readme1
     * The readme_1
     */
    public void setReadme1(String readme1) {
        this.readme1 = readme1;
    }

    /**
     *
     * @return
     * The readme2
     */
    public String getReadme2() {
        return readme2;
    }

    /**
     *
     * @param readme2
     * The readme_2
     */
    public void setReadme2(String readme2) {
        this.readme2 = readme2;
    }

    /**
     *
     * @return
     * The readme3
     */
    public String getReadme3() {
        return readme3;
    }

    /**
     *
     * @param readme3
     * The readme_3
     */
    public void setReadme3(String readme3) {
        this.readme3 = readme3;
    }

    /**
     *
     * @return
     * The searchMetadata
     */
    public SearchMetadata getSearchMetadata() {
        return searchMetadata;
    }

    /**
     *
     * @param searchMetadata
     * The search_metadata
     */
    public void setSearchMetadata(SearchMetadata searchMetadata) {
        this.searchMetadata = searchMetadata;
    }

    /**
     *
     * @return
     * The statuses
     */
    public List<Status> getStatuses() {
        return statuses;
    }

    /**
     *
     * @param statuses
     * The statuses
     */
    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    /**
     *
     * @return
     * The aggregations
     */
    public Aggregations getAggregations() {
        return aggregations;
    }

    /**
     *
     * @param aggregations
     * The aggregations
     */
    public void setAggregations(Aggregations aggregations) {
        this.aggregations = aggregations;
    }
}
