package uk.co.allianz.training;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "EmployeeController", urlPatterns = {"/employee"})
public class EmployeeController extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request, HttpServletResponse response) throws IOException {

        EmployeeService employeeService = new EmployeeServiceImpl();

        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print("{\n" +
                "    \"id\": 123,\n" +
                "    \"name\": " + employeeService.getName() + ",\n" +
                "    \"age\": 23\n" +
                "}");
        out.flush();

    }
}
