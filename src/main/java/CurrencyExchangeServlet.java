import javafx.print.Printer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CurrencyExchangeServlet", urlPatterns = "/convert")
public class CurrencyExchangeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float input = Float.parseFloat(request.getParameter("rate"));
        int type = Integer.parseInt(request.getParameter("type"));
        float result;
        if (type == 1) {
            result = input * 23000;
        } else {
            result = (float) (input * 1.0 / 23000);
        }

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>\n" +
                "  <head>\n" +
                "    <title>Currency Exchange</title>\n" +
                "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\n" +
                "          integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n" +
                "  </head>\n" +
                "  <body>\n" +
                "  <form method=\"get\" action=\"/convert\">\n" +
                "    <div class=\"row\">\n" +
                "      <div class=\"col\">\n" +
                "        <input type=\"text\" class=\"form-control\" name=\"rate\" placeholder=\"Input here...\">\n" +
                "      </div>\n" +
                "      <div class=\"col\">\n" +
                "        <input class=\"form-control\" type=\"text\" name=\"result\" placeholder=\"Result\" value=\""+result+"\" readonly>\n" +
                "      </div>\n" +
                "      <label>\n" +
                "        <select class=\"form-control\" name=\"type\">\n" +
                "          <option value=\"1\" selected>USD => VND</option>\n" +
                "          <option value=\"2\">VND => USD</option>\n" +
                "        </select>\n" +
                "      </label>\n" +
                "    </div>\n" +
                "    <input class=\"btn btn-primary\" type=\"submit\" value=\"Convert\">\n" +
                "  </form>\n" +
                "  </body>\n" +
                "</html>");
    }
}
