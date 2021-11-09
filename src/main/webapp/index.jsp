<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/9/2021
  Time: 2:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form action="/Servlet" method="post">
    <fieldset>
      <legend>Calculator</legend>
      <table>
      <tr>
        <td>First operand</td>
        <td><input type="text" name="firstNum" placeholder="Điền số thứ 1"></td>
      </tr>
      <td>Operator</td>
      <td>
        <select name="operator">
          <option value="+"> Cộng </option>
          <option value="-"> Trừ </option>
          <option value="*"> Nhân </option>
          <option value="/"> Chia </option>
        </select>
      </td>
      <tr>
        <td>Second operand</td>
        <td><input type="text" name="secondNum" placeholder="Điền số thứ 2"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" id="submit" value="Calculator"></td>
      </tr>
    </table>
    </fieldset>
  </form>



  </body>
</html>
