package com.example.jinsu.posters;

import android.graphics.drawable.Drawable;

/**
 * Created by jinsu on 2018-03-27.
 */

public class ChangeItem {
    private String ch_txt_name;
    private String ch_txt_detail;
    private String ch_txt_detail2;
    private Drawable ch_drawable;
    private boolean isCheked;

    public ChangeItem(String name, String detail1, String detail2, Drawable drawable, boolean isCheked)
    {
        this.ch_txt_name=name;
        this.ch_txt_detail=detail1;
        this.ch_txt_detail2=detail2;
        this.ch_drawable=drawable;
        this.isCheked=isCheked;
    }
    public void setCh_txt_name(String ch_txt_name) {
        this.ch_txt_name = ch_txt_name;
    }

    public void setCh_txt_detail(String ch_txt_detail) {
        this.ch_txt_detail = ch_txt_detail;
    }

    public void setCh_txt_detail2(String ch_txt_detail2) {
        this.ch_txt_detail2 = ch_txt_detail2;
    }

    public void setCh_drawable(Drawable ch_drawable) {
        this.ch_drawable = ch_drawable;
    }

    public void setCheked(boolean cheked) {
        isCheked = cheked;
    }

    public String getCh_txt_name() {

        return ch_txt_name;
    }

    public String getCh_txt_detail() {
        return ch_txt_detail;
    }

    public String getCh_txt_detail2() {
        return ch_txt_detail2;
    }

    public Drawable getCh_drawable() {
        return ch_drawable;
    }

    public boolean isCheked() {
        return isCheked;
    }



}
