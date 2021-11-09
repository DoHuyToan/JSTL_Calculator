import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double firstNum = Double.parseDouble(request.getParameter("firstNum"));
        double secondNum = Double.parseDouble(request.getParameter("secondNum"));
        String operator = request.getParameter("operator");

        Calculator calculator = new Calculator();
        double result = calculator.Calculator(firstNum, secondNum, operator);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result: " + result);
        writer.println("<html>");
    }
}
