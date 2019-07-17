import java.io.IOException;
import java.util.Date;

public class HelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            try{
                response.getWriter().println("helloaswdsaasd servlet");
                response.getWriter().println(new Date().toLocaleString());
            }catch (Exception e){
                e.printStackTrace();
            }
    }
}
