<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Training Information</title>
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
            background-color: #fff;
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

        a {
            text-decoration: none;
            color: #007bff;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h2>Training Information</h2>
    
    <table>
        <tr>
            <th>Training Name</th>
            <th>Training Mode</th>
            <th>Training Description</th>
            <th>App. Start To End Date</th>
            <th>Venue Details</th>
            <th>Co-Ordinator Details</th>
            <th>Action</th>
        </tr>
        <tr>
            <td>Sample Training</td>
            <td>In-Person</td>
            <td>This is a sample training description.</td>
            <td>2023-11-01 to 2023-11-30</td>
            <td>Sample Venue Details</td>
            <td>satya,satya@example.com, 123-456-7890</td>
            <td><a href="applyTrainee">Apply Here</a></td>
        </tr>
    </table>
</body>
</html>