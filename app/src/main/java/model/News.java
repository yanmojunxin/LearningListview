package model;

/**
 * Created by l on 2016/9/20.
 */
public class News {
    private int imageRes;
    private String title;
    private String conten;

    public News(int imageRes,String title ,String conten) {
        this.imageRes = imageRes;
        this.title=title;
        this.conten=conten;
    }

    public int getImageRes(){return imageRes;}
    public String getTitle(){return title;}
    public String getConten(){return conten;}
}
