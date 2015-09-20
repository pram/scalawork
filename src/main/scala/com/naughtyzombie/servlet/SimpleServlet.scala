package com.naughtyzombie.servlet

import javax.servlet.http.{HttpServletResponse, HttpServletRequest, HttpServlet}
import scala.xml.NodeSeq
/**
 * Created by pram on 20/09/15.
 */
class SimpleServlet extends HttpServlet {
  override def doGet(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    resp.setContentType("text/html")
    resp.setCharacterEncoding("UTF-8")

    val responseBody: NodeSeq = <html><body><h1>Hello! w00t!</h1></body></html>

    resp.getWriter.write(responseBody.toString)
  }
}
