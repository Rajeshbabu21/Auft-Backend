package com.example.AUFTBackend.Model;


import jakarta.persistence.*;

@Entity
public class Fictures {

    @Id
    @SequenceGenerator(name = "seq_name",sequenceName = "seq_name")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_name")
    private int id;
    private String name;
    private String image_url;
    private String next_img_url;
    private int match_played;
    private int matched_won;
    private int match_loss;
    private int match_draw;


    public Fictures() {
    }

    public Fictures(int id) {
        this.id = id;
    }

    public Fictures(int id,
                    String name,
                    String image_url,
                    String next_img_url,
                    int match_played, int matched_won,
                    int match_loss,
                    int match_draw) {
        this.id = id;
        this.name = name;
        this.image_url = image_url;
        this.next_img_url = next_img_url;
        this.match_played = match_played;
        this.matched_won = matched_won;
        this.match_loss = match_loss;
        this.match_draw = match_draw;
    }

    public Fictures(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getNext_img_url() {
        return next_img_url;
    }

    public void setNext_img_url(String next_img_url) {
        this.next_img_url = next_img_url;
    }

    public int getMatch_played() {
        return match_played;
    }

    public void setMatch_played(int match_played) {
        this.match_played = match_played;
    }

    public int getMatched_won() {
        return matched_won;
    }

    public void setMatched_won(int matched_won) {
        this.matched_won = matched_won;
    }

    public int getMatch_loss() {
        return match_loss;
    }

    public void setMatch_loss(int match_loss) {
        this.match_loss = match_loss;
    }

    public int getMatch_draw() {
        return match_draw;
    }

    public void setMatch_draw(int match_draw) {
        this.match_draw = match_draw;
    }

    @Override
    public String toString() {
        return "Fictures{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image_url='" + image_url + '\'' +
                ", next_img_url='" + next_img_url + '\'' +
                ", match_played=" + match_played +
                ", matched_won=" + matched_won +
                ", match_loss=" + match_loss +
                ", match_draw=" + match_draw +
                '}';
    }
}
