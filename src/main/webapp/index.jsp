<%--
  Created by IntelliJ IDEA.
  User: PShynn
  Date: 10/29/2020
  Time: 4:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Exchange</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  </head>
  <body>
  <form method="get" action="/convert">
    <div class="row">
      <div class="col">
        <input type="text" class="form-control" name="rate" placeholder="Input here...">
      </div>
      <div class="col">
        <input class="form-control" type="text" name="result" placeholder="Result" value="0" readonly>
      </div>
      <label>
        <select class="form-control" name="type">
          <option value="1" selected>USD => VND</option>
          <option value="2">VND => USD</option>
        </select>
      </label>
    </div>
    <input class="btn btn-primary" type="submit" value="Convert">
  </form>
  </body>
</html>
