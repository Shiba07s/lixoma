<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
 <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            color: #007bff;
            margin: 20px 0;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #007bff;
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>Student Registration Dashboard</h2>
    
    <table>
        <tr>
            <th>Training Ref Id</th>
            <th>Venue</th>
            <th>Training Type</th>
            <th>Training Mode</th>
            <th>Training Month</th>
            <th>Training Year</th>
            <th>Training Name</th>
            <th>Module</th>
            <th>Description</th>
            <th>Map Location</th>
            <th>Grade</th>
            <th>Agency</th>
            <th>Coordinator Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>State</th>
            <th>District</th>
            <th>Mandal</th>
            <th>Application Start Date</th>
            <th>Application End Date</th>
            <th>Training End Date</th>
        </tr>
        <c:forEach var="training" items="${trainings}">
              <tr>
                  <td>${training.ref_planner_id }</td>
                  <td>${training.tmonth }</td>
                  <td>${training.tyear }</td>
                  <td>${training.tname }</td>
                  <td>${training.tmode }</td>
                  <td>${training.tmodule }</td>
                  <td>${training.tgrade }</td>
                  <td>${training.tagency }</td>
                  <td>${training.tdescription }</td>
                  <td>${training.actual_start_dt }</td>
                  <td>${training.actual_end_dt }</td>
                  <td>${training.training_reg_start_dt }</td>
                  <td>${training.training_reg_end_dt }</td>
              </tr>
           </c:forEach>
    </table>
</body>
</html>
