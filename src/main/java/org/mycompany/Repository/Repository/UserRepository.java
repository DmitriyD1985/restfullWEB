package org.mycompany.Repository.Repository;

import javax.servlet.http.*;
import java.io.IOException;

public class UserRepository extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {
        httpServletResponse.getWriter().print("Hello from servlet");
    }
}