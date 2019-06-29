package ru.avalon.blog.helpers;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public final class ServletHelper {
    private ServletHelper(){};
    
    public static void redirect(HttpServletRequest request, 
                                HttpServletResponse response,
                                String location)
                    throws SecurityException, IOException{
        response.setHeader("Location", location);
        response.setStatus(HttpServletResponse.SC_FOUND);
    } 
    
    public static void redirectToReferer(HttpServletRequest request, 
                                HttpServletResponse response)
                    throws SecurityException, IOException{
        String referer = request.getHeader("Referer");
        if(referer == null || referer.equals(request.getRequestURL().toString())){
            referer = request.getContextPath();
        }
        redirect(request, response, referer);
    } 
}
