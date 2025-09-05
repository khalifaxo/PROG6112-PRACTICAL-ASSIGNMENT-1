/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seriesmodel;

/**
 *
 * @author RC_Student_lab
 */
public class SeriesModel {
    public String SeriesId;
    public String SeriesName;
    public int SeriesAge;
    public int SeriesNumberOfEpisodes;

    public SeriesModel(String id, String name, int age, int episodes) {
        this.SeriesId = id;
        this.SeriesName = name;
        this.SeriesAge = age;
        this.SeriesNumberOfEpisodes = episodes;
    }

    @Override
    public String toString() {
        return "Series ID: " + SeriesId +
               ", Name: " + SeriesName +
               ", Age Restriction: " + SeriesAge +
               ", Episodes: " + SeriesNumberOfEpisodes;
    }
}
