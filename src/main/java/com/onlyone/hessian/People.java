package com.onlyone.hessian;

import java.io.Serializable;

public class People implements Serializable {

    private static final long serialVersionUID = 6026430597686188349L;

    private String            name;
    private String            pwd;
    private String            desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
