package com.example.controller.request;

import lombok.Data;

@Data
public class BaseRequest {
    private Integer pagenum = 1;
    private Integer pagesize = 10;

    public Integer getPagenum() {
        return pagenum;
    }

    public void setPagenum(Integer pagenum) {
        this.pagenum = pagenum;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }
}
