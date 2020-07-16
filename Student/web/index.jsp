<%--
  Created by IntelliJ IDEA.
  User: AHLAM
  Date: 16-Jul-20
  Time: 1:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>StudentForm</title>
  </head>
  <body>
  <form method="get" action="StudentServlet">
    <label>Name</label>
    <input type="text" name="name" >
    <br/><br/>
    <label>RegNo</label>
    <input type="text" name="reg">
    <br/><br/>
      <label>Grade</label>
      <input type="text" name="grade">
      <br/><br/>
      <label>Phone#</label>
      <input type="text" name="pno" >
      <br/><br/>
        <label>Email</label>
        <input type="text" name="email">
        <br/><br/>
    <input type="radio" name="Male">Male
    <input type="radio" name="Female">Female
    <br/> <br/>
    <label>Course</label>
    <select>
      <option>WEB(website)</option>
      <option>MOB(Mobile)</option>
      <option>NT(Network)</option>
      <option>RS(Research)</option>
      <option>QB(QuickBook)</option>
      <option>VP(VisualPrograming)</option>
    </select>

  </body>
</html>
