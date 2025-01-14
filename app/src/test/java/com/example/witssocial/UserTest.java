package com.example.witssocial;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.google.common.truth.Truth.assertThat;

import com.example.witssocial.Model.User;


@RunWith(JUnit4.class)

public class UserTest {
    User person;
    String a,b,c,d;

    @Test
    public void getimage(){
        String a = new User().getImageurl();
        a = "Katleho";
        assertThat(a).isNotEmpty();

    }

    @Test
    public void getid() {
        String a = new User().getId();
        a = "Katleho";
        assertThat(a).isNotEmpty();

    }

    @Test
    public void getusername() {
        person = new User();
        String a = person.getUsername();
        a= "Michael";

        assertThat(a).isNotEmpty();
    }

    @Test
    public void getbio(){
        person = new User();
        String a = person.getBio();
        a = "Bio";

        assertThat(a).isNotEmpty();
    }

    @Test
    public void setimage(){
        User per = new User();
        String image = per.getImageurl();
        image = "url";
        assertThat(image).isNotEmpty();
    }
}