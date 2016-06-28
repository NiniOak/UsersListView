package com.example.aakaeze3261.lab5;

/**
 * Created by aakaeze3261 on 6/24/2016.
 */
public class RowContent {
    private String data_name;
    private int picture_id;
    private String mini_content;
    private String content_type;

    public RowContent(String data_name, int picture_id, String mini_content, String content_type) {
        this.data_name = data_name;
        this.picture_id = picture_id;
        this.mini_content = mini_content;
        this.content_type = content_type;
    }

    public String getData_name()
    {
        return data_name;
    }

    public void setData_name(String data_name)
    {
        this.data_name = data_name;
    }
    public int getPicture_id()
    {
        return picture_id;
    }

    public void setPicture_id(int picture_id)
    {
        this.picture_id = picture_id;
    }
    public String getMini_content()
    {
        return mini_content;
    }

    public void setMini_content(String mini_content)
    {
       this.mini_content = mini_content;
    }
    public String getContent_type()
    {
        return content_type;
    }

    public void setContent_type(String content_type)
    {
        this.content_type = content_type;
    }

}

