package com.vbg.remindme.dto;

import java.util.Date;

/**
 * Created by bo0mka on 26.08.16.
 */
public class RemindDTO {

    private String title;
    private Date remindDate;

    public Date getRemindDate() {
        return remindDate;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long id;

    public RemindDTO() {
    }

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
