/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.88
 * Generated at: 2023-08-11 08:42:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/member/../header.jsp", Long.valueOf(1691742826778L));
    _jspx_dependants.put("jar:file:/C:/Users/hlkm1/Desktop/민하/kg%20itbank%20학원/팀프로젝트/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/dbjava/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1687826413892L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>자바방</title>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("	margin: 0px;\r\n");
      out.write("}\r\n");
      out.write("a{\r\n");
      out.write("	all: unset;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("p{\r\n");
      out.write("    text-align:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* header style */\r\n");
      out.write("header {\r\n");
      out.write("    height: 100px;\r\n");
      out.write("\r\n");
      out.write("	background-color: #79DDD1;\r\n");
      out.write("    font-family: \"굴림\";\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    \r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("}\r\n");
      out.write("header > div {\r\n");
      out.write("	width: 1000px;\r\n");
      out.write("	\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write(".btn3 > button{\r\n");
      out.write("    all: unset;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    \r\n");
      out.write("    border: none;\r\n");
      out.write("    width: 500px;\r\n");
      out.write("    padding: 0; \r\n");
      out.write("    \r\n");
      out.write("    text-align: right;\r\n");
      out.write("    font: inherit;\r\n");
      out.write("    background: none;\r\n");
      out.write("}\r\n");
      out.write(".search {\r\n");
      out.write("    width: 40px;\r\n");
      out.write("}\r\n");
      out.write("ul {\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    \r\n");
      out.write("	padding: 0px;\r\n");
      out.write("    \r\n");
      out.write("    display: flex;\r\n");
      out.write("}\r\n");
      out.write("ul > li{    \r\n");
      out.write("	margin-left: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* home style */\r\n");
      out.write(".main {\r\n");
      out.write("	width: 1000px;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("}\r\n");
      out.write(".btn1 >  button{\r\n");
      out.write("    margin-top:50px;\r\n");
      out.write("    margin-right:100px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    background: none;\r\n");
      out.write("    padding: 0; \r\n");
      out.write("    font: inherit;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    outline: inherit;\r\n");
      out.write("}\r\n");
      out.write(".btn2 > button{\r\n");
      out.write("    margin-top:50px;\r\n");
      out.write("    margin-left:100px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    background: none;\r\n");
      out.write("    padding: 0; \r\n");
      out.write("    font: inherit;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    outline: inherit;\r\n");
      out.write("}\r\n");
      out.write(".category{\r\n");
      out.write("    margin-left:200px;\r\n");
      out.write("    margin-top:30px;\r\n");
      out.write("}\r\n");
      out.write(".arrow{\r\n");
      out.write("    width:30px;\r\n");
      out.write("}\r\n");
      out.write(".categories{\r\n");
      out.write("    display:flex;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write(".category{\r\n");
      out.write("   margin-left:20px;\r\n");
      out.write("   margin-top:30px;\r\n");
      out.write("   /* opacity: 0.7; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".categoryImg {\r\n");
      out.write("	width: 30px;\r\n");
      out.write("}\r\n");
      out.write(".type{\r\n");
      out.write("	margin-right:20px;\r\n");
      out.write("	display: flex;\r\n");
      out.write("    flex-flow: wrap;\r\n");
      out.write("    width : 1000px;\r\n");
      out.write("    overflow :hidden;\r\n");
      out.write("}\r\n");
      out.write(".room {\r\n");
      out.write("	\r\n");
      out.write("	width : 240px;\r\n");
      out.write("    height : 240px;\r\n");
      out.write("    margin : 3px;\r\n");
      out.write("    border-radius:10px;\r\n");
      out.write("    position : relative;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("/*login css*/\r\n");
      out.write(".login{\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".login fieldset{\r\n");
      out.write("    width:600px;\r\n");
      out.write("    margin: 30px auto;\r\n");
      out.write("}\r\n");
      out.write("legend{\r\n");
      out.write("    font-size: 30px;\r\n");
      out.write("}\r\n");
      out.write(".login input {\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    width:500px;\r\n");
      out.write("    height:50px;\r\n");
      out.write("}\r\n");
      out.write(".login legend {\r\n");
      out.write("    margin-bottom: 40px;\r\n");
      out.write("}\r\n");
      out.write(".kakao{\r\n");
      out.write("    width:500px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    line-height: 50px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    padding: 0; \r\n");
      out.write("    font: inherit;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    outline: inherit;\r\n");
      out.write("}\r\n");
      out.write(".naver{\r\n");
      out.write("    width:500px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    line-height: 50px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    padding: 0; \r\n");
      out.write("    font: inherit;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    outline: inherit;\r\n");
      out.write("    margin-top:10px;\r\n");
      out.write("}\r\n");
      out.write(".email{\r\n");
      out.write("	width:500px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    line-height: 50px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    padding: 0; \r\n");
      out.write("    font: inherit;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    outline: inherit;\r\n");
      out.write("    margin-top:10px;\r\n");
      out.write("}\r\n");
      out.write(".login input[type=\"submit\"]{\r\n");
      out.write("    background-color: #C2D6F0;\r\n");
      out.write("    border : none;\r\n");
      out.write("    width:500px;\r\n");
      out.write("    height:50px;\r\n");
      out.write("}\r\n");
      out.write(".login p{\r\n");
      out.write("    word-spacing: 20px;\r\n");
      out.write("}\r\n");
      out.write("/*join css*/\r\n");
      out.write("fieldset{\r\n");
      out.write("    width:600px;\r\n");
      out.write("    margin:0 auto;\r\n");
      out.write("    margin-top:100px;\r\n");
      out.write("}\r\n");
      out.write("legend{\r\n");
      out.write("    font-size:30px;\r\n");
      out.write("}\r\n");
      out.write(".join{\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".join input[type=\"submit\"] {\r\n");
      out.write("    background-color: #C2D6F0;\r\n");
      out.write("    border : none;\r\n");
      out.write("    width:500px;\r\n");
      out.write("    height:50px;\r\n");
      out.write("}\r\n");
      out.write(".join input {\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    width:500px;\r\n");
      out.write("    height:50px;\r\n");
      out.write("}\r\n");
      out.write(".join select {\r\n");
      out.write("    width: 500px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("/*찜하기 css*/\r\n");
      out.write(".fav{\r\n");
      out.write("	position:relative;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write(".fav-btn{\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 10px; /* 버튼을 이미지 위로 위치시키려면 적절한 값으로 조정 */\r\n");
      out.write("    right: 10px; /* 버튼을 이미지 오른쪽에 위치시키려면 적절한 값으로 조정 */\r\n");
      out.write("    border: none;\r\n");
      out.write("    background: none;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 5px 10px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write(".fav-btn > img{\r\n");
      out.write("	width:20px;\r\n");
      out.write("    height:20px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("        <div>\r\n");
      out.write("        	<h1><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">자바방</a></h1>\r\n");
      out.write("	        <div class=\"btn3\">\r\n");
      out.write("	        	<button><img src=\"http://192.168.64.200/search.png\" class=\"search\"></button>\r\n");
      out.write("	        </div>\r\n");
      out.write("	        <ul>\r\n");
      out.write("	            <li>숙소를 올려방~</li>\r\n");
      out.write("	            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/login\">로그인</a></li>\r\n");
      out.write("	        </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<div class=\"login\">\r\n");
      out.write("      <fieldset>\r\n");
      out.write("          <legend>Welcome JavaBang</legend>\r\n");
      out.write("\r\n");
      out.write("          <p><input type=\"text\" placeholder=\"아이디\"></p>\r\n");
      out.write("          <p><input type=\"text\" placeholder=\"비밀번호\"></p>\r\n");
      out.write("          <p><input type=\"submit\" value=\"로그인\"></p>\r\n");
      out.write("          \r\n");
      out.write("          <button class=\"kakao\"> <img src=\"\">카카오 아이디로 로그인하기</button>\r\n");
      out.write("          <button class=\"naver\"> 네이버 아이디로 로그인하기</button>\r\n");
      out.write("          <button class=\"email\"> 이메일로 로그인하기</button>\r\n");
      out.write("          <p><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/join\">회원가입 </a> | 비밀번호재설정</p> \r\n");
      out.write("          \r\n");
      out.write("      </fieldset>\r\n");
      out.write("  </div>    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/member/../header.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("cpath");
      // /WEB-INF/views/member/../header.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/member/../header.jsp(3,0) '${pageContext.request.contextPath }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
