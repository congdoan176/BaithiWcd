package com.baithi.entity.controller;

import com.baithi.entity.Phone;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class ListPhoneController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("phones", ofy().load().type(Phone.class).list());
        req.getRequestDispatcher("/phone/listPhone.jsp").forward(req,resp);
    }
}
