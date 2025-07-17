package com.example.AUFTBackend.Model.Admin;


import jakarta.persistence.*;

@Entity
public class Fixtures {

    @Id
    @SequenceGenerator(name = "seq_name",sequenceName = "seq_name")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_name")
    private int id;
    private int position_no;
//  private string Img_url;
    private String next_match;
    private int match_won;
    private int  match_loss;

    private int draw;
    private int points;

    public Fixtures() {
    }

    public Fixtures(int id) {
        this.id = id;
    }

    public Fixtures(int id, int position_no, String next_match, int match_won, int match_loss, int draw,int points) {
        this.id = id;
        this.position_no = position_no;
        this.next_match = next_match;
        this.match_won = match_won;
        this.match_loss = match_loss;
        this.draw = draw;
        this.points = points;

    }

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    public int getPoints(int points)
    {
        return points;
    }

    public void setPoints(int points)
    {this.points = points;

    }

    public int getPosition_no() {
        return position_no;
    }

    public void setPosition_no(int position_no) {
        this.position_no = position_no;
    }

    public String getNext_match() {
        return next_match;
    }

    public void setNext_match(String next_match) {
        this.next_match = next_match;
    }

    public int getMatch_won() {
        return match_won;
    }

    public void setMatch_won(int match_won) {
        this.match_won = match_won;
    }

    public int getMatch_loss() {
        return match_loss;
    }

    public void setMatch_loss(int match_loss) {
        this.match_loss = match_loss;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    @Override
    public String toString() {
        return "Fixtures{" +
                "id=" + id +
                ", position_no=" + position_no +
                ", next_match='" + next_match + '\'' +
                ", match_won=" + match_won +
                ", match_loss=" + match_loss +
                ", draw=" + draw +
                ", points=" + points +
                '}';
    }
}
