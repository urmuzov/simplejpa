package com.spaceprogram.simplejpa;

import javax.persistence.Entity;

/**
 * User: treeder
 * Date: Jun 29, 2008
 * Time: 5:33:55 PM
 */
@Entity
public class PerformanceTestObject extends MySuperClass {
    private String s1;
    private String s2;

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }
}
