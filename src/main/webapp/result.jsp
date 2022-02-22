<%@ page import="ua.kiev.prog.homework2.People" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Answers</title>
</head>
<body>
<table>
  <tr>
    <td colspan="4"> Your gender: </td>
  </tr>
  <tr>
    <td> Woman </td>
    <td> Man </td>
  </tr>
  <tr>
    <td> <%= "" + People.getStatistic(session.getId()).getAnwersNum("gender", "Woman") %> </td>
    <td> <%= "" + People.getStatistic(session.getId()).getAnwersNum("gender", "Man") %> </td>
  </tr>
</table>
</br>
<table>
  <tr>
    <td colspan="4"> Your age: </td>
  </tr>
  <tr>
    <td> Less than 30 </td>
    <td> More than 30 </td>

  </tr>
  <tr>
    <td> <%= "" + People.getStatistic(session.getId()).getAnwersNum("age", "Less than 30") %> </td>
    <td> <%= "" + People.getStatistic(session.getId()).getAnwersNum("age", "More than 30") %> </td>

  </tr>
</table>
</br>
<table>
  <tr>
    <td colspan="4"> What you prefer: </td>
  </tr>
  <tr>
    <td> Books </td>
    <td> Movies </td>

  </tr>
  <tr>
    <td> <%= "" + People.getStatistic(session.getId()).getAnwersNum("prefer", "Books") %> </td>
    <td> <%= "" + People.getStatistic(session.getId()).getAnwersNum("prefer", "Movies") %> </td>

  </tr>
</table>
</br>
<a href="/">Try one more time!</a>
</body>
</html>
