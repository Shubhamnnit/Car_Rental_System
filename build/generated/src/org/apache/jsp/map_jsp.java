package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class map_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <title>My CAR LOCATION</title>\n");
      out.write("    <style>\n");
      out.write("      /* Always set the map height explicitly to define the size of the div\n");
      out.write("       * element that contains the map. */\n");
      out.write("      #map {\n");
      out.write("        height: 100%;\n");
      out.write("      }\n");
      out.write("      /* Optional: Makes the sample page fill the window. */\n");
      out.write("      html, body {\n");
      out.write("        height: 100%;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write(" <body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\"> <img src=\"pic/rent.png\" alt=\"logo\" width=\"150\" height=\"80\"></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("        <li><a href=\"location.html\">REFESH</a></li>\n");
      out.write("        <li><a href=\"#tour\">BACK</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write(" </nav>\n");
      out.write("\n");
      out.write("    <div id=\"map\"></div>\n");
      out.write("     \n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("      function initMap() {\n");
      out.write("\n");
      out.write("        var map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("          zoom: 3,\n");
      out.write("          center: {lat: 25.4358, lng: 81.8463}\n");
      out.write("        });\n");
      out.write("        // Create an array of alphabetical characters used to label the markers.\n");
      out.write("        var labels = 'PDC';\n");
      out.write("\n");
      out.write("        // Add some markers to the map.\n");
      out.write("        // Note: The code uses the JavaScript Array.prototype.map() method to\n");
      out.write("        // create an array of markers based on a given \"locations\" array.\n");
      out.write("        // The map() method here has nothing to do with the Google Maps API.\n");
      out.write("        var markers = locations.map(function(location, i) {\n");
      out.write("          return new google.maps.Marker({\n");
      out.write("            position: location,\n");
      out.write("            label: labels[i % labels.length]\n");
      out.write("            \n");
      out.write("          });\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // Add a marker clusterer to manage the markers.\n");
      out.write("        var markerCluster = new MarkerClusterer(map, markers,\n");
      out.write("            {imagePath: 'https://developers.google.com/maps/documentation/javascript/examples/markerclusterer/m'});\n");
      out.write("      }\n");
      out.write("      var locations = [\n");
      out.write("        {lat: 25.4452, lng: 81.8249},\n");
      out.write("        {lat: 25.437331584, lng:81.733663732},\n");
      out.write("        {lat:25.4920,  lng:81.8639},\n");
      out.write("      ]\n");
      out.write("    </script>\n");
      out.write("    <script src=\"https://developers.google.com/maps/documentation/javascript/examples/markerclusterer/markerclusterer.js\">\n");
      out.write("    </script>\n");
      out.write("    <script async defer\n");
      out.write("    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCLWjR1odr3QDeUB2JUX0z7nV1PvDXx_Bw&callback=initMap\">\n");
      out.write("    </script>\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"text-center\">\n");
      out.write("  <a class=\"up-arrow\" href=\"#myPage\" data-toggle=\"tooltip\" title=\"TO TOP\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-up\"></span>\n");
      out.write("  </a>\n");
      out.write("  <p style=\"font-size:20px;\">Note:P-Pickup Location   D-Dropoff Location C- current Postion of car</br></p>\n");
      out.write("  <p><a href=\"#myPage\"><img src=\"pic/fb.png\" alt=\"fb\" width=\"25\" height=\"25\"></a><a href=\"#myPage\"><img src=\"pic/tt.png\" alt=\"twitter\" width=\"25\" height=\"25\"></a><br>Website made by [Aaditya Supriyo]</p> \n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
