package java_04_심화;

public class HttpServletExample {
    public static void method(HttpServlet servlet) {
        servlet.service();
    }

    public static void main(String[] args) {
        method(new LoginServlet());
        method(new FileDownloadServlet());
    }
}
