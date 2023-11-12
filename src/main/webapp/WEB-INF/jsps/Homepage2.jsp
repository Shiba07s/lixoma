<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>menu</title>
<head>
    
    <style>
        ul.horizontal-nav {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
        }
 
        ul.horizontal-nav li {
            float: left;
        }
 
        ul.horizontal-nav li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }
 
        ul.horizontal-nav li a:hover {
            background-color: #444;
        }
 
        ul.vertical-nav {
            list-style-type: none;
            margin: 0;
            padding: 0;
            width: 200px;
            background-color: #f2f2f2;
        }
 
        ul.vertical-nav li {
            padding: 8px;
        }
 
        ul.vertical-nav li a {
            display: block;
            color: #333;
            text-decoration: none;
        }
 
        ul.vertical-nav li a:hover {
            background-color: #ddd;
        }
    </style>
</head>
<body>
<div class="d-flex" id="wrapper">
        <!-- Sidebar-->
        <div class="border-end bg-white" id="sidebar-wrapper">
            <div class="sidebar-heading border-bottom bg-light">
                <img src="./assets/logo.png" width="30" height="30">
            </div>
            <div class="list-group list-group-flush">
                <a class="list-group-item list-group-item-action list-group-item-light p-3" href="#!"
                    onclick="showTab('tab1')">Academic Calender</a>
                
                <!-- Master Setup  menu -->
            </div>
        </div>
   <h2 align="center">Teacher Training Support System</h2>
    <h2 align="center">Govt. OF AndhraPradesh</h2>
    
    
    <ul class="horizontal-nav">
        <li><a href="home.jsp">Home</a></li>
        <li><a href="about.jsp">About</a></li>
        <li><a href="services.jsp">Services</a></li>
        <li><a href="contact.jsp">Contact</a></li>
    </ul>
 
    <ul class="vertical-nav">
        <li><a href="#">Academic Calender</a></li>
        <li><a href="schedule">Schedule Training</a></li>
        <li><a href="viewSchedule">View Scheduled Trainings</a></li>
        <li><a href="traineeNotification">Trainee Notification</a></li>
        <li><a href="applyTrainee">Apply Trainee</a></li>
    </ul>
    
    	 <script>
                // Replace 'example.xlsx' with the path to your Excel file
                var excelFileURL = './AcademicCalender.xlsx';

                fetch(excelFileURL)
                    .then(function (response) {
                        return response.arrayBuffer();
                    })
                    .then(function (data) {
                        var workbook = XLSX.read(data, { type: 'array' });

                        // Assuming you want to display the first sheet's data
                        var firstSheetName = workbook.SheetNames[0];
                        var worksheet = workbook.Sheets[firstSheetName];
                        var excelData = XLSX.utils.sheet_to_json(worksheet, { header: 1 });

                        // Display the Excel data
                        var tableHTML = '<table class="table table-striped table-bordered">';
                        for (var i = 0; i < excelData.length; i++) {
                            tableHTML += '<tr>';
                            for (var j = 0; j < excelData[i].length; j++) {
                                tableHTML += '<td>' + excelData[i][j] + '</td>';
                            }
                            tableHTML += '</tr>';
                        }
                        tableHTML += '</table>';

                        document.getElementById('excelData').innerHTML = tableHTML;
                    })
                    .catch(function (error) {
                        console.error('Error loading Excel file:', error);
                    });
            </script>
</body>
</html>