<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>View Dashboard</title>

    <!-- Include jQuery library -->
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <style>
        body {
            font-family: 'Arial', sans-serif;
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
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            border: 1px solid #ddd;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 10px;
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
            color: #007bff;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>


    <script>
        $(document).ready(function() {
            $.ajax({
                type: "GET",
                url: "api/list",
                dataType: "json",
                success: function(data) {
                    displayTrainingData(data);
                },
                error: function(xhr, status, error) {
                    console.error("API request error: " + error);
                }
            });
        });

        function displayTrainingData(data) {
            var trainee = data;
            var table = document.getElementById("trainee");

            for (var i = 0; i < trainee.length; i++) {
                var trainee = trainee[i];
                var row = table.insertRow(i + 1);

                row.insertCell(0).innerHTML = trainee.tmode;
                row.insertCell(1).innerHTML = trainee.tname;
                row.insertCell(2).innerHTML = trainee.tdescription;
                row.insertCell(3).innerHTML = trainee.training_reg_start_dt;
                row.insertCell(4).innerHTML = trainee.training_reg_end_dt;
                row.insertCell(5).innerHTML = "<a href='applyTrainee'>Apply Here</a>";
                
            }
        }
    </script>
</head>

<body>
    <h2>Trainee Notification</h2>

    <table border="1" id="trainee">
        <tr>
            <th>Training Name</th>
            <th>Training Mode</th>
            <th>Description</th>
            <th>Application Start Date</th>
            <th>Application End Date</th>
            <th>Co-Ordinator Details</th>
            <th>Action</th>
            <!-- Add more table headers here -->
        </tr>
    </table>
</body>
</html>
