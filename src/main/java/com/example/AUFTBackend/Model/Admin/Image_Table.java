package com.example.AUFTBackend.Model.Admin;


import jakarta.persistence.*;

@Entity
public class Image_Table {

    @Id
    @SequenceGenerator(name = "seq_name",sequenceName = "seq_name")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_name")
    private int id;
    private String team_Name;
    private String Image_url;

    public Image_Table() {
    }

    public Image_Table(int id) {
        this.id = id;
    }

    public Image_Table(int id, String team_Name, String image_url) {
        this.id = id;
        this.team_Name = team_Name;
        Image_url = image_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam_Name() {
        return team_Name;
    }

    public void setTeam_Name(String team_Name) {
        this.team_Name = team_Name;
    }

    public String getImage_url() {
        return Image_url;
    }

    public void setImage_url(String image_url) {
        Image_url = image_url;
    }

    @Override
    public String toString() {
        return "Image_Table{" +
                "id=" + id +
                ", team_Name='" + team_Name + '\'' +
                ", Image_url='" + Image_url + '\'' +
                '}';
    }
}
