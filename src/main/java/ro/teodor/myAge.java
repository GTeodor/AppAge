package ro.teodor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@WebServlet("/myAge")
public class myAge extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer year = Integer.parseInt(request.getParameter("year"));
        Integer month = Integer.parseInt(request.getParameter("month"));
        Integer day = Integer.parseInt(request.getParameter("day"));

        LocalDate now = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, day);
        long days = ChronoUnit.DAYS.between(birthDate, now);
        request.setAttribute("days",days);
        request.getRequestDispatcher("response.jsp").forward(request,response);

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
