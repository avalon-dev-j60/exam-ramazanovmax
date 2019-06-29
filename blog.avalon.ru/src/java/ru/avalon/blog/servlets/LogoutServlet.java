/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.blog.servlets;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ru.avalon.blog.helpers.ServletHelper;
import ru.avalon.blog.services.AuthService;

/**
 *
 * @author makram
 */
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{
    @Inject AuthService authService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        authService.signOut();
        ServletHelper.redirectToReferer(request, response);
    }
    
    
            
    
}
