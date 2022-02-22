package ua.kiev.prog.homework2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "anketaServlet", value = "/answers")
public class Anketa extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(true);
        Anketaotv qs = People.getStatistic(session.getId());
        for(String name : Anketaotv.Anketa_NAMES) {
            qs.incrementAnswerNum(name, request.getParameter(name));
        }
        response.sendRedirect("result.jsp");
    }

    public void destroy() {
    }
}