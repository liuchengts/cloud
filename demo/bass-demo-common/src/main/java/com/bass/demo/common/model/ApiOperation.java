package com.bass.demo.common.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by apple on 2017/7/22.
 */
@Entity
@Table(name = "api_operation", schema = "test", catalog = "")
public class ApiOperation implements Serializable {
    private Long id;
    private Timestamp time;
    private String api;
    private String content;
    private String result;
    private String okNo;

    @Basic
    @Id
    @Column(name = "id")
    @GenericGenerator(name = "generator", strategy = "assigned")
    @GeneratedValue(generator = "generator")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "api")
    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "result")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Basic
    @Column(name = "ok_no")
    public String getOkNo() {
        return okNo;
    }

    public void setOkNo(String okNo) {
        this.okNo = okNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiOperation that = (ApiOperation) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (api != null ? !api.equals(that.api) : that.api != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;
        if (okNo != null ? !okNo.equals(that.okNo) : that.okNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = id != null ? id.hashCode() : 0;
        result1 = 31 * result1 + (time != null ? time.hashCode() : 0);
        result1 = 31 * result1 + (api != null ? api.hashCode() : 0);
        result1 = 31 * result1 + (content != null ? content.hashCode() : 0);
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        result1 = 31 * result1 + (okNo != null ? okNo.hashCode() : 0);
        return result1;
    }
}
