/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-08-08 01:19:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import modelo.Alumno;
import java.util.List;
import java.util.List;

public final class UpdateAlumno_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("modelo.Alumno");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Alumno</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/estile.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/6a4751c08d.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"alumno.js\"></script>\n");
      out.write("        <nav>\n");
      out.write("                <input type=\"checkbox\" id=\"check\">\n");
      out.write("                <label for=\"check\" class=\"checkbtn\">\n");
      out.write("                <i class=\"fas fa-bars\"></i>\n");
      out.write("                \n");
      out.write("                </label>\n");
      out.write("                <a href=\"\" class=\"enlace\">\n");
      out.write("                    <img src=\"imagen/demo.png\" alt=\"\" class=\"logo\">\n");
      out.write("                </a>\n");
      out.write("                <ul>\n");
      out.write("              \n");
      out.write("                <li><a href=\"ServDestroy\">inicio</a></li>\n");
      out.write("                <li><a href=\"noticias.jsp\">noticias</a></li>\n");
      out.write("                </ul>\n");
      out.write("                    </nav>\n");
      out.write("           ");

           HttpSession sesion=request.getSession();
           
        String rel=(String)sesion.getAttribute("session_logSe");
         if(sesion.getAttribute("session_logSe")==null){
             response.sendRedirect("login.jsp");
             }
             
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("         \n");
      out.write("    <div class=\"lateral\">\n");
      out.write("      \n");
      out.write("    <div class=\"option\">\n");
      out.write("        <div class=\"logotipo\">\n");
      out.write("            <a href=\"acceso_SE.jsp\">\n");
      out.write("            <i class=\"fa-solid fa-house\"></i>\n");
      out.write("                <h4>pricipal</h4>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"logotipo\">\n");
      out.write("            <a href=\"incidencia.jsp\">\n");
      out.write("                <i class=\"fa-sharp fa-regular fa-calendar-days\"></i>\n");
      out.write("                <h4>  incidencias </h4>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"logotipo\">\n");
      out.write("            <a href=\"alumnos.jsp\">\n");
      out.write("                <i class=\"fa-sharp fa-regular fa-calendar-days\"></i>\n");
      out.write("                <h4> alumnos</h4>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"logotipo\">\n");
      out.write("            <a href=\"profesor.jsp\">\n");
      out.write("                <i class=\"fa-sharp fa-regular fa-calendar-days\"></i>\n");
      out.write("                <h4>profesores</h4>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"logotipo\">\n");
      out.write("            <a href=\"colegiaturas.jsp\">\n");
      out.write("                <i class=\"fa-sharp fa-regular fa-calendar-days\"></i>\n");
      out.write("                <h4> Colegiaturas</h4>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"logotipo\">\n");
      out.write("            <a href=\"inscripcion.jsp\">\n");
      out.write("                <i class=\"fa-sharp fa-regular fa-calendar-days\"></i>\n");
      out.write("                <h4> inscripciones</h4>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <div class=\"body\">\n");
      out.write("            <div class=\"left\">\n");
      out.write("            \n");
      out.write("            <div class=\"form_grupo\">\n");
      out.write("\n");
      out.write("       \n");
      out.write("          \n");
      out.write("             \n");
      out.write("                <form action=\"ServAlumno\"  method=\"POST\">\n");
      out.write("                <div class=\"form_box\">\n");
      out.write("                    \n");
      out.write("                    ");

                    List<Alumno>alumno=(List<Alumno>)request.getAttribute("id_alumno");
                    Iterator<Alumno>itera=alumno.iterator();
                    Alumno al=null;
                    while (itera.hasNext()) {
                            al=itera.next();
                        
                    
      out.write("\n");
      out.write("                <label for=\"matricula\">Matricula</label>\n");
      out.write("                <input type=\"text\" name=\"matricula\"  value=\"");
      out.print(al.getMatricula());
      out.write("\" >\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form_box\">\n");
      out.write("                <label for=\"nombre\">Nombre</label>\n");
      out.write("                <input type=\"text\" name=\"nombre\" value=\"");
      out.print(al.getNombre());
      out.write("\" >\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form_box\">\n");
      out.write("             <label for=\"apellido\">ApellidoP</label>\n");
      out.write("                <input type=\"text\" name=\"apellidoP\" value=\"");
      out.print(al.getApellido());
      out.write("\">\n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("             <div class=\"form_box\">\n");
      out.write("             <label for=\"apellidoM\">ApellidoM</label>\n");
      out.write("                <input type=\"text\" name=\"apellidoM\" value=\"");
      out.print(al.getApellido_materno());
      out.write("\">\n");
      out.write("             </div>\n");
      out.write("              <div class=\"form_box\">\n");
      out.write("             <label for=\"email\">Email</label>\n");
      out.write("                <input type=\"text\" name=\"email\" value=\"");
      out.print(al.getEmail());
      out.write("\">\n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("              <div class=\"form_box\">\n");
      out.write("              <label for=\"turno\">turno</label>\n");
      out.write("                <select name=\"turno\" id=\"turno\">\n");
      out.write("                    <option value=\"");
      out.print(al.getTurno());
      out.write('"');
      out.write('>');
      out.print(al.getTurno());
      out.write("</option>\n");
      out.write("                    <option value=\"Matutino\">Matutino</option>\n");
      out.write("                    <option value=\"Vespertino\">Vespertino</option>\n");
      out.write("                    <option value=\"Vespertino\">Nocturno</option>\n");
      out.write("                    </select>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("             <div class=\"form_box\">\n");
      out.write("             <label for=\"tipo_usuario\">tipo de usuario</label>\n");
      out.write("                <select name=\"tipo_usuario\" id=\"tipo_usuario\">\n");
      out.write("                    <option value=\"");
      out.print(al.getTipo_usuario());
      out.write('"');
      out.write('>');
      out.print(al.getTipo_usuario());
      out.write("</option>\n");
      out.write("                    <option value=\"Alumno\">Alumno</option>\n");
      out.write("                    <option value=\"padre/tutor\">padre o tutor</option>\n");
      out.write("                 \n");
      out.write("                    </select>\n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("                <div class=\"form_box\">\n");
      out.write("                <label for=\"tipo_usuario\">nivel educativo</label>\n");
      out.write("                <select name=\"nivel_educativo\" id=\"nivel_educativo\">\n");
      out.write("                    <option value=\"");
      out.print(al.getNivel_educativo());
      out.write('"');
      out.write('>');
      out.print(al.getNivel_educativo());
      out.write("</option>\n");
      out.write("                    <option value=\"preescolar\">preescolar</option>\n");
      out.write("                    <option value=\"primaria\">primaria</option>\n");
      out.write("                    <option value=\"secundaria\">secundaria</option>\n");
      out.write("                    <option value=\"preparatoria\">preparatoria</option>\n");
      out.write("                    </select>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("               <div class=\"form_box\">\n");
      out.write("               <label class=\"form_label\" for=\"grupo\">grupo</label> \n");
      out.write("                <select name=\"grupo\" id=\"grupo\">\n");
      out.write("                    <option value=\"");
      out.print(al.getGrupo());
      out.write('"');
      out.write('>');
      out.print(al.getGrupo());
      out.write("</option>\n");
      out.write("                    <option value=\"1-A\">1-A</option>\n");
      out.write("                    <option value=\"1-B\">1-B</option>\n");
      out.write("                    <option value=\"1-C\">1-C</option>\n");
      out.write("                    <option value=\"2-A\">2-A</option>\n");
      out.write("                    <option value=\"2-B\">2-B</option>\n");
      out.write("                    <option value=\"2-C\">2-C</option>\n");
      out.write("                    <option value=\"3-A\">3-A</option>\n");
      out.write("                    <option value=\"3-B\">3-B</option>\n");
      out.write("                    <option value=\"3-C\">3-C</option>\n");
      out.write("                    <option value=\"4-A\">4-A</option>\n");
      out.write("                    <option value=\"4-B\">4-B</option>\n");
      out.write("                    <option value=\"4-C\">4-C</option>\n");
      out.write("                    <option value=\"5-A\">5-A</option>\n");
      out.write("                    <option value=\"5-B\">5-B</option>\n");
      out.write("                    <option value=\"5-C\">5-C</option>\n");
      out.write("                    <option value=\"6-A\">6-A</option>\n");
      out.write("                    <option value=\"6-B\">6-B</option>\n");
      out.write("                    <option value=\"6-C\">6-C</option>\n");
      out.write("                 </select>\n");
      out.write("               </div>\n");
      out.write("                  \n");
      out.write("               \n");
      out.write("           <div class=\"form_boz\">\n");
      out.write("           <button class=\"b2\"  name=\"btn_edicion\" id=\"grupo\">EDITAR</button>\n");
      out.write("        \n");
      out.write("           </div>\n");
      out.write("                 </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                 <a href=\"alumnos.jsp\">regresar</a>\n");
      out.write("                </div>\n");
      out.write("                       \n");
      out.write("       \n");
      out.write("            \n");
      out.write("      \n");
      out.write("           </div>\n");
      out.write("       \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
