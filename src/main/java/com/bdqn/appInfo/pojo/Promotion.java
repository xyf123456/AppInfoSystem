package com.bdqn.appInfo.pojo;

import java.io.Serializable;
import java.util.Date;

public class Promotion implements Serializable {
    private static final long serialVersionUID = -4130713915117241330L;
    private Long id;

    private Long appid;

    private String adpicpath;

    private Long adpv;

    private Integer carouselposition;

    private Date starttime;

    private Date endtime;

    private Long createdby;

    private Date creationdate;

    private Long modifyby;

    private Date modifydate;

    public Promotion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppid() {
        return appid;
    }

    public void setAppid(Long appid) {
        this.appid = appid;
    }

    public String getAdpicpath() {
        return adpicpath;
    }

    public void setAdpicpath(String adpicpath) {
        this.adpicpath = adpicpath == null ? null : adpicpath.trim();
    }

    public Long getAdpv() {
        return adpv;
    }

    public void setAdpv(Long adpv) {
        this.adpv = adpv;
    }

    public Integer getCarouselposition() {
        return carouselposition;
    }

    public void setCarouselposition(Integer carouselposition) {
        this.carouselposition = carouselposition;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Long getModifyby() {
        return modifyby;
    }

    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}